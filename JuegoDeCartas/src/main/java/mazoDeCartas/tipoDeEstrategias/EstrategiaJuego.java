package JuegoDeCartas.src.main.java.mazoDeCartas.tipoDeEstrategias;

import JuegoDeCartas.src.main.java.mazoDeCartas.Jugador;

public abstract class EstrategiaJuego {
    private String nombre;

    public EstrategiaJuego(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getAtributoElegido(Jugador j);
}
