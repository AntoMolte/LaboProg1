import java.util.Random;
import java.util.Scanner;

public class Matrice {
    private int righe;
    private int colonne;
    private int[][] matrice;
    private int riga;
    private int colonna;
    private int valore;

    public int getRighe() {
        return righe;
    }

    public void setRighe(int righe) {
        if (righe > 0){
            this.righe = righe;
        }
    }

    public int getColonne() {
        return colonne;
    }

    public void setColonne(int colonne) {
        if (colonne > 0){
            this.colonne = colonne;
        }
    }

    public int[][] getMatrice() {
        return matrice;
    }

    public void setMatrice(int[][] matrice) {
        this.matrice = matrice;
    }

    public int getRiga() {
        return riga;
    }

    public void setRiga(int riga) {
        this.riga = riga;
    }

    public int getColonna() {
        return colonna;
    }

    public void setColonna(int colonna) {
        this.colonna = colonna;
    }

    public Matrice(int righe, int colonne) {
        this.righe = righe;
        this.colonne = colonne;
        this.matrice = new int[righe][colonne];
    }

    public Matrice() {
        this.righe = 5;
        this.colonne = 5;
        this.matrice = new int[righe][colonne];
    }

    public void stampaMatrice(){
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }
    }

    public void popolaMatrice(){
        Random rnd = new Random();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                int r = rnd.nextInt(0,2);
                matrice[i][j] = r;
            }
        }
    }

    public void getCella(int riga, int colonna){
        if(riga>=0 && riga <= this.righe){
            this.riga = riga;
        }else{
            System.out.println("Errore");
        }
        if(colonna>=0 && colonna <= this.colonne){
            this.colonna = colonna;
        }else{
            System.out.println("Errore");
        }
        System.out.println(matrice[riga][colonna]);
    }

    public void setCella(int riga, int colonna, int valore){
        if(riga>=0 && riga <= this.righe){
            this.riga = riga;
        }else{
            System.out.println("Errore");
        }
        if(colonna>=0 && colonna <= this.colonne){
            this.colonna = colonna;
        }else{
            System.out.println("Errore");
        }
        if (valore == 0){
            matrice[riga][colonna] = 0;
        } else if (valore==1) {
            matrice[riga][colonna] = 1;
        } else {
            System.out.println("Errore valore da 0 a 1");
        }
    }
}
