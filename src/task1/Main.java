package task1;

public class Main {
    public static void main(String[] args) {
Device device = new Device("Samsung","AB1355964FB", 6300);
Monitor monitor = new Monitor("Samsung","AB 46846541FB", 6300, 1920, 1080);

        System.out.println(device.toString());
        System.out.println(monitor.toString());

        System.out.println(device.equals(monitor));
        System.out.println(device.hashCode());
        System.out.println(monitor.hashCode());
    }
}
