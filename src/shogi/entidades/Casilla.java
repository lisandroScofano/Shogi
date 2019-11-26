package shogi.entidades;

/**
 *
 * @author lisandroscofano
 */
public class Casilla {

    private int f;
    private int c;
    private Pieza pieza;

    public Casilla() {
    }

    public Casilla(int f, int c) {
        this.f = f;
        this.c = c;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "Casilla{" + "f=" + f + ", c=" + c + ", pieza=" + pieza + '}';
    }

}
