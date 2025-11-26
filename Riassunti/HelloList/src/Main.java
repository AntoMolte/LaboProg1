import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carrello c1 = new Carrello("Spesa");

        Alimento pasta = new Alimento("Tagliatelle", "Pasta", "02.02.2056", 4);
        c1.AggiungiAlimento(pasta);


    }
}