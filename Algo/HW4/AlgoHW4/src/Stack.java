public class Stack {
    Element head;

    public void push(int value) {
        head = new Element(value, head);
        System.out.println("Element [" + value + "] added.");
    }

    public void pop() {
        System.out.println("Pop element [" + head.value + "]");
        if (head.prev != null) {
            head = head.prev;
        }
    }

    public void printme() {
        Element current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public Stack revers() {
        System.out.println("[Revers]");
        Stack revers = new Stack();
        Element current = head;
        while (current != null) {
            revers.push(current.value);
            current = current.prev;
        }
        return revers;
    }
}
