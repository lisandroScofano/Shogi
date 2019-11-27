package shogi.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lisandroscofano
 */
public class Tablero {

    private Casilla tablero[][] = new Casilla[9][9];
    private List<Pieza> fichas = new ArrayList<>();

    public Tablero() {
        //agergo casilleros al tablero
        for (int f = 0; f < tablero.length; f++) {
            for (int c = 0; c < tablero[f].length; c++) {
                tablero[f][c] = new Casilla(f, c);
            }
        }
    }

    public Casilla[][] getTablero() {
        return tablero;
    }

    public void setTablero(Casilla[][] tablero) {
        this.tablero = tablero;
    }

    public Casilla getCasilla(int f, int c) {
        return tablero[f][c];
    }

    public List<Pieza> getFichas() {
        return fichas;
    }

    public void setFichas(List<Pieza> fichas) {
        this.fichas = fichas;
    }

    public void agregarFicha(Pieza ficha) {
        this.fichas.add(ficha);
    }

    @Override
    public String toString() {
        return "Tablero{" + "tablero=" + tablero + ", fichas=" + fichas + '}';
    }

}
