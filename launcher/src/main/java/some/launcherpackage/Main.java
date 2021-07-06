package some.launcherpackage;

import some.testpackage.TestInterface;

import java.util.Optional;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<TestInterface> load = ServiceLoader.load(TestInterface.class);
        Optional<TestInterface> first = load.findFirst();

        if (first.isEmpty()) {
            System.out.println("error!");
        }
    }
}
