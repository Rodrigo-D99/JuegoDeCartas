package mazoDeCartas;


import mazoDeCartas.posimas.ElementoPosima;

import java.util.ArrayList;

public class Juego {
    private static int TURNO =1;
    private Mazo mazo;
    private final int MAXIMO_RONDAS;
    private Jugador j1,j2;
    private ArrayList<ElementoPosima> posimas;

    public Juego(Jugador j1, Jugador j2 , Mazo m) {
       this.j1=j1;
       this.j2=j2;
       this.mazo=m;
       MAXIMO_RONDAS = m.getCartas().size()*2;
       this.posimas=new ArrayList<>();
    }

    public ArrayList<ElementoPosima> getPosimas() {
        return new ArrayList<>(posimas);
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

    public void addPosimas(ElementoPosima a) {
        this.posimas.add(a);
    }
    public boolean hayPosimas(){
        return !this.posimas.isEmpty();
    }
    public void mezclarYrepartir(){
        ArrayList<Carta>aux=new ArrayList<>();
        ArrayList<Carta>aux2=new ArrayList<>();
        int j=0;
        double c= (double) mazo.getCartas().size()/2;

        double i=0;
        double i2=-1;

        while((aux.size() < (Math.ceil(c))) || (aux2.size() < Math.floor(c))){
            //evitar error Exception in thread "main" java.lang.IndexOutOfBoundsException
            if (j<=mazo.getCartas().size()) {

                if (Math.random()*c > c/2 ) { // QUE SON ESTOS VALORES??????

                    //para agregarle una carta mas al jugador 1 cuando la cantidad es impar(
                    if (i%2==0&& c % 2 != 0)
                        i=c+0.5;
                    else
                        i=c;
                    //  )
                    if ( aux.size() != i)
                        aux.add(mazo.getCartas().get(j));
                    else
                        aux2.add(mazo.getCartas().get(j));
                }
                else {
                    if (i2%2!=0&&c%2 != 0)
                        i2=c-0.5;
                    else
                        i2=c;

                    if (aux2.size() != i2)
                        aux2.add(mazo.getCartas().get(j));
                    else
                        aux.add(mazo.getCartas().get(j));
                }
            }
            if (hayPosimas()&&Math.random()<=mazo.getCartas().size()) {
                //le setea la primera posima a una carta ramdom
                mazo.getCartas().get((int) (Math.random()*mazo.getCartas().size())).setPosimaUsada(posimas.getFirst());
                posimas.removeFirst();
            }

            j++;

        }
        Mazo m1=new Mazo(aux,this.mazo.getAtributosObligatorios(),mazo.getAtributosObligatorios().size());
        Mazo m2=new Mazo(aux2,this.mazo.getAtributosObligatorios(),mazo.getAtributosObligatorios().size());
        j1.setMiniMazo(m1);
        j2.setMiniMazo(m2);

    }

    public void imprimirJugadorYatributoElegido(String atributoE){
        if (j1.verificarSiSeAplicoPosima()&&j2.verificarSiSeAplicoPosima())
            System.out.println(j1.toString(atributoE)+simplificarText(atributoE, j1)+"\n"+ j2.toString(atributoE)+simplificarText(atributoE, j2));

        else if (j1.verificarSiSeAplicoPosima()) {
            System.out.println(j1.toString(atributoE) + simplificarText(atributoE, j1)+ "\n" + j2.toString(atributoE));
        }
        else if (j2.verificarSiSeAplicoPosima()) {
            System.out.println(j1.toString(atributoE) + "\n" + j2.toString(atributoE)+simplificarText(atributoE, j2));
        }
        else
            System.out.println(j1.toString(atributoE)+"\n"+ j2.toString(atributoE));
    }

    public String simplificarText(String a,Jugador j){
        return  ", se aplicó pócima " +j.getNombPosimaUsadaCarta() +"\nEl valor resultante es "+ j.obtenerValorCarta(a);
    }
    public String simplificarText2(Jugador j,Jugador jj){
        return  j.getNombre() + " posee ahora " + j.getMiniMazo().getCartas().size()
                + " cartas y " + jj.getNombre() + " posee ahora " + jj.getMiniMazo().getCartas().size()
                + " cartas";
    }
    public void jugar(Jugador j1,Jugador j2){
        //el jugador me pasa la carta que va a usar y elige un atributo ramdom
        //comparo el valor de cada atributo y el que tiene mas valor gana
        //mandar la primera carta del mazo del jugador al final junto con la que gano
        //Cambiar turno de jugador

        Carta c1= j1.getMiniMazo().getPrimeraCarta();
        Carta c2= j2.getMiniMazo().getPrimeraCarta();
        String at1=j1.getAtributo();
        String at2=j2.getAtributo();
        String atributoE;


        if (TURNO%2!=0){
            atributoE=at1;
            System.out.println("El Jugador " + j1.getNombre()+ " selecciona competir por el atributo: "+atributoE);
        }
        else {
            atributoE=at2;
            System.out.println("El Jugador " + j2.getNombre()+ " selecciona competir por el atributo: "+atributoE);
        }
        imprimirJugadorYatributoElegido(atributoE);

        TURNO++;


            if (j1.obtenerValorCarta(atributoE) > j2.obtenerValorCarta(atributoE)) {

                System.out.println("Gana la ronda " + j1.getNombre());

                //borra las primera carta de los 2 jugadores
                j1.removerCarta(c1);
                j2.removerCarta(c2);
                //agrega las cartas alfinal del mazo
                j1.addCartaGanada(c1);
                j1.addCartaGanada(c2);
                System.out.println(simplificarText2(j1,j2));
            } else if (j1.obtenerValorCarta(atributoE) < j2.obtenerValorCarta(atributoE)) {
                System.out.println("Gana la ronda " + j2.getNombre());

                //borra las primera carta de los 2 jugadores
                j1.removerCarta(c1);
                j2.removerCarta(c2);
                //agrega las cartas alfinal del mazo
                j2.addCartaGanada(c1);
                j2.addCartaGanada(c2);
                System.out.println(simplificarText2(j2,j1));
            } else {
                System.out.println("Empataron");
                //borra las primera carta de los 2 jugadores
                j1.removerCarta(c1);
                j2.removerCarta(c2);
                //agrega las cartas de cada jugador alfinal de su mazo
                j1.addCartaGanada(c1);
                j2.addCartaGanada(c2);
                System.out.println(simplificarText2(j1,j2));

        }
        if (TURNO==MAXIMO_RONDAS){
            System.out.println("Se llego al maximo de rondas, gana el jugador con mas cartas " +
                    "y si la cantidad es igual es un empate");
        }
    }
}
