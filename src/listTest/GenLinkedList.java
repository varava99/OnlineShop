package listTest;

public class GenLinkedList<T> implements List<T> {
    private T data;
    private GenNode<T> head;
    private GenNode<T> tail;


    @Override
    public void insertFirst(T item) {

        GenNode<T> newLink = new GenNode<>(item);
        newLink.setNext(head);
        head = newLink;

    }

    @Override
    public void insertLast(T item) {
        GenNode<T> current = tail;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        GenNode<T> newCurrent = new GenNode<>(item);
        current.setNext(newCurrent);

    }

    @Override
    public T deleteFirst() {
        GenNode<T> temp = head;
        head = head.getNext();
        temp.setNext(null);
        return temp.getData();
    }

    @Override
    public T deleteLast() {
        GenNode<T> current = head;
        GenNode<T> prev = head;

        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }

        prev.setNext(null);
        return current.getData();

    }

    @Override
    public T deleteIndex(int index) {
        int count = 1;
        GenNode<T> current = head;
        GenNode<T> previous = head;

        while (count != index && current != null) {
            previous = current;
            current = current.getNext();
            count++;
        }

        if (current != null) {
            if (current == head) {
                head = head.getNext();
                head.setPrevious(null);
            } else {
                previous.setNext(current.getNext());

            }
            return current.getData();
        }
        return null;

    }

    @Override
    public boolean isEmpty() {

        return (head == null);
    }

    @Override
    public void displayList() {
        System.out.println("List (head -->  tail) : ");
        GenNode<T> current = head;
        while (current != null) {
            current.displayGenNode();
            current = current.getNext();

        }
        System.out.println(" ");

    }

//todo  praveriti vse methods   pravelinii i nepravelinii
}
