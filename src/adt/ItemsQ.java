package adt;

import listTest.GenLinkedList;

public class ItemsQ<B> implements Queue<B>{
    private int size;
    private GenLinkedList<B> list = new GenLinkedList<>();
    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(B someObject) {
        list.insertLast(someObject);
        size++;
    }

    @Override
    public B dequeue() {
        size--;
        return list.deleteFirst();
    }

    @Override
    public void leave(int position) throws NoSuchPositionException {
     throw  new NoSuchPositionException();
    }
}
