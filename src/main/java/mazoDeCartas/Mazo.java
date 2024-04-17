package mazoDeCartas;

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

    public Mazo() {
        this.cartas=new ArrayList<>();
        this.atributosObligatorios =new ArrayList<>();
        setCantMaxAtributos();
    }

    public ArrayList<String> getAtributosObligatorios() {
        return new ArrayList<>(atributosObligatorios);
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
        if (cartas.isEmpty()){
            cartas.add(c);
            atributosObligatorios.addAll(c.getNombAtributos());
        }
        else if (isCantAtributosCorrecta(c)&&isAtributoPresente(c))
            cartas.add(c);
    }

    public boolean isCantAtributosCorrecta(Carta c){
        return c.isCantAtributosCorrecta(atributosObligatorios);
    }

    public boolean isAtributoPresente(Carta c){
        for (String s:atributosObligatorios) {
            if (!c.isAtributoPresente(s))
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
    @Override
    public String toString() {
        return "Mazo{" +
                "cartas=" + cartas +
                ", atributosObligatorios=" + atributosObligatorios +
                ", cantMaxAtributos=" + cantMaxAtributos +
                '}';
    }
}
