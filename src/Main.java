import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tongLai = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhap so tien cho vay: ");
        int tienVay = scanner.nextInt();

        System.out.printf("Nhap ti le lai suat: ");
        double laiSuat = scanner.nextDouble();

        System.out.printf("Nhap so thang vay: ");
        double thangVay = scanner.nextDouble();

        for(int i = 0; i < thangVay; i++){
            tongLai += tienVay * (laiSuat / 100) / 12 * thangVay;
        }
        System.out.printf("Tong tien lai: %f", tongLai);
    }
}