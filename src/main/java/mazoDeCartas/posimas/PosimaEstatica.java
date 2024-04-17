package mazoDeCartas.posimas;
public class PosimaEstatica extends PosimaNormal{

    public PosimaEstatica(String nombre, int valor) {
        super(nombre,valor);
    }
    @Override
    public int aplicarPosion(int c,String s) {
        return (int) getValor();
    }

}
