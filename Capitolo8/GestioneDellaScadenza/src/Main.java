import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Prodotto> prodotti = new ArrayList();

        Libro l1 = new Libro("ABC123", 2025-12-10, 5);
        Abbonamento b1 = new Abbonamento("ABC1234", 2025-12-19, 10);
        prodotti.add(l1);
        prodotti.add(b1);

        for (Prodotto p : prodotti) {
            System.out.println(p.toString());
        }

        for (Prodotto p : prodotti) {
            if(p.isScaduto()){
                System.out.println(p.toString());
            }else{
                continue;
            }
        }
    }
}