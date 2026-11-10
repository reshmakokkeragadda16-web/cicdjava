import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddition() {
        App obj = new App();
        assertEquals(10, obj.add(5, 5));
    }
}