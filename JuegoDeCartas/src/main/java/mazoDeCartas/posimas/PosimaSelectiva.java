package JuegoDeCartas.src.main.java.mazoDeCartas.posimas;
import JuegoDeCartas.src.main.java.mazoDeCartas.Carta;
import JuegoDeCartas.src.main.java.mazoDeCartas.filtros.Filtro;
import JuegoDeCartas.src.main.java.mazoDeCartas.filtros.FiltroAtributo;

import java.util.HashMap;

public class PosimaSelectiva extends PosimaNormal{
    private FiltroAtributo f;
    public PosimaSelectiva(String nombre, double valor,FiltroAtributo f) {
        super(nombre, valor);
        this.f=f;
    }

    public Filtro getF() {
        return f;
    }

    @Override
    public void aplicarPosion(Carta c) {
        HashMap<String,Integer> temp=c.getAtributos();

        for (String s:temp.keySet()){
            if (f.cumple(c))
                temp.replace(s, (int) (getValorAumentado()*temp.get(s)));
        }
    }
}
