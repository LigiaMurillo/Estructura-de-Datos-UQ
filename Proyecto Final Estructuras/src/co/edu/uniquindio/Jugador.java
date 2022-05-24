package co.edu.uniquindio;

public class Jugador {

    private String nombre;
    private boolean maquina = true;
    private int semaforosDisponibles;
    private Vertice ubicacion;
    private Jugador siguiente;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public Jugador(String nombre, boolean maquina, int semaforosDisponibles, Vertice ubicacion) {
        this.nombre = nombre;
        this.maquina = maquina;
        this.semaforosDisponibles = semaforosDisponibles;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMaquina() {
        return maquina;
    }

    public void setMaquina(boolean maquina) {
        this.maquina = maquina;
    }

    public int getSemaforosDisponibles() {
        return semaforosDisponibles;
    }

    public void setSemaforosDisponibles(int semaforosDisponibles) {
        this.semaforosDisponibles = semaforosDisponibles;
    }

    public Vertice getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Vertice ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Jugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Jugador siguiente) {
        this.siguiente = siguiente;
    }
}
