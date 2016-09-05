package info.devexchanges.snaprecyclerview;

public class App {

    private int drawable;
    private String name;

    public App(String name, int drawable) {
        this.drawable = drawable;
        this.name = name;
    }

    public int getDrawable() {
        return drawable;
    }

    public String getName() {
        return name;
    }
}
