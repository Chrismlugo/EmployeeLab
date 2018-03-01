import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Andrew", "AA108227P", 22000);
    }

    @Test
    public void hasName(){
        assertEquals("Andrew", developer.getName());
    }

    @Test
    public void canChangeName(){
        developer.setName("Ronald");
        assertEquals("Ronald", developer.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("AA108227P", developer.getNI());
    }

    @Test
    public void canChangeNI(){
        developer.setNI("IM405038JJ");
        assertEquals("IM405038JJ", developer.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(22000, developer.getSalary());
    }

    @Test
    public void canChangeSalary(){
        developer.setSalary(24000);
        assertEquals(24000, developer.getSalary());
    }

    @Test
    public void canGetOnePercentOfSalary(){
        assertEquals(220, developer.raiseSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(22220, developer.payBonus(), 0.01);
    }

}
