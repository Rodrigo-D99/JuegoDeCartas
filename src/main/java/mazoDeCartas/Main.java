package mazoDeCartas;



import mazoDeCartas.filtros.FiltroAtributo;
import mazoDeCartas.posimas.*;
import mazoDeCartas.tipoDeEstrategias.Ambicioso;
import mazoDeCartas.tipoDeEstrategias.Obstinado;
import mazoDeCartas.tipoDeEstrategias.Timbero;

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
        Carta c8=new Carta("cell");
        Carta c9=new Carta("frizzer");
        Carta c10=new Carta("broly");
        Carta c11=new Carta("yamcha");
        Carta c12=new Carta("radits");
        Carta c13=new Carta("Yo");
        Carta c14=new Carta("bbbbbbbbb");
        Carta c15=new Carta("aaaaaaaaaa");

        c.addAtributos("Fuerza",3000);
        c.addAtributos("Inteligencia",30);
        c.addAtributos("Velocidad",2500);
        c.addAtributos("Altura",185);

        c1.addAtributos("fuerza",2600);
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
        c6.addAtributos("Altura",190);

        c7.addAtributos("Fuerza",1000);
        c7.addAtributos("Inteligencia",600);
        c7.addAtributos("Velocidad",800);
        c7.addAtributos("Altura",195);

        c8.addAtributos("Fuerza",1000);
        c8.addAtributos("Inteligencia",600);
        c8.addAtributos("Velocidad",1500);
        c8.addAtributos("Altura",1708);

        c9.addAtributos("Fuerza",500);
        c9.addAtributos("Inteligencia",400);
        c9.addAtributos("Velocidad",300);
        c9.addAtributos("Altura",1580);

        c10.addAtributos("Fuerza",200);
        c10.addAtributos("Inteligencia",1000);
        c10.addAtributos("Velocidad",150);
        c10.addAtributos("Altura",166);

        c11.addAtributos("Fuerza",400);
        c11.addAtributos("Inteligencia",700);
        c11.addAtributos("Velocidad",250);
        c11.addAtributos("Altura",170);

        c12.addAtributos("Fuerza",1500);
        c12.addAtributos("Inteligencia",600);
        c12.addAtributos("Velocidad",1000);
        c12.addAtributos("Altura",178);

        c13.addAtributos("Fuerza",1500);
        c13.addAtributos("Inteligencia",900);
        c13.addAtributos("Velocidad",1000);
        c13.addAtributos("Altura",178);

        c14.addAtributos("Fuerza",1000);
        c14.addAtributos("Inteligencia",2300);
        c14.addAtributos("Velocidad",800);
        c14.addAtributos("Altura",178);

        c15.addAtributos("Fuerza",1000);
        c15.addAtributos("Inteligencia",600);
        c15.addAtributos("Velocidad",3000);
        c15.addAtributos("Altura",178);
        //se crea el mazo

        Mazo mazo=new Mazo();

        mazo.addCartas(c);
        mazo.addCartas(c1);
        mazo.addCartas(c2);
        mazo.addCartas(c3);
        mazo.addCartas(c4);
        mazo.addCartas(c5);
        mazo.addCartas(c6);
        mazo.addCartas(c7);
        mazo.addCartas(c8);
        mazo.addCartas(c9);
        mazo.addCartas(c10);
        mazo.addCartas(c11);
        mazo.addCartas(c12);
        mazo.addCartas(c13);
        mazo.addCartas(c14);
        mazo.addCartas(c15);

        System.out.println("Cantidad de cartas en el mazo "+mazo.getCartas().size());
        //se crean las estrategias

        Obstinado o=new Obstinado("Obstinado");
        Timbero t= new Timbero("Timbero");
        Ambicioso a=new Ambicioso("Ambicioso");

        //se crean los jugadores
        Jugador j1=new Jugador(t);
        Jugador j2=new Jugador(t);

        j1.setNombre("Jugador 1");
        j2.setNombre("Jugador 2");

        System.out.println("nombre de jugador 1: "+j1.getNombre()+" es un jugador "+j1.getTipoEstrategia().getNombre());
        System.out.println("nombre de jugador 2: "+j2.getNombre()+" es un jugador "+j2.getTipoEstrategia().getNombre());


        //se crean las posimas
        FiltroAtributo f=new FiltroAtributo("fuerza");
        FiltroAtributo f2=new FiltroAtributo("inteligencia");

        PosimaNormal p1=new PosimaNormal("Fortalecedora",1.2);
        PosimaNormal p2=new PosimaNormal("Fortalecedora plus",1.5);
        PosimaNormal p3=new PosimaNormal("Debilitadora",0.75);
        PosimaEstatica p4= new PosimaEstatica("Vale cuatro",4);
        PosimaCompuesta p5=new PosimaCompuesta("Cocktail");

        PosimaSelectiva p6=new PosimaSelectiva("Selectiva de Fuerza",1.55,f);
        PosimaSelectiva p7=new PosimaSelectiva("Selectiva de Inteligencia",1.60,f2);

        PosimaNormal p8=new PosimaNormal("Debilitadora plus",0.50);
        PosimaCompuesta p9=new PosimaCompuesta("Cocktail2");
        PosimaEstatica p10= new PosimaEstatica("Número Mágico",23);

        p5.addPosimas(p3);
        p5.addPosimas(p1);
        p5.addPosimas(p2);

        p9.addPosimas(p6);
        p9.addPosimas(p5);


        //se crea el juego
        Juego juego=new Juego(j1,j2,mazo);
        //se le agregan las posimas
        juego.addPosimas(p1);
        juego.addPosimas(p2);
        juego.addPosimas(p3);
        juego.addPosimas(p4);
        juego.addPosimas(p5);
        juego.addPosimas(p6);
        juego.addPosimas(p7);
        juego.addPosimas(p8);
        juego.addPosimas(p9);
        juego.addPosimas(p10);

        //juego.play

        if (!mazo.getCartas().isEmpty())
            juego.mezclarYrepartir();
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
    }

}
