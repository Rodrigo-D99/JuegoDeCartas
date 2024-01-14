package JuegoDeCartas.src.main.java.mazoDeCartas;


public class Jugador {

    private String nombre;
    private Mazo miniMazo;
    public Jugador(int cantAtributos) {
        this.setNombre(nombre);
        this.miniMazo = new Mazo(cantAtributos);
    }

    public String getAtributoElegido() {
        int atributoAleatroio= (int) (Math.random()*miniMazo.getAtributosObligatorios().size());
        return miniMazo.getAtributosObligatorios().get(atributoAleatroio);
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
        return this.miniMazo.getCartas().getFirst().getAtributos().get(a);
    }
    public void addCartaGanada(Carta c){
        miniMazo.addCartas(c);
    }

    public void removerCarta(Carta c){
        miniMazo.borrarCarta(c);
    }


    /*@Override
    public String toString(){
        return "El Jugador" + nombre+ "selecciona competir por el atributo: "+getAtributoElegido()+
                "mazo"+getMiniMazo();
    }*/
}
