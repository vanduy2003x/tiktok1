package View;

import java.util.Scanner;

public class FollwerView {
    public Follower inputFollwer(Scanner scanner) {
            System.out.println("ID");
            int id = scanner.nextInt();
            System.out.println("Tên");
            String name = scanner.nextLine();
            Follower follower = new Follower(id, name);
        return follower;
    }
}
