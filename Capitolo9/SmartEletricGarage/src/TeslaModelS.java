public class TeslaModelS extends ElectricVehicle implements Autonomous {

    public TeslaModelS(String model, int batteryLevel) {
        super(model, batteryLevel);
    }

    @Override
    public String drive() {
        return "Silent acceleration...";
    }

    @Override
    public boolean canActivateAutopilot() {
        return getBatteryLevel() >= MIN_BATTERY_FOR_AUTOPILOT;
    }
}
