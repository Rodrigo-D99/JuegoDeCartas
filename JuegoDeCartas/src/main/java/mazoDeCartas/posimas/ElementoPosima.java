package JuegoDeCartas.src.main.java.mazoDeCartas.posimas;

import JuegoDeCartas.src.main.java.mazoDeCartas.Carta;

public abstract class ElementoPosima {
    private String nombre;
    public abstract void aplicarPosion(Carta c);

    public ElementoPosima(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
