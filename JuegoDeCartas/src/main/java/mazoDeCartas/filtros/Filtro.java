package JuegoDeCartas.src.main.java.mazoDeCartas.filtros;

import JuegoDeCartas.src.main.java.mazoDeCartas.Carta;

import java.util.HashMap;

public abstract class Filtro {
    //cumple de String porque se filtra por los atributos
    public abstract boolean cumple(String c);
}
