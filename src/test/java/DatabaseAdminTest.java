import org.junit.Before;
import org.junit.Test;
import staff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;


public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Lucy", 34000.00, "NI1234567");

    }

    @Test
    public void hasName() {
        assertEquals("Lucy", databaseAdmin.getName());
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Lisa");
        assertEquals("Lisa", databaseAdmin.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(34000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canChangeSalary(){
        databaseAdmin.setSalary(35000.00);
        assertEquals(35000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("NI1234567", databaseAdmin.getNi());

    }

    @Test
    public void canSetNi() {
        databaseAdmin.setNi("NI7654321");
        assertEquals("NI7654321", databaseAdmin.getNi());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(35000.00, databaseAdmin.getSalary(), 0.01);

    }

    @Test
    public void canGetBonus(){
        assertEquals(340.00, databaseAdmin.payBonus(), 0.01);
    }

}
