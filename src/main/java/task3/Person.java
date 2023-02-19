package task3;

public class Person {
    private String name;
    private String state;

    public Person(String name) {
        this.name = name;
        this.state = "Undefined";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void walk() {
        System.out.println(this.name + " is walking...");
        this.state = "Walking";
    }

    public void stop() {
        System.out.println(this.name + " stopped walking.");
        this.state = "Standing";
    }

    public void think(AbstractPiece piece) {
        if (piece instanceof MeatPiece) {
            System.out.println(this.name + " realizes that the piece is meat...");
            this.state = "Shocked";
        } else {
            System.out.println("Nothing...");
            this.state = "Normal";
        }
    }
}
