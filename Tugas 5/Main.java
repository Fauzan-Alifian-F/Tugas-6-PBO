import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop;

        System.out.println("Pilih Laptop [1] Lenovo [2] Toshiba [3] MacBook: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                laptop = new Lenovo();
                break;
            case 2:
                laptop = new Toshiba();
                break;
            case 3:
                laptop = new MacBook();
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
                return;
        }

        LaptopUser user = new LaptopUser(laptop);

        String input;
        do {
            System.out.print("Perintah (ON/OFF/UP/DOWN/EXIT): ");
            input = scanner.next().toUpperCase();

            switch (input) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilent();
                    break;
                case "EXIT":
                    System.out.println("Keluar program.");
                    break;
                default:
                    System.out.println("Perintah tidak dikenal.");
            }
        } while (!input.equals("EXIT"));

        scanner.close();
    }
}
