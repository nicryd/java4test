package se.addq.java4test;

/**
 * Created by matseriksson on 18/12/17.
 */
public class Person {

    private String name;
    private String firstName;
    private String lastName;

    public Person() { }

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }


    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        this.name = firstName + " " + this.lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        this.name = this.firstName + " " + lastName;
    }

    public String greeting() {
        return "Välkommen " + getName();
    }



}
