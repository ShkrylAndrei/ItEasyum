package info.shkryl.bean;

public class Wall {
    private String color;

    public Wall(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "color='" + color + '\'' +
                '}';
    }
}
