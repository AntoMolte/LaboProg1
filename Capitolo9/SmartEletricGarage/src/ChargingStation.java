public class ChargingStation {
    private String stationId;
    private int powerOutput;

    public ChargingStation(String stationId, int powerOutput) {
        this.stationId = stationId;
        this.powerOutput = powerOutput;
    }

    @Override
    public String toString() {
        return "Station " + stationId + " (" + powerOutput + " kW)";
    }
}
