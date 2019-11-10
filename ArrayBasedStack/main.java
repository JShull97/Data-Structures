/**
* Program: ArrayBasedStack
* Developer: Justin Shull
* Date: 10/28/19
* Purpose: Create a basic stack based on an array
*/
public class main {

    public static void main(String[] args) {
        ArrayBasedStack abs = new ArrayBasedStack(5); // create and fill stack
        abs.push(0);
        abs.push(1);
        abs.push(2);
        abs.push(3);
        abs.push(4);
        abs.printStack();
        abs.pop();  // test pop method
        abs.printStack();
        abs.push(5);
        abs.push(9); // test for capacity errors
        abs.printStack();
        System.out.println("Top of the stack is " + abs.peek());
    }
    
}
