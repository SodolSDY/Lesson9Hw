package task1;

public class Device {
    String manufacturer;
    String serialNumber;
    float price;

    public Device(String manufacturer, String serialNumber, float price) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
class Monitor extends Device{
    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, String serialNumber, float price, int resolutionX, int resolutionY) {
        super(manufacturer, serialNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }
}
class EthernetAdapter{
    int speed;
    String mac;

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }
}