package ch.samt.biblioteca.app;
import ch.samt.biblioteca.model.*;
import ch.samt.biblioteca.data.*;
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Dvd dvd1=new Dvd("Codice1", "Film1", 2000, "Scaffale1", "Antonio", 134);
        Libro l1 = new Libro("Codice2", "Libro1", 2010, "Scaffale2","Leonardo", 123);
        Libro l2 = new Libro("Codice2", "Libro1", 2010, "Scaffale2","Leonardo", 123);
        Libro l3 =  new Libro("Codice3", "Libro1", 2010, "Scaffale2","Giachician", 125);

        biblioteca.aggiungiItem(dvd1);
        biblioteca.aggiungiItem(l1);
        biblioteca.aggiungiItem(l2);
        biblioteca.aggiungiItem(l3);

        biblioteca.getCatalogo();

        System.out.println(biblioteca.getElementiDiAutore("Leonardo"));

        biblioteca.aggiungiPrenotazioneFIFO(l1);
        biblioteca.aggiungiPrenotazioneFIFO(dvd1);
        biblioteca.aggiungiPrenotazioneFIFO(l3);
        biblioteca.prossimaPrenotazioneFIFO();

        biblioteca.aggiungiConsegnaUrgenteLIFO(l1);
        biblioteca.aggiungiConsegnaUrgenteLIFO(dvd1);
        biblioteca.aggiungiConsegnaUrgenteLIFO(l3);
        biblioteca.prossimaConsegnaLIFO();
    }
}