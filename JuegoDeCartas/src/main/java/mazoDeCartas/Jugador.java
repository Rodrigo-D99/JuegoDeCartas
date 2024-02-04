package JuegoDeCartas.src.main.java.mazoDeCartas;


import JuegoDeCartas.src.main.java.mazoDeCartas.tipoDeEstrategias.EstrategiaJuego;

import java.util.ArrayList;

public class Jugador {


    private String nombre;
    private Mazo miniMazo;
    private ArrayList<EstrategiaJuego> tipoEstrategia;
    public Jugador() {
        this.setNombre(nombre);
        this.miniMazo = new Mazo();
        tipoEstrategia=new ArrayList<>();
    }

    public void addTipoEstrategia(EstrategiaJuego tipoEstrategia) {
        this.tipoEstrategia.add(tipoEstrategia);
    }

    public EstrategiaJuego getTipoEstrategia() {
        int estrategiaAleatoria=(int) (Math.random()*tipoEstrategia.size());
        return tipoEstrategia.get(estrategiaAleatoria);
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

    public Integer obtenerValorCarta(String a){
        return this.miniMazo.getPrimeraCarta().getAtributos().get(a);
    }
    public Integer obtenerValorCartaModificada(String a){
        return this.miniMazo.getPrimeraCarta().getAtributosModificados().get(a);
    }
    public void addCartaGanada(Carta c){
        miniMazo.addCartas(c);
    }

    public void removerCarta(Carta c){
        miniMazo.borrarCarta(c);
    }
    public boolean verificarSiSeAplicoPosima(){
        return miniMazo.getPrimeraCarta().seAplicoPosima();
    }
    public String getNombPosimaUsadaCarta(){
        return miniMazo.getPrimeraCarta().getNomPosimaUsada();
    }

    public String toString(String s) {

        return "La carta de " + nombre + " es " + this.getMiniMazo().getPrimeraCarta().getNomPersonaje() +
                " con " + this.getMiniMazo().getPrimeraCarta().getAtributos().get(s) + " puntos de " + s;
    }
}
