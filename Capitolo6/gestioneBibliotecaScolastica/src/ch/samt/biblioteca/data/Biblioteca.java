package ch.samt.biblioteca.data;
import java.util.*;

import ch.samt.biblioteca.model.ItemBiblioteca;
import ch.samt.biblioteca.model.Libro;

public class Biblioteca {
    ArrayList<ItemBiblioteca> catalogo;
    Set<String> codiciUsati;
    Map<String, ArrayList<ItemBiblioteca>> elementiPerAutore;
    Queue<ItemBiblioteca> prenotazioniFIFO;
    Stack<ItemBiblioteca> consegneUrgentiLIFO;

    public Biblioteca() {
        catalogo = new ArrayList<>();
        codiciUsati = new HashSet<>();
        elementiPerAutore = new HashMap<>();
        prenotazioniFIFO = new LinkedList<>();
        consegneUrgentiLIFO = new Stack<>();
    }

    public boolean aggiungiItem(ItemBiblioteca item) {
        String autore = "";
        if(item instanceof Libro){
            Libro libro = (Libro)item;
            autore = libro.getAutore();
        }
        if(!elementiPerAutore.containsKey(autore)){
            elementiPerAutore.put(autore, new ArrayList<>());
        }
        ArrayList<ItemBiblioteca> lista = elementiPerAutore.get(autore);
        lista.add(item);

        if(codiciUsati.contains(item.getCodice())){
            System.out.println("Item " + item + " already exists");
            return false;
        }else{
            codiciUsati.add(item.getCodice());
            catalogo.add(item);

            return true;
        }
    }

    public ArrayList<ItemBiblioteca> getCatalogo(){
        for(ItemBiblioteca item : catalogo){
            System.out.println(item);
        };
        return catalogo;
    }

    public ArrayList<ItemBiblioteca> getElementiDiAutore(String autore){
        return elementiPerAutore.get(autore);
    }

    public void aggiungiPrenotazioneFIFO(ItemBiblioteca item){
        prenotazioniFIFO.add(item);
    }

    public ItemBiblioteca prossimaPrenotazioneFIFO(){
        System.out.println(prenotazioniFIFO.peek());
        return prenotazioniFIFO.peek();
    }

    public void aggiungiConsegnaUrgenteLIFO(ItemBiblioteca item){
        consegneUrgentiLIFO.add(item);
    }

    public ItemBiblioteca prossimaConsegnaLIFO(){
        System.out.println(consegneUrgentiLIFO.peek());
        return consegneUrgentiLIFO.peek();
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "catalogo=" + catalogo +
                ", codiciUsati=" + codiciUsati +
                ", elementiPerAutore=" + elementiPerAutore +
                ", prenotazioniFIFO=" + prenotazioniFIFO +
                ", consegneUrgentiLIFO=" + consegneUrgentiLIFO +
                '}';
    }
}
