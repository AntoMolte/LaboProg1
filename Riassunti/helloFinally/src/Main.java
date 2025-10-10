//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Cicliamo args per verificare se sono presenti solo numeri
        for(String arg : args) {
            try {
                double numero = Double.parseDouble(arg);
                System.out.println(numero);
            }catch(NumberFormatException nfe) {
                System.out.println("non è un numero");
            }finally {
                System.out.println("Operazione andata a buon fine");
            }


        }
    }
}