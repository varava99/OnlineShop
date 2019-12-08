package adt;

public interface Queue<T> {
    int size();
    boolean enqueue(T someObject);
    T dequeue();
    void leave(int position) throws NoSuchPositionException;


}
