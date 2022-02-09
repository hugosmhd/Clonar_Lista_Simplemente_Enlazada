public class App {
    public static void main(String[] args) throws Exception {
        Lista listaOriginal = new Lista();

        listaOriginal.insertarAlFinal(1);
        listaOriginal.insertarAlFinal(2);
        listaOriginal.insertarAlFinal(3);
        listaOriginal.insertarAlFinal(4);
        listaOriginal.insertarAlFinal(5);

        System.out.println("LISTA ORIGINAL");
        listaOriginal.visualizar();
        Lista listaClonada = listaOriginal.clonarLista(listaOriginal);
        System.out.println("LISTA CLONADA");
        listaClonada.visualizar();


    }

}
