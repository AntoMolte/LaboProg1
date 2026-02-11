public class VoloInternazionale extends Process{
    private  String destinazione;
    private String nomePasseggero;
    private boolean bagaglioStiva;

    public VoloInternazionale(String destinazione, String nomePasseggero, boolean bagaglioStiva) {
        this.destinazione = destinazione;
        this.nomePasseggero = nomePasseggero;
        this.bagaglioStiva = bagaglioStiva;
    }
}
