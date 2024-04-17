package mazoDeCartas.posimas;

import mazoDeCartas.filtros.Filtro;


public class PosimaSelectiva extends PosimaNormal {
    private Filtro f;

    public PosimaSelectiva(String nombre, double valor, Filtro f) {
        super(nombre, valor);
        this.f = f;
    }

    public Filtro getF() {
        return f;
    }

    @Override
    public int aplicarPosion(int c, String s) {
        if (f.cumple(s)) {
            return  (int) (c* this.getValor());
        }
        return c;
    }
}
