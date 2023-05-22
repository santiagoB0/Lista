package Lista;

public class Functions {

    public ListaArray mezcla2(ListaArray lista1, ListaArray lista2) {
        ListaArray newLista = new ListaArray(lista1.getSize() + lista2.getSize());
        NodoArray pointer1 = lista1.getArray()[lista1.getHead()];
        NodoArray pointer2 = lista2.getArray()[lista2.getHead()];
        int contador = 0;
        while (pointer1 != null || pointer2 != null) {
            contador++;
            System.out.println(contador);
            int element1 = pointer1.getElement();
            int element2 = pointer2.getElement();
            if (element1 < element2) {
                newLista.insertFinal(element1);
                if (pointer1 != null) {
                    pointer1 = lista1.getArray()[pointer1.getNext()];
                }

            } else {
                newLista.insertFinal(element2);
                if (pointer2 != null) {
                    pointer2 = lista2.getArray()[pointer2.getNext()];
                }
            }
        }
        return newLista;
    }

    public int existeSublista(Lista lista1, Lista lista2) {
        int contador = 0;
        Nodo pointer1 = lista1.getHead();
        Nodo pointer2 = lista2.getHead();
        while (pointer2 != null) {
            if (pointer1.getElement() == pointer2.getElement()) {
                Nodo newPointer = subLista(pointer1, pointer2);
                if (newPointer != null) {
                    contador++;
                    pointer2 = newPointer;
                }
            }
            pointer2 = pointer2.getNext();
        }
        return contador;
    }
    public Nodo subLista(Nodo pointer1, Nodo pointer2) {
        if (pointer1.getElement() == pointer2.getElement()) {
            if (pointer1.getNext() == null) {
                return pointer2;
            }
        } else return null;
        return subLista(pointer1.getNext(), pointer2.getNext());
    }
}
