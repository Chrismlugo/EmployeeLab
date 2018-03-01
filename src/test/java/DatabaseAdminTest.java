import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Lars", "12345", 25000);
    }

    @Test
    public void hasName(){
        assertEquals("Lars", databaseAdmin.getName());
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Ulrich");
        assertEquals("Ulrich", databaseAdmin.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("12345", databaseAdmin.getNI());
    }

    @Test
    public void canChangeNI(){
        databaseAdmin.setNI("2468");
        assertEquals("2468", databaseAdmin.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000, databaseAdmin.getSalary());
    }

    @Test
    public void canChangeSalary(){
        databaseAdmin.setSalary(26000);
        assertEquals(26000, databaseAdmin.getSalary());
    }

    @Test
    public void canGetOnePercentOfSalary(){
        assertEquals(250, databaseAdmin.raiseSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(25250, databaseAdmin.payBonus(),0.01);
    }
}
