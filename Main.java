package Lista;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Lista List = new Lista();
        for (int i = 0; i <= 5; i++) {
            Nodo node = new Nodo(i);
            List.insertBegin(node);
        } List.printLista();
        ListaArray listaArray = new ListaArray(5);
        listaArray.insertBegin(0);
        listaArray.insertIndex(6, 7);
        listaArray.insertIndex(4, 8);
        listaArray.insertBegin(9);
        listaArray.insertFinal(4);
        listaArray.insertFinal(10);
        listaArray.printListaArray();
        System.out.println(listaArray.getHead());

    }
}