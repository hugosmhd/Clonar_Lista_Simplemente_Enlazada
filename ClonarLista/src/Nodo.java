public class Nodo {
    Object data;    
    Nodo siguiente;

    public Nodo(Object data) {
        this.data = data;
        this.siguiente = null;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public Object getData() {
        return data;
    }
    
}
