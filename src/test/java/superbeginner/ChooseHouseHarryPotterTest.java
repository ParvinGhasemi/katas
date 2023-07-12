package superbeginner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ChooseHouseHarryPotterTest {
    ChooseHouseHarryPotter chooseHouse = new ChooseHouseHarryPotter();

    @Test
    void defineGryffindorAsBravery() {
        assertEquals("bravery", chooseHouse.defineHouse("gryffindor"));
    }

    @Test
    void returnInvalidStatement() {
        assertEquals("not a valid house", chooseHouse.defineHouse("hi Harry!"));
    }

}