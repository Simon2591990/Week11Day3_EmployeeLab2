import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Lucy", 34000.00, "NI1234567", "Logistics");

    }

    @Test
    public void hasName() {
        assertEquals("Lucy", manager.getName());
    }

    @Test
    public void canSetName() {
        manager.setName("Lisa");
        assertEquals("Lisa", manager.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(34000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canChangeSalary(){
        manager.setSalary(35000.00);
        assertEquals(35000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("NI1234567", manager.getNi());

    }

    @Test
    public void canSetNi() {
        manager.setNi("NI7654321");
        assertEquals("NI7654321", manager.getNi());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000.00);
        assertEquals(35000.00, manager.getSalary(), 0.01);

    }

    @Test
    public void canGetBonus(){
        assertEquals(340.00, manager.payBonus(), 0.01);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Logistics", manager.getDepartment());
    }

    @Test
    public void canChangeDepartment() {
        manager.setDepartment("Actuarial");
        assertEquals("Actuarial", manager.getDepartment());
    }
}
