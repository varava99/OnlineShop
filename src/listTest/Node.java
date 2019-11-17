package listTest;

public class Node {
    private int data;
    private Node next;

    public Node(int someData) {
        this.data = someData;
    }

    public  void displayNode() {

        System.out.println("{" + data + "}");

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
