import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jason", "JM10229A", 45000, "Sales");
    }

    @Test
    public void hasName(){
        assertEquals("Jason", manager.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("JM10229A", manager.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(45000, manager.getSalary());
    }

    @Test
    public void hasDepartment(){
        assertEquals("Sales", manager.getDepartmentName());
    }

    @Test
    public void canGetOnePercentOfSalary(){
        assertEquals(450, manager.raiseSalary(), 0.01);
    }

    @Test
    public void canBePaidBonus(){
    assertEquals(45450, manager.payBonus(), 0.01);
    }
}
