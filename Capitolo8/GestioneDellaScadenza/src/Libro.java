import java.time.LocalDate;

public class Libro extends Prodotto{
    private int durataPrestito;

    public Libro(String codiceIdentificativo, LocalDate dataCreazione, int durataPrestito) {
        super(codiceIdentificativo, dataCreazione);
        this.durataPrestito = durataPrestito;
    }


    @Override
    public LocalDate dataScadenza() {
        return getDataCreazione().plusDays(durataPrestito);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "durataPrestito=" + durataPrestito +
                '}';
    }
}
