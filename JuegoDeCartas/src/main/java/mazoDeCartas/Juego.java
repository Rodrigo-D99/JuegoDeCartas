package mazoDeCartas;


import java.util.ArrayList;

public abstract class Juego {

    private Mazo mazo;

    public Juego() {

    }

    public ArrayList<ArrayList<Carta>> mezclarYrepartir(){
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
        ArrayList<ArrayList<Carta>>resp=new ArrayList<>();
        resp.add(aux);
        resp.add(aux2);
        return resp;
    }

    public void jugar(Carta c1,Carta c2){
        Jugador j1,j2;
        for (En)
        if (c1.getAtributos().keySet().equals(c2.getAtributos().keySet())){

    }
}
