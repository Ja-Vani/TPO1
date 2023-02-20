package task3;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    private Person person1;
    private Person person2;
    private Mountain mountain;
    private List<AbstractPiece> pieces;

    public Logic() {
        person1 = new Person("Чел0");
        person2 = new Person("Чел1");
        Crater crater = new Crater(235);
        mountain = new Mountain("Гора", "Кольцо", crater);
        pieces = new ArrayList<>(List.of(new MeatPiece(23), new MeatPiece(10), new RandomPiece(999999)));
    }

    public Logic(final Person person1, final Person person2, final Mountain mountain, final List<AbstractPiece> pieces) {
        this.person1 = person1;
        this.person2 = person2;
        this.mountain = mountain;
        this.pieces = pieces;
    }

    public String walkAll() {
        this.person1.walk();
        this.person2.walk();
        return person1.getName() + " " + person2.getName() + " walking";
    }

    public String stopAll() {
        this.person1.stop();
        this.person2.stop();
        return person1.getName() + " " + person2.getName() + " stopped";
    }

    public String checkMount() {
        String info = "";
        if (mountain.getCrater() != null) {
            info = " with crater diameter " + mountain.getCrater().getDiameter();
        }
        return walkAll() + " and saw " + mountain.getShape() + info;
    }

    public String checkPieces() {
        String info = "";

        for (AbstractPiece piece : pieces) {
            person1.think(piece);
            person2.think(piece);
            if (person1.getState().equals("Shocked")) {
                info += "Meat is " + piece.getState() + ". ";
            } else {
                info += "Piece is " + piece.getState() + ". ";
            }
        }

        return stopAll() + " and thinking " + info;
    }
}
