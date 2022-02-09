public class Lista {

    Nodo primero;
    Nodo ultimo;

    public Lista() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean estaVacia() {
        return primero==null;
    }

    public void insertarAlFinal(Object data) {
        Nodo nuevo = new Nodo(data);
        if (estaVacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {
            this.ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
        }
    }

    public void visualizar(){
        Nodo actual= this.primero;

        while( actual!= null){
            if (actual.getSiguiente()!=null) System.out.print(actual.getData() + ",");
            else System.out.println(actual.getData());
            actual=actual.getSiguiente();
        }
            
    }

    public Lista clonarLista(Lista listaOriginal) {
        Lista listaClonada = new Lista();
        Nodo actual = listaOriginal.primero;
        while(actual != null) {
            listaClonada.insertarAlFinal(actual.getData());
            actual = actual.siguiente;
        }

        return listaClonada;
    }
}
