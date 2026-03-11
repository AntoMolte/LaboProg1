public class Cerchio extends Forma{
    private double raggio;

    public Cerchio(double raggio) {
        if(raggio <=0){
            throw new IllegalArgumentException("ERRORE");
        }else{this.raggio = raggio;}
    }

    @Override
    public double area() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raggio;
    }
}
