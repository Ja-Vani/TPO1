package task3;

public class Mountain {
    private String name;
    private String shape;
    private Crater crater;

    public Mountain(String name, String shape, Crater crater) {
        this.name = name;
        this.shape = shape;
        this.crater = crater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Crater getCrater() {
        return crater;
    }

    public void setCrater(Crater crater) {
        this.crater = crater;
    }
}
