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
        assertEquals(235, crater.getDiameter());
        crater.setDiameter(13);
        assertEquals(13, crater.getDiameter());
    }

    @Test
    public void mountainCheck() {
        assertEquals("Кольцо", mountain.getShape());
        assertEquals("Гора", mountain.getName());
        assertEquals(mountain.getCrater(), crater);
        mountain.setName("Перевал");
        mountain.setShape("Круг");
        mountain.setCrater(crater);
        assertEquals("Перевал", mountain.getName());
        assertEquals("Круг", mountain.getShape());
        assertEquals(mountain.getCrater(), crater);
    }

    @Test
    public void peopleCheck() {
        assertEquals("Чел0", person1.getName());
        assertEquals("Undefined", person1.getState());
        person1.walk();
        assertEquals("Walking", person1.getState());
        person1.stop();
        assertEquals("Standing", person1.getState());
        person1.think(meatPiece1);
        assertEquals("Shocked", person1.getState());
        person1.think(randomPiece);
        assertEquals("Normal", person1.getState());
        person1.think(meatPiece2);
        assertEquals("Shocked", person1.getState());

        person2.setName("Чел2");
        assertEquals("Чел2", person2.getName());
        assertEquals("Undefined", person2.getState());
        person2.walk();
        assertEquals("Walking", person2.getState());
        person2.stop();
        assertEquals("Standing", person2.getState());
        person2.think(meatPiece1);
        assertEquals("Shocked", person2.getState());
        person2.think(randomPiece);
        assertEquals("Normal", person2.getState());
        person2.think(meatPiece2);
        assertEquals("Shocked", person2.getState());
    }

    @Test
    public void pieceCheck() {
        meatPiece1.setState();
        assertEquals(23, meatPiece1.getMass());
        assertEquals("Black and red", meatPiece1.getColor());
        assertEquals("Wet", meatPiece1.getState());

        meatPiece2.setColor("red");
        meatPiece2.setMass(11);
        assertEquals(11, meatPiece2.getMass());
        assertEquals("red", meatPiece2.getColor());
        assertNull(meatPiece2.getState());

        randomPiece.setState();
        assertEquals(999999, randomPiece.getMass());
        assertEquals("Random", randomPiece.getColor());
        assertEquals("...", randomPiece.getState());
    }
}
