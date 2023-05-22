package Lista;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ListaArray lista1 = new ListaArray(10);
        ListaArray lista2 = new ListaArray(10);
        for (int i = 0; i <= 10; i += 2) {
            lista1.insertFinal(i);
        } lista1.printListaArray();
        for (int i = 1; i < 10; i += 2) {
            lista2.insertFinal(i);
        } lista2.printListaArray();



//        Lista List = new Lista();
//        Lista list2 = new Lista();
//        for (int i = 0; i <= 5; i++) {
//            Nodo node = new Nodo(i);
//            List.insertBegin(node);
//        } List.printLista();
//        for (int i = 0; i <= 10; i++) {
//            Nodo node = new Nodo(i);
//            list2.insertBegin(node);
//        }
//        for (int i = 0; i <= 10; i++) {
//            Nodo node = new Nodo(i);
//            list2.insertBegin(node);
//        } list2.printLista();
//        System.out.println(list2.getHead().getElement());
//        System.out.println(List.getHead().getElement());
//
        Functions functions = new Functions();
        ListaArray mezcla = functions.mezcla2(lista2, lista1);
        mezcla.printListaArray();

    }
}