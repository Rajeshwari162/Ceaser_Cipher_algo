import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RailFenceCipherTest {

    RailFenceCipher cipher = new RailFenceCipher();

    @Test
    void testEncryption() {
        assertEquals("HOLELWRDLO",
                cipher.encrypt("HELLOWORLD", 3));
    }

    @Test
    void testDecryption() {
        assertEquals("HELLOWORLD",
                cipher.decrypt("HOLELWRDLO", 3));
    }

    @Test
    void testSingleRail() {
        assertEquals("JAVA",
                cipher.encrypt("JAVA", 1));
    }

    @Test
    void testEmptyText() {
        assertEquals("",
                cipher.encrypt("", 3));
    }
}