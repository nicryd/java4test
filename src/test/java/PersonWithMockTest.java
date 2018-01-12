import com.example.mockito.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import se.addq.java4test.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
public class PersonWithMockTest {

    @BeforeEach
    void init(@Mock Person person) {
        when(person.getName()).thenReturn("Viktor");
    }

    @Test
    void simpleTestWithInjectedMock(@Mock Person person) {
        assertEquals("Viktor", person.getName());
    }
}
