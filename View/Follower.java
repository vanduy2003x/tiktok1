package View;

import java.util.ArrayList;

public class Follower {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Follower(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
