import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGetMessage() {
        App app = new App();
        String result = app.getMessage();
        assertEquals("Hello, Jenkins Pipeline!", result);
    }
    
    @Test
    public void testMessageNotNull() {
        App app = new App();
        String result = app.getMessage();
        assertNotNull("Message should not be null", result);
    }
    
    @Test
    public void testMessageNotEmpty() {
        App app = new App();
        String result = app.getMessage();
        assertFalse("Message should not be empty", result.isEmpty());
    }
}
