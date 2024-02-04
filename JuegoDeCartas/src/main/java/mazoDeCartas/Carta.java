package JuegoDeCartas.src.main.java.mazoDeCartas;

import java.util.HashMap;

public class Carta{
    private String nomPersonaje;
    private String nomPosimaUsada;
    private HashMap<String,Integer> atributos;
    private HashMap<String,Integer> atributosModificados;
    public Carta(String nomPersonaje) {
        this.setNomPersonaje(nomPersonaje);
        this.atributos=new HashMap<>();
        this.atributosModificados=new HashMap<>();
        this.nomPosimaUsada=getNomPosimaUsada();
    }
    public boolean isCantAtributosCorrecta(int cant){
        //preguntar si la cantidad de atributos coincide con los del mazo
        return cant==this.atributos.size();
    }
    public boolean isAtributoPresente(String s){
        //preguntar si el nombre de atributo coincide con los del mazo
        return this.atributos.containsKey(s.toUpperCase());
    }

    public HashMap<String, Integer> getAtributos() {
        return new HashMap<>(atributos);
    }
    public HashMap<String, Integer> getAtributosModificados() {
        return new HashMap<>(atributosModificados);
    }
    public void addAtributos(String nomb, int valor){
        this.atributos.put(nomb.toUpperCase(),Math.abs(valor));
    }
    public void addAllAtributos(HashMap<String,Integer> h){
        this.atributosModificados.putAll(h);
    }
    public void removeAtributos(){
        this.atributos.clear();
    }
    public String getNomPersonaje() {
        return nomPersonaje;
    }

    public void setNomPersonaje(String nomPersonaje) {
        this.nomPersonaje = nomPersonaje;
    }

    public String getNomPosimaUsada() {
        return nomPosimaUsada;
    }
    public void setNomPosimaUsada(String nomPosimaUsada) {
        this.nomPosimaUsada = nomPosimaUsada;
    }

    public boolean seAplicoPosima(){
        return getNomPosimaUsada() != null;
    }
    @Override
    public String toString() {
        return nomPersonaje + '\'' +
                ", atributos=" + atributos+'\n'
                ;
    }
}
