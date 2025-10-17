import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(String arg : args) {
            String codice =arg;
            int lungCodice = codice.length();
            String subString = codice.substring(0,5);
            String numeri = codice.substring(5,lungCodice);
            int lunghezzaNum = numeri.length();
            if (subString.equals("PROD-")){
                if(lunghezzaNum == 4){
                    try{
                        System.out.println("Codice valido:" + codice);
                        int numeriEffettivi = Integer.parseInt(numeri);
                    }catch (NumberFormatException nfe){
                        System.out.println("Codice non valido: " + codice);
                        System.out.println("Motivo: Il codice deve contenere almeno 4 cifre numeriche dopo 'PROD-'.");
                    }
                }
            }else{
                System.out.println("Codice non valido: " + codice);
                System.out.println("Motivo: Il codice deve iniziare con 'PROD-'.");
            }
        }
    }
}