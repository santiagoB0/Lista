package Lista;

public class Nodo {

    private int element;
    private Nodo next;
    private Nodo previous;

    public Nodo(int element) {
        this.element = element;
        this.next = previous = null;
    }

    public Nodo getNext() {
        return next;
    }
    public int getElement() {
        return element;
    }
    public Nodo getPrevious() {
        return previous;
    }
    public void setElement(int element) {
        this.element = element;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
}
