package mazoDeCartas;


import mazoDeCartas.tipoDeEstrategias.EstrategiaJuego;



public class Jugador {


    private String nombre;
    private Mazo miniMazo;
    private EstrategiaJuego tipoEstrategia;
    public Jugador(EstrategiaJuego estrategiaJuego) {
        this.setNombre(nombre);
        this.miniMazo = new Mazo();
        tipoEstrategia=estrategiaJuego;
    }


    public EstrategiaJuego getTipoEstrategia() {
        return tipoEstrategia;
    }
    public String getAtributo(){
        return this.getTipoEstrategia().getAtributoElegido(getPCartaDeMiMazo());
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mazo getMiniMazo() {
        return miniMazo;
    }

    public void setMiniMazo(Mazo miniMazo) {
        this.miniMazo = miniMazo;
    }


    public Integer obtenerValorCarta(String atributoElejido){
        return getPCartaDeMiMazo().getValorDelAtributo(atributoElejido);
    }

    public void addCartaGanada(Carta c){
        miniMazo.addCartas(c);
    }
    public Carta getPCartaDeMiMazo(){
        return miniMazo.getPrimeraCarta();
    }
    public void removerCarta(Carta c){
        miniMazo.borrarCarta(c);
    }
    public boolean verificarSiSeAplicoPosima(){
        return getPCartaDeMiMazo().tienePosima();
    }
    public String getNombPosimaUsadaCarta(){
        return getPCartaDeMiMazo().getPosimaUsada().getNombre();
    }

    public String toString(String s) {
        return "La carta de " + nombre + " es " + getPCartaDeMiMazo().getNomPersonaje() +
                " con " + getPCartaDeMiMazo().getValorSinPosima(s) + " puntos de " + s;
    }
}
