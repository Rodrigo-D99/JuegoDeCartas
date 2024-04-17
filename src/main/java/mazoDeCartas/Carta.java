package mazoDeCartas;

import mazoDeCartas.posimas.ElementoPosima;

import java.util.ArrayList;
import java.util.HashMap;

public class Carta{
    private String nomPersonaje;
    private ElementoPosima posimaUsada;
    private final HashMap<String,Integer> ATRIBUTOS;


    public Carta(String nomPersonaje) {
        this.setNomPersonaje(nomPersonaje);
        this.ATRIBUTOS =new HashMap<>();
    }
    public boolean isAtributoPresente(String s){
        //preguntar si el nombre de atributo coincide con los del mazo
        for (String st: ATRIBUTOS.keySet()){
            if (st.equalsIgnoreCase(s))
                return true;
        }
        return false;

    }

    public ArrayList<String>getNombAtributos(){
        return new ArrayList<>(ATRIBUTOS.keySet());
    }

    public boolean isCantAtributosCorrecta(ArrayList<String> c){
        return getNombAtributos().size()==c.size();
    }

    public void addAtributos(String nomb,int valor){
        if (nomb!=null&&!nomb.isBlank())
            this.ATRIBUTOS.put(nomb,Math.abs(valor));
    }

    public void removeAtributos(){
        this.ATRIBUTOS.clear();
    }
    public String getNomPersonaje() {
        return nomPersonaje;
    }
    public void setNomPersonaje(String nomPersonaje) {
        this.nomPersonaje = nomPersonaje;
    }
    public int getValorDelAtributo(String s){
        for (String st: ATRIBUTOS.keySet()) {
            if (st.equalsIgnoreCase(s)) {
              s=st;
            }
        }
        if (tienePosima())
         return posionAplicada(s);

        return ATRIBUTOS.get(s);
    }

    public int getValorSinPosima(String s){
        for (String st: ATRIBUTOS.keySet()) {
            if (st.equalsIgnoreCase(s)) {
               s=st;
            }
        }
        return ATRIBUTOS.get(s);
    }

    //get y set de posima
    public void setPosimaUsada(ElementoPosima p){
        posimaUsada=p;
    }
    public ElementoPosima getPosimaUsada() {
        return posimaUsada;
    }

    private int posionAplicada(String s){
        for (String st: ATRIBUTOS.keySet()){
            if (st.equalsIgnoreCase(s)) {
                s = st;
            }
        }
        return Math.abs(posimaUsada.aplicarPosion(getValorSinPosima(s),s));
    }


    public boolean tienePosima(){
        return getPosimaUsada() != null;
    }


    @Override
    public String toString() {
        return nomPersonaje + '\'' +
                ", atributos=" + ATRIBUTOS +'\n'
                ;
    }

}
