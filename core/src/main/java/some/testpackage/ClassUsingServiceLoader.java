package some.testpackage;

import java.util.Optional;
import java.util.ServiceLoader;

public class ClassUsingServiceLoader {
    public Optional<TestInterface> test() {
        ServiceLoader<TestInterface> load = ServiceLoader.load(TestInterface.class);
        return load.findFirst();
    }
}
