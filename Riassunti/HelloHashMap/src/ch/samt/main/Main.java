package ch.samt.main;
import ch.samt.dictonary.Dictonary;
import ch.samt.dictonary.Entry;

public class Main {
    public static void main(String[] args) {
        Dictonary dizionario = new Dictonary();
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