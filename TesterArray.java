package toko;
import java.util.Scanner;

public class TesterArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan Berapa data: ");
        int data = s.nextInt();
        
        System.out.println("Pilih product: ");
        System.out.println("1. DVD\n2. CD");
        int pilihan = s.nextInt();
        s.nextLine();

        product[] product = new product[20];

        for (int i = 0; i < data; i++) {
            switch (pilihan) {

                case 1:
                System.out.println("Masukkan name: ");
                String name = s.nextLine();
                System.out.println("Masukkan number: ");
                int number = s.nextInt();
                System.out.println("Masukkan quantity: ");
                int quantity = s.nextInt();
                System.out.println("Masukkan price: ");
                double price = s.nextDouble();
                s.nextLine();

                product[0] = new product(number, quantity, name, price);
                product[0].print();
                break;

                case 2:
                System.out.println("Masukkan name: ");
                name = s.nextLine();
                System.out.println("Masukkan number: ");
                number = s.nextInt();
                System.out.println("Masukkan quantity: ");
                quantity = s.nextInt();
                System.out.println("Masukkan price: ");
                price = s.nextDouble();
                s.nextLine();

                product[1] = new product(number, quantity, name, price);
                product[1].print();

                break;

                default:
                System.out.println("Pilihan tidak ada");

            }
        }
    }
}