package JuegoDeCartas.src.main.java.mazoDeCartas.tipoDeEstrategias;

import JuegoDeCartas.src.main.java.mazoDeCartas.Jugador;

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

    public String elegirAtDelObstinado(Jugador j) {
        int atributoAleatroio= (int) (Math.random()*j.getMiniMazo().getAtributosObligatorios().size());
        return atDelObstinado = j.getMiniMazo().getAtributosObligatorios().get(atributoAleatroio);
    }

    public boolean isEligioAtributo() {
        return noEligioAtributo;
    }

    public void setEligioAtributo(boolean noEligioAtributo) {
        this.noEligioAtributo = noEligioAtributo;
    }

    @Override
    public String getAtributoElegido(Jugador j) {
        if (!noEligioAtributo) {
            setEligioAtributo(true);
            return elegirAtDelObstinado(j);
        }
        return getAtDelObstinado();

    }

}
