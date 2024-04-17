package mazoDeCartas.filtros;


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
       return c.equalsIgnoreCase(s);
    }

}
