package task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DomainTest {
    static Logic logic;

    @BeforeAll
    public static void init(){
        logic = new Logic();
    }

    @Test
    public void mountainCheck(){
        assertEquals("Чел0 Чел1 walking and saw Кольцо with crater diameter 235", logic.checkMount());
    }

    @Test
    public void pieceCheck(){
        assertEquals("Чел0 Чел1 stopped and thinking Meat is Wet. Meat is Wet. Piece is random. ", logic.checkPieces());
    }

}
