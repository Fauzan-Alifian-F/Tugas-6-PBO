public class Toshiba implements Laptop {
    private int volume = 30;

    public void powerOn() {
        System.out.println("Laptop Toshiba menyala...");
    }

    public void powerOff() {
        System.out.println("Laptop Toshiba mati...");
    }

    public void volumeUp() {
        volume += 5;
        System.out.println("Volume Toshiba: " + volume);
    }

    public void volumeDown() {
        volume -= 5;
        System.out.println("Volume Toshiba: " + volume);
    }
}
