package JuegoDeCartas.src.main.java.mazoDeCartas;

import java.util.HashMap;

public class Carta{
    private String nomPersonaje;
    private HashMap<String,Integer> atributos;
    
    public Carta(String nomPersonaje) {
        this.setNomPersonaje(nomPersonaje);
        this.atributos=new HashMap<>();

    }
    public boolean isCantAtributosCorrecta(int cant){
        //preguntar si la cantidad de atributos coincide con los del mazo
        return cant==this.atributos.size();
    }
    public boolean isAtributoPresente(String s){
        //preguntar si el nombre de atributo coincide con los del mazo
        return this.atributos.containsKey(s);
    }

    public HashMap<String, Integer> getAtributos() {
        return new HashMap<>(atributos);
    }

    public void addAtributos(String nomb, int valor){
        this.atributos.put(nomb,Math.abs(valor));
    }
    public String getNomPersonaje() {
        return nomPersonaje;
    }

    public void setNomPersonaje(String nomPersonaje) {
        this.nomPersonaje = nomPersonaje;
    }


    public int getNumCartas() {
        return 1;
    }


    @Override
    public String toString() {
        return nomPersonaje + '\'' +
                ", atributos=" + atributos+'\n'
                ;
    }
}
