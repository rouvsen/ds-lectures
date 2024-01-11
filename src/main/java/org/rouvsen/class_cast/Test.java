package org.rouvsen.class_cast;

import java.net.URL;
import java.net.URLClassLoader;

public class Test {
    public void print() {
        System.out.println("Hello from Test");
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        // Create a new class loader with the jar file
        URL jarUrl = new URL("file:///path/to/test.jar");
        URLClassLoader jarLoader = new URLClassLoader(new URL[]{jarUrl});

        // Load the Test class from the jar file
        Class<?> jarTest = jarLoader.loadClass("az.ingress.Test");

        // Create a new instance of the Test class from the jar file
        Object jarTestObj = jarTest.newInstance();

        // Cast the jarTestObj to Test type
        Test test = (Test) jarTestObj; // This will throw a ClassCastException

        // Conclusion: The Resources is different each other ...
        // That means, Classes named the same name, Java don't know which one is real
    }
}
