package shogi.entidades;

import shogi.Enumeraciones.ColorJugador;
import shogi.Enumeraciones.TipoPieza;
import shogi.utilidades.MovimientosUtil;

/**
 *
 * @author lisandroscofano
 */
public class Peon extends Pieza {

    public Peon() {
        super(TipoPieza.PEON);
    }

    public Peon(String representacion, Jugador jugador) {
        super(TipoPieza.PEON, representacion, jugador);

    }

    @Override
    public boolean movimientoEsValido(Casilla casillaOrigen, Casilla casillaDestino, Tablero tablero) {
//Se mueve una casilla adelante. A diferencia del ajedrez, nunca se mueve más de una casilla y nunca come en diagonal.

        if (isCoronada()) {
            MovimientosUtil.validarMovimientoGeneralOro(casillaOrigen, casillaDestino);
        }

//movimiento Peon
        //si se mueve uno para abajo o para arriba dependiendo si sos jugador de abajo o arriba del tablero
        if (casillaOrigen.getPieza().getJugador().getColor() == ColorJugador.NEGRO && casillaOrigen.getF() - casillaDestino.getF() == -1
                || casillaOrigen.getPieza().getJugador().getColor() == ColorJugador.BLANCO && casillaOrigen.getF() - casillaDestino.getF() == 1) {
            //si se mantiene en la misma columna
            if (casillaOrigen.getC() == casillaDestino.getC()) {
                if (casillaDestino.getPieza() != null) {
                    // si la casilla a la que me quiero mover tiene una pieza mia es false
                    if (casillaOrigen.getPieza().getJugador() == casillaDestino.getPieza().getJugador()) {
                        return false;
                    }
                }
                return true;
            }
        }

        return false;

    }

}
