package listTest;

public class GenLinkedList<T> implements List<T> {
    private T data;
    private GenNode<T> head;
    private GenNode<T> tail;


    @Override
    public void insertFirst(T item) {
        GenNode<T> newLink = new GenNode<>(item);

        if (head == null && tail==null) {
            head = newLink;
            tail = newLink;
        }else{
            newLink.setNext(head);
            head.setPrevious(newLink);
            head = newLink;
        }



    }

    @Override
    public void insertLast(T item) {

        GenNode<T> newCurrent = new GenNode<>(item);
        newCurrent.setPrevious(tail);
        tail.setNext(newCurrent);
        tail = newCurrent;

    }

    @Override
    public T deleteFirst() {
        GenNode<T> temp = head;
        head = head.getNext();
        head.setPrevious(null);
        temp.setNext(null);
        return temp.getData();
    }

    @Override
    public T deleteLast() {
        GenNode<T> temp = tail;
        tail = tail.getPrevious();
        tail.setNext(null);

        temp.setNext(null);
        temp.setPrevious(null);

        return temp.getData();
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
                head = null;
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
    public void displayListHeadToTail() {
        System.out.println("List (head -->  tail) : ");
        GenNode<T> current = head;
        while (current != null) {
            current.displayGenNode();
            current = current.getNext();

        }
        System.out.println(" ");

    }

    @Override
    public void displayListTailToHead() {
        System.out.println("List (tail -->  head) : ");
        GenNode<T> current = tail;
        while (current != null) {
            current.displayGenNode();
            current = current.getPrevious();

        }
        System.out.println(" ");

    }  /// done


}
