// Main program: SmartHomeMain.java

// Base class Device
class Device {
    // Attributes
    protected String deviceName;
    protected String status; // only accepts "ON" or "OFF"
    protected String location;

   
    protected static int deviceCount = 0;

    
    public Device() {
        this.deviceName = "Unknown Device";
        this.status = "OFF";
        this.location = "Unknown Location";
        deviceCount++;
    }

    
    public Device(String deviceName, String status, String location) {
        this.deviceName = deviceName;
        if (status.equals("ON") || status.equals("OFF"))
            this.status = status;
        else
            this.status = "OFF"; // default to OFF if invalid input
        this.location = location;
        deviceCount++;
    }

   
    public void turnOn() {
        this.status = "ON";
    }

    public void turnOff() {
        this.status = "OFF";
    }

    public void displayInfo() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("Status: " + status);
        System.out.println("Location: " + location);
    }

    
    public static void showDeviceCount() {
        System.out.println("Total devices created: " + deviceCount);
    }
}
