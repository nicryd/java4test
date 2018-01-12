import org.junit.Test;
import se.addq.java4test.Person;

public class KontrollFlodesTest {

    @Test
    public void ifStatements() throws Exception {
        Person aUser = new Person("Erik","Eriksson");
        if (aUser.getName().contains("Erik")) {
            System.out.println("Person innehåller 'Erik'");
        } else {
            System.out.println("Person saknar 'Erik'");
        }
    }

    @Test
    public void forStatement() throws Exception {
        String[] name = {"Mats", "Helena", "Viktor"};
        for(String person : name) {
            System.out.println(person);
        }
    }
}
