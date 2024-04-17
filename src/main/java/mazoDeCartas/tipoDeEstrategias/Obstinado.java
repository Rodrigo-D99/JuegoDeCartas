package mazoDeCartas.tipoDeEstrategias;

import mazoDeCartas.Carta;
import mazoDeCartas.Jugador;

import java.util.ArrayList;

public class Obstinado extends EstrategiaJuego{
    private String atDelObstinado;
    private boolean noEligioAtributo;

    public Obstinado(String n) {
        super(n);
        this.atDelObstinado = getAtDelObstinado();
    }

    public String getAtDelObstinado() {
        return atDelObstinado;
    }

    public String elegirAtDelObstinado(Carta c) {
        ArrayList<String> aux = new ArrayList<>(c.getNombAtributos());
        int atributoAleatroio= (int) (Math.random()*aux.size());
        return atDelObstinado = aux.get(atributoAleatroio);
    }

    public boolean isEligioAtributo() {
        return noEligioAtributo;
    }

    public void setEligioAtributo(boolean noEligioAtributo) {
        this.noEligioAtributo = noEligioAtributo;
    }

    @Override
    public String getAtributoElegido(Carta c) {
        //si no elijio un atributo lo elije y despues
        //siempre elije el mismo atributo
        if (!isEligioAtributo()) {
            setEligioAtributo(true);
            return elegirAtDelObstinado(c);
        }
        return getAtDelObstinado();

    }

}
