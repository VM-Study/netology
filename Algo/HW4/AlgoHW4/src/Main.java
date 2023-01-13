public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.printme();
        stack.push(2);
        stack.printme();
        stack.push(3);
        stack.printme();
        stack.push(4);
        stack.printme();
        stack.push(5);
        stack.printme();
        stack.push(6);
        stack.printme();
        stack.pop();
        stack.printme();

        Stack stackRevers = stack.revers();
        stackRevers.printme();
        stackRevers.pop();
        stackRevers.printme();



    }
}