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

}
