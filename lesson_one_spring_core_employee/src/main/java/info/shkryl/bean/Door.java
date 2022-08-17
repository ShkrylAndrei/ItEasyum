package info.shkryl.bean;

public class Door {
    private Integer size;

    public Door(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Door{" +
                "size='" + size + '\'' +
                '}';
    }
}
