package some.launcherpackage;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("some.otherpackage.InterfaceImplementation");
            Object o = aClass.getConstructor().newInstance();
            System.out.println(o);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
