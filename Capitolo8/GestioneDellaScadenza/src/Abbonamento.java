import java.time.LocalDate;

public class Abbonamento extends Prodotto{
    private int durataMesi;

    public Abbonamento(String codiceIdentificativo, LocalDate dataCreazione, int durataMesi) {
        super(codiceIdentificativo, dataCreazione);
        this.durataMesi = durataMesi;
    }

    @Override
    public LocalDate dataScadenza() {
        return getDataCreazione().plusMonths(durataMesi);
    }

    @Override
    public String toString() {
        return "Abbonamento{" +
                "durataMesi=" + durataMesi +
                '}';
    }
}
