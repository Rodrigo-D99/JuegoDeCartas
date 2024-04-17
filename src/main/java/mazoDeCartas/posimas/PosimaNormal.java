package mazoDeCartas.posimas;



public class PosimaNormal extends ElementoPosima{
    private double valor;
    public PosimaNormal(String nombre,double valor) {
        super(nombre);
        this.valor =valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int aplicarPosion(int c,String s) {
        return (int)(c* valor);
    }


}
