public class Alimento {
    private String nome;
    private String categoria;
    private String dataScadenza;
    private int quantita;

    public Alimento(String nome, String categoria, String dataScadenza, int quantita) {
        this.nome = nome;
        this.categoria = categoria;
        this.dataScadenza = dataScadenza;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", dataScadenza='" + dataScadenza + '\'' +
                ", quantita=" + quantita +
                '}';
    }


}
