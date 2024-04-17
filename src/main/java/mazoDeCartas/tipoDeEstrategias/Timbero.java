package mazoDeCartas.tipoDeEstrategias;

import mazoDeCartas.Carta;
import mazoDeCartas.Jugador;

import java.util.ArrayList;

public class Timbero extends EstrategiaJuego{

    public Timbero(String nombre) {
        super(nombre);
    }

    public String getAtributoElegido(Carta c) {
        //elije siempre un atributo ramdom
        ArrayList<String> aux = new ArrayList<>(c.getNombAtributos());
        int atributoAleatroio= (int) (Math.random()*aux.size());
        return aux.get(atributoAleatroio);
    }
}
