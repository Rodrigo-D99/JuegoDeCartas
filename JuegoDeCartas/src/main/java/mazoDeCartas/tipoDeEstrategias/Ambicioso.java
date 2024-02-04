package JuegoDeCartas.src.main.java.mazoDeCartas.tipoDeEstrategias;

import JuegoDeCartas.src.main.java.mazoDeCartas.Jugador;

public class Ambicioso extends EstrategiaJuego{
    public Ambicioso(String nombre) {
        super(nombre);
    }

    public String getAtributoElegido(Jugador j) {
        int atributoConMayorValor=0;
        int atributoConMenorValor=0;
        int atElegido=-1;
        for (String s:j.getMiniMazo().getAtributosObligatorios()){
            atributoConMenorValor=j.obtenerValorCarta(s);
            //se queda con el atributo con mayor valor
            if (atributoConMenorValor>atributoConMayorValor) {
                atributoConMayorValor = atributoConMenorValor;
                //setea cual es la posicion del atributo para poder retornarlo
                atElegido=s.indexOf(s);
            }
        }
        return j.getMiniMazo().getAtributosObligatorios().get(atElegido);
    }
}
