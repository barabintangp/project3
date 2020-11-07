package tebak.angka01;
import java.util.Scanner;

public class TebakAngka01 {
    int tebak(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tebakan Anda : ");
        int tebakan = input.nextInt();
        return tebakan;
    }
}