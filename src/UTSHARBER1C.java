import java.util.Scanner;

public class UTSHARBER1C {
    public static void main(String[] args) {
        System.out.println("Masukan Angka = ");
        Scanner inputAngka = new Scanner(System.in);
        int angka = inputAngka.nextInt();
        String status;
        if(angka % 2 == 0){
            status = " Valid ";
        }else{
            status = " Invalid ";
        }
        System.out.println(angka + status);
    }
}
