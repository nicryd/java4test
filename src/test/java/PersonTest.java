import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.addq.java4test.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by matseriksson on 18/12/17.
 */
public class PersonTest {

    Person instansPerson;

    @BeforeEach
    void init() {
        instansPerson = new Person();
    }

    @Test
    void greetingPhraseNoAssertion() {
        Person person = new Person();

        System.out.println(person.greeting());
    }

    @Test
    void greetingPhrase() {
        Person person = new Person("Erik","Eriksson");
        assertEquals("Välkommen Erik Eriksson", person.greeting(), "hälsningsfrasen har blivit ändrad");
    }

    @Test
    void usingBeforeToTestPerson() {
        instansPerson.setFirstName("Mats");
        assertEquals("Mats", instansPerson.getFirstName());
    }


    @Test
    void combinedFirstLastName() {
        Person person = new Person();

        person.setFirstName("Erik");
        assertEquals("Erik", person.getFirstName());

        person.setLastName("Eriksson");
        assertEquals("Eriksson", person.getLastName());

        assertEquals("Erik Eriksson", person.getName());
    }

    @Test
    void constructorFirstLastName() {
        Person person = new Person("Erik", "Eriksson");

        assertEquals("Erik", person.getFirstName());

        assertEquals("Eriksson", person.getLastName());

        assertEquals("Erik Eriksson", person.getName());
    }

}
