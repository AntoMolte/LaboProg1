import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random rnd = new Random();
        Boolean indovina = false;
        int tentativi = 0;
        int indovino = rnd.nextInt(100);
        int n = 0;
        System.out.println("Indovina il numero da 1 e 100");
        while(true){
            try{
                System.out.print("Il tuo tentativo: ");
                n = input.nextInt();
                input.nextLine();
                tentativi = tentativi +1;
                if (n == indovino){
                    System.out.println("Bravo! Hai indovinato in " + tentativi + " tentativi");
                    break;
                }else if (n > indovino){
                    System.out.println("Troppo alto!");
                }else if (n < indovino){
                    System.out.println("Troppo basso!");
                }
            }catch (InputMismatchException ime){
                input.nextLine();
                System.out.println("Valore da inserire in formato numerico");
            }
        }
    }
}