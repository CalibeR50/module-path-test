package some.launcherpackage;

import some.testpackage.ClassUsingServiceLoader;
import some.testpackage.TestInterface;

import java.util.Optional;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        new ClassUsingServiceLoader().test();
    }
}
