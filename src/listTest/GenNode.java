package listTest;

public class GenNode<R>  {

    private R data;
    private GenNode<R> next;
    private GenNode<R> previous;

    public GenNode(R data) {
        this.data = data;
    }

    public  void displayGenNode() {

        System.out.println("{" + data + "}");

    }

    public R getData() {
        return data;
    }

    public void setData(R data) {
        this.data = data;
    }

    public GenNode<R> getNext() {
        return next;
    }

    public void setNext(GenNode<R> next) {
        this.next = next;
    }

    public GenNode<R> getPrevious() {
        return previous;
    }

    public void setPrevious(GenNode<R> previous) {
        this.previous = previous;
    }
}
