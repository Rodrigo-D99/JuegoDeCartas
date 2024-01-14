package JuegoDeCartas.src.main.java.mazoDeCartas;

import java.util.ArrayList;

public class Mazo{
   private ArrayList<Carta> cartas;
   private ArrayList<String> atributosObligatorios;
   private int cantMaxAtributos;

    public Mazo(ArrayList<Carta> cartas, ArrayList<String> atributosObligatorios, int cantMaxAtributos) {
        this.cartas = cartas;
        this.atributosObligatorios = atributosObligatorios;
        this.cantMaxAtributos = cantMaxAtributos;
    }

    public Mazo(int cantMaxAtributos) {
        this.cartas=new ArrayList<>();
        this.atributosObligatorios =new ArrayList<>();
        this.cantMaxAtributos = cantMaxAtributos;
    }

    public ArrayList<String> getAtributosObligatorios() {
        return new ArrayList<>(atributosObligatorios);
    }

    public void addAtributosObligatorios(String atributo) {
        this.atributosObligatorios.add(atributo) ;
    }

    public int getCantMaxAtributos() {
        return cantMaxAtributos;
    }

    public void setCantMaxAtributos(int cantMaxAtributos) {
        this.cantMaxAtributos = cantMaxAtributos;
    }

    public ArrayList<Carta> getCartas() {
        return new ArrayList<>(cartas);
    }
    public int getNumCartas() {
        int suma=0;
             for(Carta c: cartas){
                 suma+=c.getNumCartas();
             }
        return suma;
    }

    public void addCartas(Carta c){
        //if (isAtributoPresente()&&isCantAtributosCorrecta())
            cartas.add(c);
    }
    public void isCartaEsCorrecta(){
        ArrayList<Carta>aux=new ArrayList<>();
        for (Carta c:cartas){
            if(!c.isCantAtributosCorrecta(cantMaxAtributos)){
                aux.add(c);
            }
            else{
                for (String s:atributosObligatorios) {
                    if (!c.isAtributoPresente(s)){
                        aux.add(c);
                        break;
                    }
                }
            }
        }
    }
    public boolean isCantAtributosCorrecta(){
        for (Carta c:cartas){
            if (c.isCantAtributosCorrecta(cantMaxAtributos))
                //no se si es necesario el if
                return true;
        }
        return false;
    }

    public boolean isAtributoPresente(){
        for (Carta c:cartas){
            for (String s:atributosObligatorios) {
                if (c.isAtributoPresente(s))
                    //no se si es necesario el if
                    return true;
            }
        }
        return false;
    }

    public void borrarCarta(Carta c){
        cartas.remove(c);
    }

    /*public void mezclar(){
        int posAleatoria=0;
        Carta c;
        for (Carta carta : cartas) {
            posAleatoria = (int) (Math.random() * this.getNumCartas());
            Carta pos=cartas.get(posAleatoria);

            //c se vuelve la carta en pos 0
            c = carta;
            //la carta en pos 0 se vuelve la pos aleatoria
            carta =pos;
            //la carta en pos se pone en la pos 0
            pos = c;
        }
    }*/

    @Override
    public String toString() {
        return "Mazo{" +
                "cartas=" + cartas +
                ", atributosObligatorios=" + atributosObligatorios +
                ", cantMaxAtributos=" + cantMaxAtributos +
                '}';
    }
}
