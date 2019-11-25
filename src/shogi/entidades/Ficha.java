package shogi.entidades;

import shogi.Enumeraciones.TipoFicha;

/**
 *
 * @author lisandroscofano
 */
public class Ficha {

    private String representacion;
    private TipoFicha tipoFicha;
    private Jugador jugador;

    public Ficha() {

    }

    public Ficha(String representacion, TipoFicha tipoFicha, Jugador jugador) {
        this.representacion = representacion;
        this.tipoFicha = tipoFicha;
        this.jugador = jugador;
    }

    public TipoFicha getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(TipoFicha tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getRepresentacion() {
        return representacion;
    }

    public void setRepresentacion(String representacion) {
        this.representacion = representacion;
    }

    @Override
    public String toString() {
        return "Ficha{" + "representacion=" + representacion + ", tipoFicha=" + tipoFicha + ", jugador=" + jugador + '}';
    }

}
