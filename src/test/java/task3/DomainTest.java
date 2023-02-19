package task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DomainTest {
    static Crater crater;
    static Person person1;
    static Person person2;
    static Mountain mountain;
    static AbstractPiece meatPiece1;
    static AbstractPiece meatPiece2;
    static AbstractPiece randomPiece;

    @BeforeAll
    public static void createAll() {
        crater = new Crater(235);
        person1 = new Person("Чел0");
        person2 = new Person("Чел1");
        mountain = new Mountain("Гора", "Кольцо", crater);
        meatPiece1 = new MeatPiece(23);
        meatPiece2 = new MeatPiece(10);
        randomPiece = new RandomPiece(999999);
    }

    @Test
    public void craterCheck() {
        assertEquals(crater.getDiameter(), 235);
    }

    @Test
    public void mountainCheck() {
        assertEquals(mountain.getShape(), "Кольцо");
        assertEquals(mountain.getName(), "Гора");
        assertEquals(mountain.getCrater(), crater);
    }

    @Test
    public void peopleCheck() {
        assertEquals(person1.getName(), "Чел0");
        assertEquals(person1.getState(), "Undefined");
        person1.walk();
        assertEquals(person1.getState(), "Walking");
        person1.stop();
        assertEquals(person1.getState(), "Standing");
        person1.think(meatPiece1);
        assertEquals(person1.getState(), "Shocked");
        person1.think(randomPiece);
        assertEquals(person1.getState(), "Normal");
        person1.think(meatPiece2);
        assertEquals(person1.getState(), "Shocked");

        assertEquals(person2.getName(), "Чел1");
        assertEquals(person2.getState(), "Undefined");
        person2.walk();
        assertEquals(person2.getState(), "Walking");
        person2.stop();
        assertEquals(person2.getState(), "Standing");
        person2.think(meatPiece1);
        assertEquals(person2.getState(), "Shocked");
        person2.think(randomPiece);
        assertEquals(person2.getState(), "Normal");
        person2.think(meatPiece2);
        assertEquals(person2.getState(), "Shocked");
    }

    @Test
    public void pieceCheck() {
        meatPiece1.setState();
        assertEquals(meatPiece1.getMass(), 23);
        assertEquals(meatPiece1.getColor(), "Black and red");
        assertEquals(meatPiece1.getState(), "Wet");

        meatPiece2.setState();
        assertEquals(meatPiece2.getMass(), 10);
        assertEquals(meatPiece2.getColor(), "Black and red");
        assertEquals(meatPiece2.getState(), "Wet");

        randomPiece.setState();
        assertEquals(randomPiece.getMass(), 999999);
        assertEquals(randomPiece.getColor(), "Random");
        assertEquals(randomPiece.getState(), "...");
    }
}
