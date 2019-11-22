package shogi.entidades;

import shogi.Enumeraciones.TipoFicha;

/**
 *
 * @author lisandroscofano
 */
public class Ficha {

    TipoFicha tipoFicha;
    boolean coronado;
    Jugador jugador;

    public Ficha(TipoFicha tipoFicha, boolean coronado, Jugador jugador) {
        this.tipoFicha = tipoFicha;
        this.coronado = false;
        this.jugador = jugador;
    }

    public TipoFicha getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(TipoFicha tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public boolean isCoronado() {
        return coronado;
    }

    public void setCoronado(boolean coronado) {
        this.coronado = coronado;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Ficha{" + "tipoFicha=" + tipoFicha + ", coronado=" + coronado + ", jugador=" + jugador + '}';
    }

}
