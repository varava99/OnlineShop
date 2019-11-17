package listTest;

public interface List<P> {

    void insertFirst(P item);
    void insertLast(P item);
    P deleteFirst();
    P deleteLast();
    P deleteIndex(int index);
    boolean isEmpty();
    void displayList();





}
