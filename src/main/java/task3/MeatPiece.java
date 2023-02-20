package task3;

public class MeatPiece extends AbstractPiece {

    public MeatPiece(final int mass) {
        super(mass, "Black and red");
        setState();
    }

    @Override
    public void setState() {
        this.state = "Wet";
    }
}
