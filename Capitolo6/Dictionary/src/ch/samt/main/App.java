package ch.samt.main;
import ch.samt.dictionary.Dictionary;
import ch.samt.dictionary.Entry;

public class App {
    public static void main(String[] args) {
        Dictionary dizionario = new Dictionary();
        Entry Gatto = new Entry("Gatto", "Cat");
        Entry Cane = new Entry("Cane", "Dog");
        Entry Maiale= new Entry("Maiale", "Pig");
        Entry Elefante = new Entry("Elefante","Elefant");
        dizionario.aggiungi(Cane);
        dizionario.aggiungi(Gatto);
        dizionario.aggiungi(Maiale);
        dizionario.aggiungi(Elefante);

       dizionario.cerca("Elefante");
       dizionario.stampaTutto();
    }
}
