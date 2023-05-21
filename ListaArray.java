package Lista;

public class ListaArray {

    private NodoArray[] array;
    private int head;
    private int size;
    private int maxSize;

    public ListaArray(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.array = new NodoArray[1];
        this.head = 0;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public NodoArray[] getArray() {
        return array;
    }

    public void setArray(NodoArray[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public boolean isEmpty() {
        return getArray()[getHead()] == null;
    }
    public int searchSpace() {
        for (int i = 0; i < getSize(); i++) {
            if (getArray()[i] == null) {
                return i;
            }
        }
        return -1;
    }
    public void printListaArray() {
        for (int i = 0; i < getSize(); i++) {
            if (getArray()[i] != null){
                System.out.println(getArray()[i].getElement());
            } else {
                System.out.println(getArray()[i]);
            }

        }
    }
    public void insertBegin(int element) {
        NodoArray nodoArray = new NodoArray(element);
        if (isEmpty()){
            getArray()[0] = nodoArray;
            this.size++;
        } else {
            int position = searchSpace();
            if (position != -1) {
                getArray()[position] = nodoArray;
                nodoArray.setNext(getHead());
                setHead(position);
            } else {
                if (getSize() == getMaxSize()) {
                    System.out.println("No hay ningun espacio libre");
                } else {
                    NodoArray[] newArray = new NodoArray[getSize() + 1];
                    for (int i = 0; i < getSize(); i++) {
                        newArray[i] = getArray()[i];
                    }
                    newArray[getSize()] = nodoArray;
                    nodoArray.setNext(getHead());
                    setHead(getSize());
                    setArray(newArray);
                    this.size++;
                }
            }
        }

    }
    public void insertIndex(int index, int element) {
        NodoArray nodo = new NodoArray(element);
        if (index >= getMaxSize()) {
            System.out.println("Este índice no existe en la lista");
        } else {
            if (index < getSize()) {
                NodoArray node = getArray()[index];
                if (node != null) {
                    System.out.println("This index is occupied");
                } else {
                    getArray()[index] = nodo;
                    nodo.setNext(getHead());
                    setHead(index);
                }

            } else {
                NodoArray[] newArray = new NodoArray[index + 1];
                for (int i = 0; i < getSize(); i++) {
                    newArray[i] = getArray()[i];
                }
                for (int i = getSize(); i < index; i++){
                    newArray[i] = null;
                }
                newArray[index] = nodo;
                nodo.setNext(getHead());
                setHead(index);
                setArray(newArray);
                setSize(index + 1);

            }
        }
    }
    public void insertFinal(int element) {
        NodoArray nodoArray = new NodoArray(element);
        if (isEmpty()) {
            getArray()[0] = nodoArray;
            this.size++;
        } else {
            int space = searchSpace();
            if (space != -1) {
                getArray()[space] = nodoArray;
                int pointer = getHead();
                while (getArray()[pointer].getNext() != null) {
                    pointer = getArray()[pointer].getNext();
                }
                getArray()[pointer].setNext(space);


            } else {
                if (getSize() == getMaxSize()) {
                    System.out.println("Can't");
                } else {
                    NodoArray[] newArray = new NodoArray[getSize() + 1];
                    for (int i = 0; i < getSize(); i++) {
                        newArray[i] = getArray()[i];
                    }
                    newArray[getSize()] = nodoArray;
                    int pointer = getHead();
                    while (getArray()[pointer].getNext() != null) {
                        pointer = getArray()[pointer].getNext();
                    }
                    newArray[pointer].setNext(getSize());
                    setArray(newArray);
                    setSize(getSize() + 1);
                }
            }
        }
    }
    public void deleteN(int n) {
        int pointer = getHead();


    }
}
