package konversibilangan;
import java.util.Scanner;

public class KonversiBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("PILIH OPERASI KONVERSI BILANGAN:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
            	case 1:
            		System.out.print("Masukkan bilangan biner: ");
            		String binerKeDesimal = scanner.next();
            		System.out.println("Hasil: " + binerToDesimal(binerKeDesimal) + "\n");
            		break;
            	case 2:
            		System.out.print("Masukkan bilangan desimal: ");
            		int desimalKeBiner = scanner.nextInt();
            		System.out.println("Hasil: " + desimalToBiner(desimalKeBiner) + "\n");
            		break;
            	case 3:
            		System.out.print("Masukkan bilangan biner: ");
            		String binerKeHeksadesimal = scanner.next();
            		System.out.println("Hasil: " + binerToHexa(binerKeHeksadesimal) + "\n");
            		break;
            	case 4:
            		System.out.print("Masukkan bilangan heksadesimal: ");
            		String hexaKeBiner = scanner.next();
            		System.out.println("Hasil: " + hexaToBiner(hexaKeBiner) + "\n");
            		break;
            	case 5:
            		System.out.print("Masukkan bilangan desimal: ");
            		int desimalKeHexa = scanner.nextInt();
            		System.out.println("Hasil: " + desimalToHexa(desimalKeHexa) + "\n");
            		break;
            	case 6:
            		System.out.print("Masukkan bilangan heksadesimal: ");
            		String hexaKeDesimal = scanner.next();
            		System.out.println("Hasil: " + hexaToDesimal(hexaKeDesimal) + "\n");
            		break;
            	case 0:
            		System.out.println("Terima kasih!");
            		break;
            	default:
            		System.out.println("Pilihan tidak valid.\n");
            		break;
            }
        } while (pilihan != 0);
        
        scanner.close();
    }

    // Method konversi bilangan biner ke desimal
    public static int binerToDesimal(String biner) {
        return Integer.parseInt(biner, 2);
    }

    // Method konversi bilangan desimal ke biner
    public static String desimalToBiner(int desimal) {
        return Integer.toBinaryString(desimal);
    }

    // Method konversi bilangan biner ke heksadesimal
    public static String binerToHexa(String biner) {
        int desimal = Integer.parseInt(biner, 2);
        return Integer.toHexString(desimal).toUpperCase();
    }

    // Method konversi bilangan heksadesimal ke biner
    public static String hexaToBiner(String hexa) {
        return Integer.toBinaryString(Integer.parseInt(hexa, 16));
    }

    // Method konversi bilangan desimal ke heksadesimal
    public static String desimalToHexa(int desimal) {
        return Integer.toHexString(desimal).toUpperCase();
    }

    // Method konversi bilangan heksadesimal ke desimal
    public static int hexaToDesimal(String hexa) {
        return Integer.parseInt(hexa, 16);
        
    }
}


