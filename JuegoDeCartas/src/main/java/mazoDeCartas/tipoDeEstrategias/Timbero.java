package JuegoDeCartas.src.main.java.mazoDeCartas.tipoDeEstrategias;

import JuegoDeCartas.src.main.java.mazoDeCartas.Jugador;

public class Timbero extends EstrategiaJuego{

    public Timbero(String nombre) {
        super(nombre);
    }

    public String getAtributoElegido(Jugador j) {
        int atributoAleatroio= (int) (Math.random()*j.getMiniMazo().getAtributosObligatorios().size());
        return j.getMiniMazo().getAtributosObligatorios().get(atributoAleatroio);
    }
}
