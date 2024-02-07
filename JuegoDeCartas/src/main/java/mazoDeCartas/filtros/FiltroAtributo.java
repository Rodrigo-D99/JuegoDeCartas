package JuegoDeCartas.src.main.java.mazoDeCartas.filtros;
import JuegoDeCartas.src.main.java.mazoDeCartas.Carta;

public class FiltroAtributo extends Filtro{
    private String s;

    public FiltroAtributo(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    @Override
    public boolean cumple(String c) {
       return c.equalsIgnoreCase(s.toUpperCase());
    }

}
