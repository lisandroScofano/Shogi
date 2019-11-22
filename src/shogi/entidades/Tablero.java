package shogi.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lisandroscofano
 */
public class Tablero {

    int tablero[][] = new int[9][9];
    List<Ficha> fichas = new ArrayList<Ficha>();

    public Tablero() {
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    public void agregarFicha(Ficha ficha) {
        this.fichas.add(ficha);
    }

    @Override
    public String toString() {
        return "Tablero{" + "tablero=" + tablero + ", fichas=" + fichas + '}';
    }

}
