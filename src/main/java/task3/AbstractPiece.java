package task3;

abstract public class AbstractPiece {
    final private int mass;
    final private String color;
    protected String state;

    public AbstractPiece(final int mass, final String color) {
        this.mass = mass;
        this.color = color;
    }

    public int getMass() {
        return mass;
    }

    public String getColor() {
        return color;
    }

    public String getState() {
        return state;
    }

    abstract public void setState();
}
