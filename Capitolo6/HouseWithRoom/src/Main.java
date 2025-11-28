//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.aggiungiStanza("camera da letto", 68.8);
        house.visualizzaStanze();
        house.getSupercieTotale();
    }
}