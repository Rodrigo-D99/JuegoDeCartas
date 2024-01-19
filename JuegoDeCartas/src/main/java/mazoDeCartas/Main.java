package JuegoDeCartas.src.main.java.mazoDeCartas;


public class Main {
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
        c2.addAtributos("Altura",158);

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

        //se crea el mazo
        Mazo mazo=new Mazo(4);
        mazo.addCartas(c);
        mazo.addCartas(c1);
        mazo.addCartas(c2);
        mazo.addCartas(c3);
        mazo.addCartas(c4);
        mazo.addCartas(c5);
        mazo.addCartas(c6);
        mazo.addCartas(c7);
        mazo.isCartaEsCorrecta();
        mazo.addAtributosObligatorios("Fuerza");
        mazo.addAtributosObligatorios("Inteligencia");
        mazo.addAtributosObligatorios("Velocidad");
        mazo.addAtributosObligatorios("Altura");
        //System.out.println(mazo.isAtributoPresente()+" "+mazo.isCantAtributosCorrecta());

        //se crean los jugadores
        Jugador j1=new Jugador(4);
        Jugador j2=new Jugador(4);
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

        System.out.println("nombre de jugador 1: "+j1.getNombre());
        System.out.println("nombre de jugador 2: "+j2.getNombre());

        //se crea el juego
        Juego juego=new Juego(j1,j2,mazo);
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
