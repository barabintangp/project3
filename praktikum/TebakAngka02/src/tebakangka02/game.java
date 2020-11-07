package tebakangka02;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        Random random = new Random();
        TebakAngka02 player = new TebakAngka02();
         int AngkaAcak = random.nextInt(100 - 1) + 1;
        
        System.out.println("Halo ! Silakan tebak angka yang sudah saya siapkan dari 1-100");
        boolean done = false;
        
        while (done == false){
            int tebakan = player.tebak();
            if (tebakan == AngkaAcak){
                System.out.println("Tebakan Anda benar !");
                if (player.totalTebak <= 5){
                    player.bonus();
                }
                System.out.print("Score total : ");
                System.out.println(player.score);
                done = true;
            } else if (tebakan > AngkaAcak){
                System.out.println("Angka terlalu besar, coba lagi !");
                player.kurangi();
                if (!player.ok()){
                    System.out.println("Game Over ! Anda terlalu banyak gagal dalam mencoba");
                    done = true;
                }
            } else if (tebakan < AngkaAcak){
                System.out.println("Angka terlalu kecil, coba lagi");
                player.kurangi();
                if (!player.ok()){
                    System.out.println("Game Over ! Anda terlalu banyak gagal dalam mencoba");
                    done = true;
                }
            }
        }
    }
    
}