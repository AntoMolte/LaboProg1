import java.time.LocalDate;

abstract class Prenotazione implements Documentabile{
    private String codiceVolo;
    private LocalDate dataPartenza;
    private double prezzoBase;

    public Prenotazione(String codiceVolo, LocalDate dataPartenza, double prezzoBase) {
        StringBuilder str = new StringBuilder(codiceVolo);
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        String numeroCod = str.substring(2, 5);

        if (!Character.isLetter(c1) || !Character.isLetter(c2)) {
            throw new IllegalArgumentException("Le prime due posizioni del codice volo devono essere lettere");
        }

        try {
            int numero = Integer.parseInt(numeroCod);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("La parte numerica del codice volo deve essere un numero valido");
        }
        this.codiceVolo = codiceVolo;

        if (dataPartenza == null || dataPartenza.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException(
            );
        }

        if (prezzoBase <= 0) {
            throw new IllegalArgumentException(
            );
        }
        this.prezzoBase = prezzoBase;

    }

    public String getCodiceVolo() {
        return codiceVolo;
    }

    public void setCodiceVolo(String codiceVolo) {
        StringBuilder str = new StringBuilder(codiceVolo);
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        String numeroCod = str.substring(2, 5);

        if (!Character.isLetter(c1) || !Character.isLetter(c2)) {
            throw new IllegalArgumentException("Le prime due posizioni del codice volo devono essere lettere");
        }

        try {
            int numero = Integer.parseInt(numeroCod);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("La parte numerica del codice volo deve essere un numero valido");
        }
        this.codiceVolo = codiceVolo;
    }

    public LocalDate getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(LocalDate dataPartenza) {
        if (dataPartenza == null || dataPartenza.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException(
            );
        }
        this.dataPartenza = dataPartenza;
    }

    public double getPrezzoBase() {
        return prezzoBase;
    }

    public void setPrezzoBase(double prezzoBase) {
        if (prezzoBase <= 0) {
            throw new IllegalArgumentException(
            );
        }
        this.prezzoBase = prezzoBase;
    }

    abstract double calcolaCostoTotale();
}
