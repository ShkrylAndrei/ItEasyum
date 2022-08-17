package info.shkryl.bean;

public class House {
    private Window window;
    private Door door;
    private Wall wall;

    public House(Window window, Door door, Wall wall) {
        this.window = window;
        this.door = door;
        this.wall = wall;
    }

    @Override
    public String toString() {
        return "House{" +
                "window=" + window +
                ", door=" + door +
                ", wall=" + wall +
                '}';
    }
}
