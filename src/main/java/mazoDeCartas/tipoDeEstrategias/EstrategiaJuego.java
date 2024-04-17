package mazoDeCartas.tipoDeEstrategias;

import mazoDeCartas.Carta;
import mazoDeCartas.Jugador;

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

    public abstract String getAtributoElegido(Carta c);
}
