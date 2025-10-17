//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for(String arg : args) {
            String num = arg;
            try{
                int numero = Integer.parseInt(num);
                int numero2= numero * numero;
                System.out.println(numero + " --> quadrato: " numero2);
            }
        }
    }
}