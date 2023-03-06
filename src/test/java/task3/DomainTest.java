package task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DomainTest {
    static Logic logic;

    @BeforeAll
    public static void init(){
        logic = new Logic();
    }

    @Test
    public void mountainCheck(){
        assertEquals("Чел0 Чел1 walking and saw КольцоГора with crater diameter 235", logic.checkMount());
    }

    @Test
    public void pieceCheck(){
        assertEquals("Чел0 Чел1 stopped and thinking Meat is Wet color Black and red mass 23. Meat is Wet color Black and red mass 10. Piece is random color Random mass 999999. ", logic.checkPieces());
    }

    @Test
    public void nullCheck(){
        Person p1 = new Person("1");
        Person p2 = new Person("2");
        Mountain mount = new Mountain("mount", "square", null);
        List <AbstractPiece> list = new ArrayList<>();
        Logic l = new Logic(p1, p2, mount, list);
        assertEquals("1 2 stopped and thinking ", l.checkPieces());
        assertEquals("1 2 walking and saw square", l.checkMount());
    }

}
