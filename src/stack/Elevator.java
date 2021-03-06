package stack;

import java.util.Stack;

public class Elevator {

    public static void main(String[] args) {

        System.out.println("This is the order in which the people went into the elevator");
        System.out.println("Bob, John, David, Molly, Kelly");

        Stack<String> goingUp = new Stack<String>();

        goingUp.add("Bob");
        goingUp.add("John");
        goingUp.add("David");
        goingUp.add("Molly");
        goingUp.add("Kelly");

        System.out.println("In what order will they exit the elevator?");

        System.out.println(goingUp.pop());
        System.out.println(goingUp.pop());
        System.out.println(goingUp.pop());
        System.out.println(goingUp.pop());

        System.out.println("Who is left in the elevator?");

        System.out.println(goingUp.peek());

        System.out.println("Now, Bob will exit the elevator");

        System.out.println(goingUp.pop());
    }
}
