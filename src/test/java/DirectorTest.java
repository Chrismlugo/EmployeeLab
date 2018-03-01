import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Johnson", "1626389YT", 60000, "Sales", 500000);
    }

    @Test
    public void hasName(){
        assertEquals("Johnson", director.getName());
    }

    @Test
    public void canChangeName() {
        director.setName("Sherman");
        assertEquals("Sherman", director.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("1626389YT", director.getNI());
    }

    @Test
    public void canChangeNI(){
        director.setNI("297615TH");
        assertEquals("297615TH", director.getNI());
    }

    @Test
    public void hasSalary() {
        assertEquals(60000, director.getSalary());
    }

    @Test
    public void canChangeSalary(){
        director.setSalary(80000);
        assertEquals(80000, director.getSalary());
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Sales", director.getDepartmentName());
    }

    @Test
    public void canChangeDepartmentName(){
        director.setDepartmentName("Marketing");
        assertEquals("Marketing", director.getDepartmentName());
    }

    @Test
    public void hasBudget(){
        assertEquals(500000, director.getBudget());
    }

    @Test
    public void canChangeBudget(){
        director.setBudget(600000);
        assertEquals(600000, director.getBudget());
    }

    @Test
    public void canGetOnePercentOfSalary(){
        assertEquals(600, director.raiseSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(60600, director.payBonus(), 0.01);
    }
}

