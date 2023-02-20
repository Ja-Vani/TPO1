package task3;

public class MeatPiece extends AbstractPiece {
    public MeatPiece(final int mass) {
        super(mass, "Black and red");
    }

    @Override
    public void setState() {
        this.state = "Wet";
    }
}
