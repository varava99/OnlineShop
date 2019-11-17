package listTest;

public class LinkedList {
    private Node  first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {

        return (first == null);
    }

    public void insertFirst(int someData) {

        Node newLink = new Node(someData);
        newLink.setNext(first);
        first = newLink;

    }

    public int deleteFirst() {
        Node temp = first;
        first = first.getNext();
        temp.setNext(null);
        return temp.getData();

    }

    public void displayList() {
        System.out.println("List (first -->  last) : ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.getNext();

        }
        System.out.println(" ");
    }

    public void insertLast(int data) {
        Node current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        Node newCurrent = new Node(data);
        current.setNext(newCurrent);

    }

    public int deleteLast() {
        Node current = first;
        Node prev = first;

        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }

        prev.setNext(null);
        return current.getData();

    }

    public int deleteIndex(int index) {
        Node current = first;
        Node previous = first;

        while (current.getData() != index) {

            if (current.getNext() == null)
                return 0;
            else {
                previous = current;
                current = current.getNext();
            }
        }

        if (current == first)
            first = first.getNext();
        else {
            previous.setNext(current.getNext());

        }
        return current.getData();

    }
}






