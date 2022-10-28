package View;

import java.util.ArrayList;
import java.util.Scanner;

public class Tiktoks {
    Idolview idolview = new Idolview();
    Songview songview = new Songview();
public void inputTiktok(Scanner scanner){
    ArrayList<Idol>idols = new ArrayList<>();
    ArrayList<Song>songs = new ArrayList<>();
    Idol idol =idolview.inputIdol(scanner);
    Song song = songview.inputSong(scanner);
    idols.add(idol);
    songs.add(song);
    TIktok tIktok = new TIktok();
    tIktok.setIdols(idols);
    tIktok.setSongs(songs);

    System.out.println(tIktok.toString());
}
}
