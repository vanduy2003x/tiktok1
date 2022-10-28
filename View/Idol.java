package View;

import java.util.ArrayList;

public class Idol {
    private String name;
    private int id;
    private  String email;
    private int followers;

    public Idol(String name, int id, String email, int followers) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.followers = followers;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                '}';
    }
}
