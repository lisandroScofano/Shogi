package shogi.utilidades;

import shogi.Enumeraciones.ColorJugador;
import shogi.entidades.Casilla;
import shogi.entidades.Pieza;

/**
 *
 * @author lisandroscofano Pagina con reglas: https://es.wikipedia.org/wiki/Sh%C5%8Dgi#Piezas
 */
public class MovimientosUtil {

    public static boolean validarMovimientoGeneralOro(Casilla casillaOrigen, Casilla casillaDestino) {
        //Una casilla en vertical, horizontal o diagonalmente adelante. No puede desplazarse diagonalmente hacia atrás.
        if ((Math.abs(casillaOrigen.getF() - casillaDestino.getF()) <= 1
                && (Math.abs(casillaOrigen.getC() - casillaDestino.getC()) <= 1))) {
            if (casillaOrigen.getPieza().getJugador().getColor() == ColorJugador.NEGRO) {
                //Si se mueve para atras reviso que la diagonal
                if (casillaOrigen.getF() - casillaDestino.getF() == 1) {
                    if (casillaOrigen.getC() != casillaDestino.getC()) {
                        return false;
                    }
                }
            } else if (casillaOrigen.getPieza().getJugador().getColor() == ColorJugador.BLANCO) {
                //Si se mueve para atras reviso que la diagonal
                if (casillaOrigen.getF() - casillaDestino.getF() == -1) {
                    if (casillaOrigen.getC() != casillaDestino.getC()) {
                        return false;
                    }
                }
            }
            if (casillaDestino.getPieza() != null) {
                if (casillaOrigen.getPieza().getJugador() == casillaDestino.getPieza().getJugador()) {
                    return false;
                }
            }
            return true;
        }
        return false;

    }
}
