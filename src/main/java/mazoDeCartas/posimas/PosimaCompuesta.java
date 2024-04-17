package mazoDeCartas.posimas;

import java.util.ArrayList;

public class PosimaCompuesta extends ElementoPosima{
    private ArrayList<ElementoPosima> posimas;
    public PosimaCompuesta(String nombre) {
        super(nombre);
        this.posimas=new ArrayList<>();
    }
    @Override
    public int aplicarPosion(int c,String s) {
        int suma=c;
        for (ElementoPosima e: posimas){
            suma=e.aplicarPosion(suma,s);
        }
        return suma;
    }

    public ArrayList<ElementoPosima> getPosimas() {
        return new ArrayList<>(posimas);
    }

    public void addPosimas(ElementoPosima a) {
        this.posimas.add(a);
    }
}
