package View;

public class Song {
    private int id;
    private String name;
    private String singger;

    public int getId() {
        return id;
    }

    public Song(int id, String name, String singger) {
        this.id = id;
        this.name = name;
        this.singger = singger;
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

    public String getSingger() {
        return singger;
    }

    public void setSingger(String singger) {
        this.singger = singger;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singger='" + singger + '\'' +
                '}';
    }
}
