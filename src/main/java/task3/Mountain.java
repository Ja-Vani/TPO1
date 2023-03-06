package task3;

public class Mountain {
    final private String name;
    final private String shape;
    final private Crater crater;

    public Mountain(final String name, final String shape, final Crater crater) {
        this.name = name;
        this.shape = shape;
        this.crater = crater;
    }

    public String getName() {
        return name;
    }

    public String getShape() {
        return shape;
    }

    public Crater getCrater() {
        return crater;
    }
}
