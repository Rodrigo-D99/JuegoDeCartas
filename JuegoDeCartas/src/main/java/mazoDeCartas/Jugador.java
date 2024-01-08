package mazoDeCartas;


public class Jugador {

    private String nombre;
    private Mazo miniMazo;

    public Jugador(String nombre, Mazo miniMazo) {
        this.setNombre(nombre);
        this.miniMazo = miniMazo;
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


    public void addCarta(Juego c){

        //??????????
        for (int i = 0; i < c.mezclarYrepartir().size(); i++) {
            for (int j = 0; j < c.mezclarYrepartir().get(i).size(); j++) {
                miniMazo.addCartas(c.mezclarYrepartir().get(i).get(j));
            }
        }
    }
}
