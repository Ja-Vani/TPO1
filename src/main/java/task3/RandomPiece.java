package task3;

public class RandomPiece extends AbstractPiece {
    public RandomPiece(final int mass) {
        super(mass, "Random");
        setState();
    }

    @Override
    public void setState() {
        this.state = "random";
    }
}
