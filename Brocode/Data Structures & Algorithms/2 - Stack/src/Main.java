import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // stack = LIFO data structure. (Last in is the First Out)
        //         Stores objects into a "vertical tower"
        //
        // ex: pushing video game cases ontop of each other, then
        //      taking (popping) them away from the top because
        //      removing from the bottom will not work

        System.out.println("Lets look at a stack of video games!!!");

        Stack<String> stack = new Stack<String>();

        if (stack.empty()) {
            System.out.println("The stack is empty!");
        }

        stack.push("Minecraft");
        stack.push("Mount & Blade");
        stack.push("Red Dead Redemption");
        stack.push("DOOM");
        stack.push("DOOM 2 Electric Boogaloo");

        stack.pop(); // Remove the topmost object

        System.out.println(stack); // Printing whole stack
        stack.pop();
        System.out.println("*POP*");
        System.out.println(stack);
        
        // Use peek() method to see top of the stack
        System.out.println("Top of stack: " + stack.peek());
        
        // Searching -> gives an integer of how far back that item is
        System.out.println(stack.search("Mount & Blade"));
        
        
        // Attempting a stack overflow!
        // Will cause a Java Heap space exception!!! (OutOfMemoryError)
//        for (long i = 0; i < 1000000000; i++) {
//        	stack.push("Skyrim");
//        }

        // Uses of stacks?
        /*
         * 1. undo/redo features in text editors
         * 2. moving back/forward through browser history
         * 3. backtracking algorithms (maze, file directories)
         * 4. calling funcitons (eg. the call stack)
         */
    }
}
