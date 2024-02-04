package JuegoDeCartas.src.main.java.mazoDeCartas;


import JuegoDeCartas.src.main.java.mazoDeCartas.filtros.Filtro;
import JuegoDeCartas.src.main.java.mazoDeCartas.filtros.FiltroAtributo;
import JuegoDeCartas.src.main.java.mazoDeCartas.posimas.*;
import JuegoDeCartas.src.main.java.mazoDeCartas.tipoDeEstrategias.Ambicioso;
import JuegoDeCartas.src.main.java.mazoDeCartas.tipoDeEstrategias.EstrategiaJuego;
import JuegoDeCartas.src.main.java.mazoDeCartas.tipoDeEstrategias.Obstinado;
import JuegoDeCartas.src.main.java.mazoDeCartas.tipoDeEstrategias.Timbero;

import java.util.ArrayList;

public class Main {

        FiltroAtributo f;
    public static void main(String[] args) {

        //se crean las cartas
        Carta c=new Carta("goku");
        Carta c1=new Carta("vegeta");
        Carta c2=new Carta("krilin");
        Carta c3=new Carta("bulma");
        Carta c4=new Carta("milk");
        Carta c5=new Carta("trunks");
        Carta c6=new Carta("gohan");
        Carta c7=new Carta("picoro");
        Carta c8=new Carta("aaaaaaaaaa");

        c.addAtributos("Fuerza",3000);
        c.addAtributos("Inteligencia",300);
        c.addAtributos("Velocidad",1);
        c.addAtributos("Altura",185);

        c1.addAtributos("Fuerza",2600);
        c1.addAtributos("Inteligencia",600);
        c1.addAtributos("Velocidad",2250);
        c1.addAtributos("Altura",176);

        c2.addAtributos("Fuerza",500);
        c2.addAtributos("Inteligencia",400);
        c2.addAtributos("Velocidad",300);
        c2.addAtributos("Altura",1580);

        c3.addAtributos("Fuerza",200);
        c3.addAtributos("Inteligencia",1000);
        c3.addAtributos("Velocidad",150);
        c3.addAtributos("Altura",166);

        c4.addAtributos("Fuerza",400);
        c4.addAtributos("Inteligencia",700);
        c4.addAtributos("Velocidad",250);
        c4.addAtributos("Altura",170);

        c5.addAtributos("Fuerza",1500);
        c5.addAtributos("Inteligencia",600);
        c5.addAtributos("Velocidad",1000);
        c5.addAtributos("Altura",178);

        c6.addAtributos("Fuerza",1500);
        c6.addAtributos("Inteligencia",900);
        c6.addAtributos("Velocidad",1000);
        c6.addAtributos("Altura",178);

        c7.addAtributos("Fuerza",1000);
        c7.addAtributos("Inteligencia",600);
        c7.addAtributos("Velocidad",800);
        c7.addAtributos("Altura",178);

        c8.addAtributos("Fuerza",1000);
        c8.addAtributos("Inteligencia",600);
        c8.addAtributos("Velocidad",1500);
        c8.addAtributos("Altura",178);

        //se crea el mazo

        Mazo mazo=new Mazo();
        mazo.addAtributosObligatorios("Fuerza");
        mazo.addAtributosObligatorios("Inteligencia");
        mazo.addAtributosObligatorios("Velocidad");
        mazo.addAtributosObligatorios("Altura");

        mazo.addCartas(c);
        mazo.addCartas(c1);
        mazo.addCartas(c2);
        mazo.addCartas(c3);
        mazo.addCartas(c4);
        mazo.addCartas(c5);
        mazo.addCartas(c6);
        mazo.addCartas(c7);
        //mazo.addCartas(c8);

        //System.out.println(mazo.isAtributoPresente()+" "+mazo.isCantAtributosCorrecta());

        //se crean los jugadores

        Obstinado o=new Obstinado("Obstinado");
        Timbero t= new Timbero("Timbero");
        Ambicioso a=new Ambicioso("Ambicioso");


        Jugador j1=new Jugador();
        Jugador j2=new Jugador();

        j1.addTipoEstrategia(o);
        j1.addTipoEstrategia(a);
        j1.addTipoEstrategia(t);
        j2.addTipoEstrategia(o);
        j2.addTipoEstrategia(a);
        j2.addTipoEstrategia(t);

        j1.setNombre("rodrigo");
        j2.setNombre("almen");

        j1.getMiniMazo().addAtributosObligatorios("Fuerza");
        j1.getMiniMazo().addAtributosObligatorios("Inteligencia");
        j1.getMiniMazo().addAtributosObligatorios("Velocidad");
        j1.getMiniMazo().addAtributosObligatorios("Altura");

        j2.getMiniMazo().addAtributosObligatorios("Fuerza");
        j2.getMiniMazo().addAtributosObligatorios("Inteligencia");
        j2.getMiniMazo().addAtributosObligatorios("Velocidad");
        j2.getMiniMazo().addAtributosObligatorios("Altura");

        System.out.println("nombre de jugador 1: "+j1.getNombre()+" es un jugador "+j1.getTipoEstrategia().getNombre());
        System.out.println("nombre de jugador 2: "+j2.getNombre()+" es un jugador "+j2.getTipoEstrategia().getNombre());


        //se crean las posimas
        PosimaNormal p1=new PosimaNormal("Fortalecedora",1.2);
        PosimaNormal p2=new PosimaNormal("Fortalecedora plus",1.5);
        PosimaNormal p3=new PosimaNormal("Debilitadora",0.75);
        PosimaEstatica p4= new PosimaEstatica("Vale cuatro",4);
        PosimaCompuesta p5=new PosimaCompuesta("Cocktail");
        p5.addPosimas(p3);
        p5.addPosimas(p1);
        p5.addPosimas(p2);
        //PosimaSelectiva p6=new PosimaSelectiva("Selectiva de Fuerza",1.55,);

        //se crea el juego
        Juego juego=new Juego(j1,j2,mazo);
        juego.addPosimas(p1);
        juego.addPosimas(p2);
        juego.addPosimas(p3);
        juego.addPosimas(p4);
        juego.addPosimas(p5);

        //juego.play
       if (!mazo.getCartas().isEmpty())
            juego.mezclarYrepartir();
        //System.out.println("\n Mazo jugador 1 "+j1.getMiniMazo()+"\n\n"+"Mazo jugador 2 "+j2.getMiniMazo());
        for (int i=1;i<juego.getMAXIMO_RONDAS();i++) {
            if (j1.getMiniMazo().getPrimeraCarta()==null||j2.getMiniMazo().getPrimeraCarta()==null){
                System.out.println("\nEl juego termino uno de los jugadores no tiene mas cartas");
                break;
            }
            else {
                System.out.println("------- Ronda " + i + " ----------");
                juego.jugar(j1, j2);
            }
        }
            //System.out.println("\n Mazo jugador 1 "+j1.getMiniMazo()+"\n\n"+"Mazo jugador 2 "+j2.getMiniMazo());

    }

}
