import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //Creato oggetto scanner

        int eta = 0;
        String nome = "";
        String cognome = "";
        try{

            System.out.print("Inserisci il tuo nome: ");
            nome = input.nextLine(); //Letto input da tastiera e salvato nella linea successiva

            System.out.print("Inserisci il tuo cognome: ");
            cognome = input.nextLine();

            System.out.print("Inserisci la tua età: ");
            eta = input.nextInt();
        }catch(InputMismatchException ime){
            System.out.println("L'età da inserire in formato numerico");
        }



        System.out.println("Nome: " + nome + " Cognome: " + cognome + " età:" + eta);
    }
}