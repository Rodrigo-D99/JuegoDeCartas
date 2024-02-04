package JuegoDeCartas.src.main.java.mazoDeCartas.posimas;

import JuegoDeCartas.src.main.java.mazoDeCartas.Carta;

import java.util.ArrayList;
import java.util.HashMap;

public class PosimaCompuesta extends ElementoPosima{
    private ArrayList<ElementoPosima> posimas;

    public PosimaCompuesta(String nombre) {
        super(nombre);
        this.posimas=new ArrayList<>();
    }

    @Override
    public void aplicarPosion(Carta c) {
        for (ElementoPosima a: posimas){
                a.aplicarPosion(c);
        }
        c.setNomPosimaUsada(getNombre());
    }

    public ArrayList<ElementoPosima> getPosimas() {
        return new ArrayList<>(posimas);
    }

    public void addPosimas(ElementoPosima a) {
        this.posimas.add(a);
    }
}
