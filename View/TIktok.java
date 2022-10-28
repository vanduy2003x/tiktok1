package View;

import java.util.ArrayList;

public class TIktok {
    private ArrayList<Idol> idols;
    private ArrayList<Song>songs;


    public TIktok(ArrayList<Idol> idols, ArrayList<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public ArrayList<Idol> getIdols() {
        return idols;
    }

    public void setIdols(ArrayList<Idol> idols) {
        this.idols = idols;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public TIktok() {
    }

    @Override
    public String toString() {
        return "TIktok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
