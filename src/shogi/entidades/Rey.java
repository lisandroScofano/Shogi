package shogi.entidades;

import shogi.Enumeraciones.TipoPieza;

/**
 *
 * @author lisandroscofano
 */
public class Rey extends Pieza {

    public Rey() {
        super(TipoPieza.REY);
    }

    public Rey(String representacion, Jugador jugador) {
        super(TipoPieza.REY, representacion, jugador);
    }

    @Override
    public boolean movimientoEsValido(Casilla casillaOrigen, Casilla casillaDestino, Tablero tablero) {
    //	El rey tiene movimientos idénticos a los del rey en el ajedrez occidentalː se mueve una casilla en cualquier dirección.
    //Los reyes no pueden coronarse.
        if (casillaDestino.getPieza() != null) {
            if (casillaOrigen.getPieza().getJugador() == casillaDestino.getPieza().getJugador()) {
                return false;//si en la casilla de destino hay una ficha del mismo jugador
            }
        }
        
        //si la diferencia entre origen y destino es 1 (positivo o negativo) esta ok
        if ((Math.abs(casillaOrigen.getC() - casillaDestino.getC()) <= 1)
                && Math.abs(casillaOrigen.getF() - casillaDestino.getF()) <= 1) {
            return true;
        }
        return false;
    }

}
