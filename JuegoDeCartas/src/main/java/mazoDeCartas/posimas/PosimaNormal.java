package JuegoDeCartas.src.main.java.mazoDeCartas.posimas;

import JuegoDeCartas.src.main.java.mazoDeCartas.Carta;

import java.util.HashMap;

public class PosimaNormal extends ElementoPosima{
    private double valorAumentado;
    public PosimaNormal(String nombre,double valor) {
        super(nombre);
        this.valorAumentado=valor;
    }

    public void setValorAumentado(double valorAumentado) {
        this.valorAumentado = valorAumentado;
    }

    public double getValorAumentado() {
        return valorAumentado;
    }

    @Override
    public void aplicarPosion(Carta c) {
        HashMap<String,Integer>temp=c.getAtributos();
        for (String s:temp.keySet()){
            temp.replace(s, (int) (valorAumentado*temp.get(s)));
        }
    }
}
