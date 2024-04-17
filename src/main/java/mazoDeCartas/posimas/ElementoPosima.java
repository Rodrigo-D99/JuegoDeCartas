package mazoDeCartas.posimas;


public abstract class ElementoPosima {
    private String nombre;
    public abstract int aplicarPosion(int c,String s);
    public ElementoPosima(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
