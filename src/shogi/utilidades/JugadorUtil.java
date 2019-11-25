package shogi.utilidades;

import shogi.entidades.Jugador;

/**
 *
 * @author lisandroscofano
 */
public class JugadorUtil {

    public static Jugador alternaJugadorVigente(Jugador jugadorActual, Jugador jugador1, Jugador jugador2) {
        if (jugadorActual.equals(jugador1)) {//cambio el jugador en turno
            jugadorActual = jugador2;
        } else {
            jugadorActual = jugador1;
        }
        return jugadorActual;
    }
}
