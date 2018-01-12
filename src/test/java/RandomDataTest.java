import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.addq.java4test.TestData;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomDataTest {

    TestData testData;

    @BeforeEach
    void init() {
        testData = new TestData();
    }


    @Test
    void randomNameShouldFail2of3times() {
        assertEquals("Mats", testData.getRandomNameFromList());
    }

    @Test
    void uuidGeneration() {
        String uuid = testData.generateUUID();
        assertEquals(36, uuid.length());
        System.out.println(uuid);
    }

    @Test
    void timeCheck() {
        System.out.println("Om en timme är klockan: " + testData.nowPlusHour(1));

    }



}
