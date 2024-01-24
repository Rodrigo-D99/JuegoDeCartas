package JuegoDeCartas.src.main.java.mazoDeCartas.filtros;

import JuegoDeCartas.src.main.java.mazoDeCartas.Carta;

public class FiltroAtributo extends Filtro{
    private String s;

    public FiltroAtributo(String s) {
        this.s = s;
    }

    @Override
    public boolean cumple(Carta c) {
        return c.getAtributos().containsKey(s);
    }


}
