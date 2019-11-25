package shogi.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lisandroscofano
 */
public class Tablero {

    private Ficha tablero[][] = new Ficha[9][9];
    private List<Ficha> fichas = new ArrayList<>();

    public Tablero() {
    }

    public Ficha[][] getTablero() {
        return tablero;
    }

    public void setTablero(Ficha[][] tablero) {
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
