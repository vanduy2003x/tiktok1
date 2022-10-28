package View;

import java.util.Scanner;

public class Idolview {
    FollwerView follwerView = new FollwerView();
    public Idol inputIdol(Scanner scanner){
        System.out.println("Tên IDOL");
        String nameidol= scanner.nextLine();
        System.out.println("Số ID");
        int soid =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Email");
        String email=scanner.nextLine();
        Idol idol = new Idol(nameidol,soid,email,100000);
        return idol;
    }
}
