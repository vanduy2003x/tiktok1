package View;

import java.util.Scanner;

public class Songview {
    public Song inputSong(Scanner scanner) {
        System.out.println(" ID Bài Hát");
        int idsong = scanner.nextInt();

        System.out.println("Tên Bài hát");
        String namesong = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Tên ca sĩ");
        String namesinger = scanner.nextLine();
        Song songs = new Song(idsong,namesong,namesinger);
        return songs;
    }
}
