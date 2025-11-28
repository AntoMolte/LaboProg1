import java.util.ArrayList;

public class House {
    private ArrayList<Room> stanze;
    private double superficieTot;

    public House() {
        stanze = new ArrayList<>();
    }

    public void aggiungiStanza(String nome, double superficieMq){
        stanze.add(new Room(nome, superficieMq));
    }

    public void visualizzaStanze(){
        if(stanze.size() == 0){
            System.out.println("La casa è vuota.");
        }else{
            for (Room room : stanze) {
                System.out.println(room.getNome());
            }
        }
    }

    public void getSupercieTotale(){
        if(stanze.size() == 0){
            System.out.println("No Supercie.");
        }else{
            for (Room room : stanze) {
                superficieTot += room.getSuperficieMq();;
            }
        }
        System.out.println("Supercie: " + superficieTot);
    }

    @Override
    public String toString() {
        return "House{" +
                "stanze=" + stanze +
                '}';
    }
}
