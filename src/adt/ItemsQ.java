package adt;

import listTest.GenLinkedList;

public class ItemsQ<B> implements Queue<B>{
    private int currentSize;
    private final int maxSize;
    private GenLinkedList<B> list = new GenLinkedList<>();

    public ItemsQ(int mazSize) {
        this.maxSize = mazSize;
    }

    @Override
    public int size() {

        return currentSize;
    }

    @Override
    public boolean enqueue(B someObject) {
        if(currentSize<maxSize){
            list.insertFirst(someObject);
            currentSize++;
            return true;
        }
       return false;
    }

    @Override
    public B dequeue() {
        currentSize--;
        return list.deleteLast();
    }



    @Override
    public void leave(int position) throws NoSuchPositionException {

        if(position>0 && position<maxSize && position<=currentSize){
            currentSize--;
            list.deleteIndex(position);

        }else

     throw  new NoSuchPositionException();
    }
}
