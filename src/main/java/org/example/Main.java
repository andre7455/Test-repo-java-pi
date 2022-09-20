package org.example;
public class Main {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        System.out.println(test.test("x"));
        String string = test.test("kaas");

        System.out.println(string);
    }
}