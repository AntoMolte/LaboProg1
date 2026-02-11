import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        int numMag=0;
        int numInArray=0;
        int controlloNum = 0;
        int numDomanda = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi inserire? ");
        int quanti = input.nextInt();
        int[] array = new int[quanti];
        for (int i = 0; i < quanti; i++) {
            numDomanda += 1;
            System.out.print("Inserisci il numero " + numDomanda + ": ");
            int numArrivo = input.nextInt();
            array[i] = numArrivo;
            if(numArrivo>numMag){
                numMag=numArrivo;
            }else{
                numMag=numMag;
            }
        }
        System.out.println("valore massimo");
        System.out.println(numMag);
    }
}