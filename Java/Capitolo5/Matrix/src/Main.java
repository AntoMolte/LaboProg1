//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Matrice matrice = new Matrice(2,2);

        matrice.popolaMatrice();
        matrice.getCella(1,0);
        matrice.setCella(1,0,1);
        matrice.stampaMatrice();
    }
}