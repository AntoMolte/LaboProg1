public class Rettangolo extends Forma{
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        if(base<=0){
            throw new IllegalArgumentException("ERRORE");
        }else{this.base = base;}
        if(altezza<=0){
            throw new IllegalArgumentException("ERRORE");
        }else{this.altezza = altezza;}
    }

    @Override
    public double area() {
        return base * altezza;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altezza);
    }
}
