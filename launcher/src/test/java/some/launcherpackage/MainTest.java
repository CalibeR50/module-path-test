package some.launcherpackage;

import org.junit.jupiter.api.Test;
import some.testpackage.ClassUsingServiceLoader;
import some.testpackage.TestInterface;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    @Test
    public void test() {
        Optional<TestInterface> test = new ClassUsingServiceLoader().test();
        assertTrue(test.isPresent());
    }
}
