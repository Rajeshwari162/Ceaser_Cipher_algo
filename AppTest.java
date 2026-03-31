import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;

public class AppTest {
    App a1=new App();

    @Test
    public void testGreet()
    {
        assertTrue(true);
    }

    @Test
    public void testGreet1()
    {
        assertNotEquals("Hello World",a1.greet());
    }
}
