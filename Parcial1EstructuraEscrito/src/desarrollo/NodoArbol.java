package desarrollo;

//import java.util.

public class NodoArbol<T> implements Comparable<T> {

    private NodoArbol<NodoArbol> children;
    private T t;

    public NodoArbol(T t) {
        this.t = t;
        this.children = new NodoArbol<NodoArbol>(null);
    }

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }

    @Override
    public int compareTo(T t) {
        if (this.t instanceof Comparable<?>) {
            Comparable<T> comparable = (Comparable<T>) this.t;
            return comparable.compareTo(t);
        } else {
            if (this.t == t) {
                return 0;
            }
            return 1;
        }
    }
}
