package edu.dsa.overriding;

public class OverrideSubClass {

        public static void main(String[] args) {
            Parnt obj = new Child();
            obj.show();
        }
}

    // Base Class
    class Parnt {
        void show()
        {
            System.out.println("Parent's show()");
        }
    }

    // Inherited class
    class Child extends Parnt {
        // This method overrides show() of Parent
        @Override
        void show()
        {
            super.show();
            System.out.println("Child's show()");
        }
    }
