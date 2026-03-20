import java.util.Scanner;

public class Registro {
    private String[] studenti;
    private double[][] voti;
    Scanner sc = new Scanner(System.in);
    private int numStudenti;
    private int numVoti;

    public String[] getStudenti() {
        return studenti;
    }

    public void setStudenti(String[] studenti) {
        this.studenti = studenti;
    }

    public double[][] getVoti() {
        return voti;
    }

    public void setVoti(double[][] voti) {
        this.voti = voti;
    }

    public int getNumStudenti() {
        return numStudenti;
    }

    public void setNumStudenti(int numStudenti) {
        this.numStudenti = numStudenti;
    }

    public int getNumVoti() {
        return numVoti;
    }

    public void setNumVoti(int numVoti) {
        this.numVoti = numVoti;
    }

    public Registro() {
        System.out.println("Numero di studenti: ");
        numStudenti = sc.nextInt();
        System.out.println("Numero di voti: ");
        numVoti = sc.nextInt();

    }

    public void inserisciVoti() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nome dello studente: ");

    }
}
