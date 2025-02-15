import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class FindPunishmentNumberOfIntegerTest {
    private FindPunishmentNumberOfInteger systemUnderTest;

    @BeforeEach
    void setUp() {
        systemUnderTest = new FindPunishmentNumberOfInteger();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void hardcoded_input_1() {
        assertEquals(1, systemUnderTest.punishmentNumber(1));
    }

    @Test
    public void hardcoded_input_2() {
        assertEquals(182, systemUnderTest.punishmentNumber(10));
    }

    @Test
    public void hardcoded_input_3() {
        assertEquals(1478, systemUnderTest.punishmentNumber(37));
    }

    @Test
    public void invalid_input_0() {
        assertEquals(0, systemUnderTest.punishmentNumber(0));
    }

    @Test
    public void invalid_input_negative_integer() {
        final int negativeInteger = ThreadLocalRandom.current().nextInt(-1000, 0);
        assertEquals(0, systemUnderTest.punishmentNumber(negativeInteger));
    }
}