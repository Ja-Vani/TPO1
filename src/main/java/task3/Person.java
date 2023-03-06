package task3;

public class Person {
    final private String name;
    private String state;

    public Person(final String name) {
        this.name = name;
        this.state = "Undefined";
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public void walk() {
        this.state = "Walking";
    }

    public void stop() {
        this.state = "Standing";
    }

    public void think(final AbstractPiece piece) {
        if (piece instanceof MeatPiece) {
            this.state = "Shocked";
        } else {
            this.state = "Normal";
        }
    }
}
