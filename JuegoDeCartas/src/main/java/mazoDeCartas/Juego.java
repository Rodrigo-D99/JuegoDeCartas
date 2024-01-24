package JuegoDeCartas.src.main.java.mazoDeCartas;


import java.util.ArrayList;

public class Juego {
    private static int TURNO =1;
    private Mazo mazo;
    private final int MAXIMO_RONDAS;
    private Jugador j1,j2;
    private ArrayList<Aumento> posimas;

    public Juego(Jugador j1, Jugador j2 , Mazo m) {
       this.j1=j1;
       this.j2=j2;
       this.mazo=m;
       MAXIMO_RONDAS = m.getCartas().size()*2;
    }

    public Mazo getMazo() {
        return mazo;
    }

    public Jugador getJ1() {
        return j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public int getMAXIMO_RONDAS() {
        return MAXIMO_RONDAS;
    }

    public static int getTURNO() {
        return TURNO;
    }

    public void mezclarYrepartir(){
        ArrayList<Carta>aux=new ArrayList<>();
        ArrayList<Carta>aux2=new ArrayList<>();
        int j=0;
        double i=0;
        double i2=-1;
        double c= (double) mazo.getCartas().size()/2;
        while((aux.size() < (Math.ceil(c))) || (aux2.size() < Math.floor(c))){
            //evitar error Exception in thread "main" java.lang.IndexOutOfBoundsException
            if (j<=mazo.getCartas().size()) {
                if (Math.random() > 0.45 ) {
                    if (c%2!=0&&i%2==0)
                        i=c+0.5;
                    else
                        i=c;
                    if ( aux.size() != i)
                        aux.add(mazo.getCartas().get(j));
                    else
                        aux2.add(mazo.getCartas().get(j));
                }
                else {
                    if (c%2!=0&&i2%2!=0)
                        i2=c-0.5;
                    else
                        i2=c;
                    if (aux2.size() != i2)
                        aux2.add(mazo.getCartas().get(j));
                    else
                        aux.add(mazo.getCartas().get(j));
                }
            }

            j++;

        }
        Mazo m1=new Mazo(aux,this.mazo.getAtributosObligatorios(),mazo.getAtributosObligatorios().size());
        Mazo m2=new Mazo(aux2,this.mazo.getAtributosObligatorios(),mazo.getAtributosObligatorios().size());
        j1.setMiniMazo(m1);
        j2.setMiniMazo(m2);

    }


    public void jugar(Jugador j1,Jugador j2){
        //el jugador me pasa la carta que va a usar y elige un atributo ramdom
        //comparo el valor de cada atributo y el que tiene mas valor gana
        //mandar la primera carta del mazo del jugador al final junto con la que gano
        //Cambiar turno de jugador

        Carta c1= j1.getMiniMazo().getPrimeraCarta();
        Carta c2= j2.getMiniMazo().getPrimeraCarta();

        String at1=j1.getAtributoElegido();
        String at2=j2.getAtributoElegido();
        String atributoE;
        if (TURNO%2!=0){
            atributoE=at1;
            System.out.println("El Jugador " + j1.getNombre()+ " selecciona competir por el atributo: "+atributoE);
        }
        else {
            atributoE=at2;
            System.out.println("El Jugador " + j2.getNombre()+ " selecciona competir por el atributo: "+atributoE);
        }
        TURNO++;


            System.out.println(j1.toString(atributoE)+"\n"+ j2.toString(atributoE));
            if (j1.obtenerValorCarta(atributoE) > j2.obtenerValorCarta(atributoE)) {

                System.out.println("Gana la ronda " + j1.getNombre());

                //borra las primera carta de los 2 jugadores
                j1.removerCarta(c1);
                j2.removerCarta(c2);
                //agrega las cartas alfinal del mazo
                j1.addCartaGanada(c1);
                j1.addCartaGanada(c2);
                System.out.println(j1.getNombre() + " posee ahora " + j1.getMiniMazo().getCartas().size()
                        + " cartas y " + j2.getNombre() + " posee ahora " + j2.getMiniMazo().getCartas().size()
                        + " cartas");
            } else if (j1.obtenerValorCarta(atributoE) < j2.obtenerValorCarta(atributoE)) {
                System.out.println("Gana la ronda " + j2.getNombre());

                //borra las primera carta de los 2 jugadores
                j1.removerCarta(c1);
                j2.removerCarta(c2);
                //agrega las cartas alfinal del mazo
                j2.addCartaGanada(c1);
                j2.addCartaGanada(c2);
                System.out.println(j2.getNombre() + " posee ahora " + j2.getMiniMazo().getCartas().size()
                        + " cartas y " + j1.getNombre() + " posee ahora " + j1.getMiniMazo().getCartas().size()
                        + " cartas");
            } else {
                System.out.println("Empataron");
                //borra las primera carta de los 2 jugadores
                j1.removerCarta(c1);
                j2.removerCarta(c2);
                //agrega las cartas de cada jugador alfinal de su mazo
                j1.addCartaGanada(c1);
                j2.addCartaGanada(c2);
                System.out.println(j1.getNombre() + " posee ahora " + j1.getMiniMazo().getCartas().size()
                        + " cartas y " + j2.getNombre() + " posee ahora " + j2.getMiniMazo().getCartas().size()
                        + " cartas");

        }
        if (TURNO==MAXIMO_RONDAS){
            System.out.println("Se llego al maximo de rondas, gana el jugador con mas cartas " +
                    "y si la cantidad es igual es un empate");
        }
    }
}
