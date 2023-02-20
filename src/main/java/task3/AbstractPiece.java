package task3;

abstract public class AbstractPiece {
    private int mass;
    private String color;
    protected String state;

    public AbstractPiece(final int mass, final String color) {
        this.mass = mass;
        this.color = color;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(final int mass) {
        this.mass = mass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getState() {
        return state;
    }

    abstract public void setState();
}
