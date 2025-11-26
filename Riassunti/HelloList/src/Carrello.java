import java.util.ArrayList;

public class Carrello {
    private String nome;
    private ArrayList<Alimento> alimenti;

    public Carrello(String nome) {
        this.nome = nome;
        alimenti = new ArrayList<>();
    }

    public void AggiungiAlimento(Alimento alimento) {
        alimenti.add(alimento);
    }

    public void AggiungiAlimento(String nome, String Categoria, String dataScadenza, int quantita){
        alimenti.add(new Alimento(nome, Categoria, dataScadenza, quantita));
    }

    public void RimuoviAlimento(Alimento alimento){
        alimenti.remove(alimento);
    }
}
