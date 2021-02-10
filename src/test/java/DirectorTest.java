import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void setUp(){
        director = new Director("Lucy", 80000.00, "NI1234567", "SnobbyOffice", 2000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Lucy", director.getName());
    }

    @Test
    public void canSetName() {
        director.setName("Lisa");
        assertEquals("Lisa", director.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(80000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canChangeSalary(){
        director.setSalary(35000.00);
        assertEquals(35000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("NI1234567", director.getNi());

    }

    @Test
    public void canSetNi() {
        director.setNi("NI7654321");
        assertEquals("NI7654321", director.getNi());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000.00);
        assertEquals(81000.00, director.getSalary(), 0.01);

    }

    @Test
    public void canGetBonus(){
        assertEquals(800.00, director.payBonus(), 0.01);
    }

    @Test
    public void hasDepartment(){
        assertEquals("SnobbyOffice", director.getDepartment());
    }

    @Test
    public void canChangeDepartment() {
        director.setDepartment("Actuarial");
        assertEquals("Actuarial", director.getDepartment());
    }

    @Test
    public void hasBudget() {
        assertEquals(2000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canSetBudget() {
        director.setBudget(10000.00);
        assertEquals(10000.00, director.getBudget(), 0.01);
    }
}
