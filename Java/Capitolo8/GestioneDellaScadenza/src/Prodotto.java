import java.time.LocalDate;
import java.util.Objects;

public abstract class Prodotto {
    private String codiceIdentificativo;
    private LocalDate dataCreazione;

    public Prodotto(String codiceIdentificativo, LocalDate dataCreazione) {
        this.codiceIdentificativo = codiceIdentificativo;
        this.dataCreazione = dataCreazione;
    }

    public String getCodiceIdentificativo() {
        return codiceIdentificativo;
    }

    public LocalDate getDataCreazione() {
        return dataCreazione;
    }

    public abstract LocalDate dataScadenza();

    public boolean isScaduto(){
        return dataScadenza().isBefore(LocalDate.now());
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codiceIdentificativo='" + codiceIdentificativo + '\'' +
                ", dataCreazione=" + dataCreazione +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return Objects.equals(codiceIdentificativo, prodotto.codiceIdentificativo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codiceIdentificativo);
    }
}
