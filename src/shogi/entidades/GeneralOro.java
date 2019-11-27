package shogi.entidades;

import shogi.Enumeraciones.ColorJugador;
import shogi.Enumeraciones.TipoPieza;

/**
 *
 * @author lisandroscofano
 */
public class GeneralOro extends Pieza {

    public GeneralOro() {
        super(TipoPieza.GENERAL_DE_ORO);
    }

    public GeneralOro(String representacion, Jugador jugador) {
        super(TipoPieza.GENERAL_DE_ORO, representacion, jugador);
    }

    @Override
    public boolean movimientoEsValido(Casilla casillaOrigen, Casilla casillaDestino, Tablero tablero) {
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
