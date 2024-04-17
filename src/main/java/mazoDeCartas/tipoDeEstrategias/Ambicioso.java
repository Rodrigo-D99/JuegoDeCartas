package mazoDeCartas.tipoDeEstrategias;

import mazoDeCartas.Carta;
public class Ambicioso extends EstrategiaJuego{
    public Ambicioso(String nombre) {
        super(nombre);
    }

    public String getAtributoElegido(Carta c) {
        int atributoConMayorValor=0;
        int atributoConMenorValor;
        String atElegido="";
        for (String s:c.getNombAtributos()){
            atributoConMenorValor=c.getValorDelAtributo(s);
            //se queda con el atributo con mayor valor
            if (atributoConMenorValor>atributoConMayorValor) {
                atributoConMayorValor = atributoConMenorValor;
                //setea cual es la posicion del atributo para poder retornarlo
                atElegido=s;
            }
        }
        return atElegido;
    }
}
