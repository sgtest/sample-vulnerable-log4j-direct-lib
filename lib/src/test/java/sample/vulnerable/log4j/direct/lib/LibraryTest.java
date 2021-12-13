package sample.vulnerable.log4j.direct.lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.log(new String[]{"a", "b", "c"}), "log should return 'true'");
    }
}
