package com.javatutorial.innerclasses;



public class TestClass1 {
    private int id = 101; // Outer class variable

    public static void main(String[] args) {
        System.out.println("In main Method: TestClass1");

        // Create instance of outer class
        TestClass1 outer = new TestClass1();
        
        // Create instance of inner class
        TestClass1.TestClass4 inner = outer.new TestClass4();
        
        // Call the show method
        inner.show();
    }

    public class TestClass4 {
        public void show() {
            int id = 103; // Local variable
            System.out.println("Local id: " + id);  // Prints local variable
            System.out.println("Outer class id: " + TestClass1.this.id);  // Access outer class variable
        }
    }
}
