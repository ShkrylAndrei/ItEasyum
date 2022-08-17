package info.shkryl.bean;

public class Window {
    private String width;
    private String height;

    public Window(String width, String height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Window{" +
                "width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
