package JuegoDeCartas.src.main.java.mazoDeCartas.posimas;

import JuegoDeCartas.src.main.java.mazoDeCartas.Carta;

import java.util.HashMap;

public class PosimaEstatica extends ElementoPosima{
    private int valor;

    public PosimaEstatica(String nombre, int valor) {
        super(nombre);
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public void aplicarPosion(Carta c) {
        HashMap<String,Integer> temp=c.getAtributos();
        for (String s:temp.keySet()){
            temp.replace(s, valor);
        }
        c.setNomPosimaUsada(getNombre());
        c.addAllAtributos(temp);

    }
}
