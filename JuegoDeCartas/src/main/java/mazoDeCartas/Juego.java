package JuegoDeCartas.src.main.java.mazoDeCartas;


import java.util.ArrayList;

public class Juego {
    private static int TURNO =1;
    private Mazo mazo;
    private Jugador j1,j2;

    public Juego(Jugador j1,Jugador j2 , Mazo m) {
       this.j1=j1;
       this.j2=j2;
       this.mazo=m;
    }

    public void mezclarYrepartir(){
        ArrayList<Carta>aux=new ArrayList<>();
        ArrayList<Carta>aux2=new ArrayList<>();
        int j=0;
        double c= (double) mazo.getCartas().size()/2;
        while((aux.size() < (Math.ceil(c))) || (aux2.size() < Math.floor(c))){
            if (Math.random()>0.45)
                aux.add(mazo.getCartas().get(j));
            else{
                aux2.add(mazo.getCartas().get(j));

            }
            j++;

        }
        Mazo m1=new Mazo(aux,this.mazo.getAtributosObligatorios(),mazo.getAtributosObligatorios().size());
        Mazo m2=new Mazo(aux2,this.mazo.getAtributosObligatorios(),mazo.getAtributosObligatorios().size());
        System.out.println(m1+"\n"+m2);
        j1.setMiniMazo(m1);
        j2.setMiniMazo(m2);
    }

    public void jugar(Jugador j1,Jugador j2){
        //el jugador me pasa la carta que va a usar y elige un atributo ramdom
        //comparo el valor de cada atributo y el que tiene mas valor gana
        //mandar la primera carta del mazo del jugador al final junto con la que gano
        //Cambiar turno de jugador

        Carta c1= j1.getMiniMazo().getCartas().getFirst();
        Carta c2= j2.getMiniMazo().getCartas().getFirst();

        String at1=j1.getAtributoElegido();
        String at2=j2.getAtributoElegido();
        String atributoE;
        atributoE=TURNO/2!=0 ?at1:at2;
        TURNO++;

        if (j1.obtenerValorCarta(atributoE)>j2.obtenerValorCarta(atributoE)){

                System.out.println("Gano el jugador "+j1.getNombre());
                //borra las primera carta de los 2 jugadores
                j1.removerCarta(c1);
                j2.removerCarta(c2);
                //agrega las cartas alfinal del mazo
                j1.addCartaGanada(c1);
                j1.addCartaGanada(c2);




        }
        else if (j1.obtenerValorCarta(atributoE)<j2.obtenerValorCarta(atributoE)) {
                 System.out.println("Gano el jugador "+j2.getNombre());

                 //borra las primera carta de los 2 jugadores
                 j1.removerCarta(c1);
                 j2.removerCarta(c2);

                 //agrega las cartas alfinal del mazo
                 j2.addCartaGanada(c1);
                 j2.addCartaGanada(c2);




        }
        else {
            System.out.println("Empataron");

            //borra las primera carta de los 2 jugadores
            j1.removerCarta(c1);
            j2.removerCarta(c2);
            //agrega las cartas de cada jugador alfinal de su mazo
            j1.addCartaGanada(c1);
            j2.addCartaGanada(c2);
        }


       


    }
}
