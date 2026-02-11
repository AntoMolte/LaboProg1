abstract class ElectricVehicle {
    private String model;
    private int batteryLevel;

    public ElectricVehicle(String model, int batteryLevel) {
        this.model = model;
        if (batteryLevel > 100 || batteryLevel < 0) {
            throw new IllegalArgumentException("Battery level must be between 0 and 100");
        }else{
            this.batteryLevel = batteryLevel;
        }
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int charge(int amount) {
        if (amount > 0) {
            batteryLevel += amount;
            if (batteryLevel > 100) {
                batteryLevel = 100;
            }
        }

        return batteryLevel;
    }

    abstract String drive();
}
