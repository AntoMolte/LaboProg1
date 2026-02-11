public class ElectricTruck extends ElectricVehicle {
    private int cargoWeight; // peso del carico in kg

    public ElectricTruck(String model, int batteryLevel, int cargoWeight) {
        super(model, batteryLevel);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public String drive() {
        return "Heavy transport moving " + cargoWeight + " kg...";
    }

    public int getCargoWeight() {
        return cargoWeight;
    }
}

