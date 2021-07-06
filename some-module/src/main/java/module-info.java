import some.otherpackage.InterfaceImplementation;
import some.testpackage.TestInterface;

module some.module {
    requires core;

    provides TestInterface with InterfaceImplementation;
}