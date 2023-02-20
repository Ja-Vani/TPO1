package task3;

public class Mountain {
    private String name;
    private String shape;
    private Crater crater;

    public Mountain(final String name, final String shape, final Crater crater) {
        this.name = name;
        this.shape = shape;
        this.crater = crater;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(final String shape) {
        this.shape = shape;
    }

    public Crater getCrater() {
        return crater;
    }

    public void setCrater(final Crater crater) {
        this.crater = crater;
    }
}
