public class Robot {
    private String modelName;
    private double batteryLevel;
    private String status;

    public Robot(String modelName, double batteryLevel, String status) {
        this.modelName = modelName;
        this.batteryLevel = batteryLevel;
        this.status = status;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayRobotInfo() {
        System.out.println("(" + modelName + ", " + batteryLevel + ", " + status + ")");
    }

    public boolean isBatteryEnough(int requiredAmount) {
        if (batteryLevel >= requiredAmount) {
            return true;
        }
        return false;
    }

    public void consumeBattery(int amount) {
        batteryLevel -= amount;
    }

    public void chargeBattery(int amount) {
        batteryLevel += amount;
        if (batteryLevel >= 100) {
            setStatus("Active");
        }
        setStatus("Charging");
    }

}
