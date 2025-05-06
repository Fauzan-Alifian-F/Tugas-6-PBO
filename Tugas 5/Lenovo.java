public class Lenovo implements Laptop {
    private int volume = 50;

    public void powerOn() {
        System.out.println("Laptop Lenovo menyala...");
    }

    public void powerOff() {
        System.out.println("Laptop Lenovo mati...");
    }

    public void volumeUp() {
        volume += 10;
        System.out.println("Volume Lenovo: " + volume);
    }

    public void volumeDown() {
        volume -= 10;
        System.out.println("Volume Lenovo: " + volume);
    }
}
