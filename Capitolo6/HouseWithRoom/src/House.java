import java.util.ArrayList;

public class House {
    private ArrayList<Room> stanze;

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
            for (int i = 0; i < stanze.size(); i++) {
                System.out.println(Room.);
            }
        }
    }

    public void getSupercieTotale(){
        if(stanze.size() == 0){
            System.out.println("No Supercie.");
        }else{

        }
    }

    @Override
    public String toString() {
        return "House{" +
                "stanze=" + stanze +
                '}';
    }
}
