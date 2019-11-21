package adt;

public interface Queue<T> {
    int size();
   void enqueue(T someObject);
   T dequeue();
   void leave(int position) throws NoSuchPositionException;


}
