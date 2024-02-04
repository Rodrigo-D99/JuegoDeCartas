package JuegoDeCartas.src.main.java.mazoDeCartas;

import java.util.ArrayList;
import java.util.HashMap;

public class Mazo{
   private ArrayList<Carta> cartas;
   private ArrayList<String> atributosObligatorios;
   private int cantMaxAtributos;

    public Mazo(ArrayList<Carta> cartas, ArrayList<String> atributosObligatorios, int cantMaxAtributos) {
        this.cartas = cartas;
        this.atributosObligatorios = atributosObligatorios;
        this.cantMaxAtributos = cantMaxAtributos;
    }

    public Mazo() {
        this.cartas=new ArrayList<>();
        this.atributosObligatorios =new ArrayList<>();
        setCantMaxAtributos();
    }

    public ArrayList<String> getAtributosObligatorios() {
        return new ArrayList<>(atributosObligatorios);
    }

    public void addAtributosObligatorios(String atributo) {
        this.atributosObligatorios.add(atributo.toUpperCase()) ;
    }

    public void removeAtributosObligatorios(String atributo) {
        this.atributosObligatorios.remove(atributo.toUpperCase());
    }
    public int getCantMaxAtributos() {
        return cantMaxAtributos;
    }

    public void setCantMaxAtributos() {
        this.cantMaxAtributos = atributosObligatorios.size();
    }

    public ArrayList<Carta> getCartas() {
        return new ArrayList<>(cartas);
    }

    public void addCartas(Carta c){
        if (isCantAtributosCorrecta(c)&&isAtributoPresente(c))
            cartas.add(c);

    }


    public void corregirMazo(){
        //este metodo sirve si me cambian los atributos obligatorios
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
    public boolean isCantAtributosCorrecta(Carta c){
        return c.getAtributos().size()==atributosObligatorios.size();
    }

    public boolean isAtributoPresente(Carta c){
            for (String s:atributosObligatorios) {
                if (!c.isAtributoPresente(s.toUpperCase()))
                    return false;
            }
        return true;
    }

    public void borrarCarta(Carta c){
        cartas.remove(c);
    }

    public Carta getPrimeraCarta(){
        if (this.getCartas().isEmpty()) {
            return null;
        }
        return this.getCartas().getFirst();
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
