public class MacBook implements Laptop {
    private int volume = 70;

    public void powerOn() {
        System.out.println("MacBook menyala dengan suara khas Apple...");
    }

    public void powerOff() {
        System.out.println("MacBook mati.");
    }

    public void volumeUp() {
        volume += 15;
        System.out.println("Volume MacBook: " + volume);
    }

    public void volumeDown() {
        volume -= 15;
        System.out.println("Volume MacBook: " + volume);
    }
}
