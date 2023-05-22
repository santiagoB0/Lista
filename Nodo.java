package Lista;

public class Nodo {

    private int element;
    private Nodo next;


    public Nodo(int element) {
        this.element = element;
        this.next = null;
    }

    public Nodo getNext() {
        return next;
    }
    public int getElement() {
        return element;
    }
    public void setElement(int element) {
        this.element = element;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}
