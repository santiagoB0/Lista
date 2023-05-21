package Lista;

public class Lista {

    private int length;
    private Nodo head, tail;

    public Lista() {
        this.head = tail = null;
        this.length = 0;
    }
    public int getLength() {
        return this.length;
    }
    public Nodo getHead() {
        return this.head;
    }
    public Nodo getTail() {
        return this.tail;
    }
    public void setHead(Nodo head) {
        this.head = head;
    }
    public void setTail(Nodo tail) {
        this.tail = tail;
    }
    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void printLista() {
        Nodo node = getHead();
        for (int j = 0; j < this.length; j++) {
            System.out.println(node.getElement());
            node = node.getNext();
        }
    }
    public void insertBegin(Nodo node) {
        if (isEmpty()) {
            node.setNext(node);
            node.setPrevious(node);
            setHead(node);
            setTail(node);
        } else {
            getTail().setNext(node);
            node.setNext(getHead());
            setHead(node);
        } this.length++;
    }
}
