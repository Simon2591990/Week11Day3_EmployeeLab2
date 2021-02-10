import org.junit.Before;
import org.junit.Test;
import staff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Lucy", 34000.00, "NI1234567");

    }

    @Test
    public void hasName() {
        assertEquals("Lucy", developer.getName());
    }

    @Test
    public void canSetName() {
        developer.setName("Lisa");
        assertEquals("Lisa", developer.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(34000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canChangeSalary(){
        developer.setSalary(35000.00);
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("NI1234567", developer.getNi());

    }

    @Test
    public void canSetNi() {
        developer.setNi("NI7654321");
        assertEquals("NI7654321", developer.getNi());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000.00);
        assertEquals(35000.00, developer.getSalary(), 0.01);

    }

    @Test
    public void canGetBonus(){
        assertEquals(340.00, developer.payBonus(), 0.01);
    }
}
