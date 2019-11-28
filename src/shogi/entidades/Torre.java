package shogi.entidades;

import shogi.Enumeraciones.TipoPieza;

/**
 *
 * @author lisandroscofano
 */
public class Torre extends Pieza {

    public Torre() {
        super(TipoPieza.TORRE);
    }

    public Torre(String representacion, Jugador jugador) {
        super(TipoPieza.TORRE, representacion, jugador);

    }

    @Override
    public boolean movimientoEsValido(Casilla casillaOrigen, Casilla casillaDestino, Tablero tablero) {

        if (isCoronada()) {//	Puede desplazarse como la torre, o bien una casilla en diagonal.
            if ((Math.abs(casillaOrigen.getC() - casillaDestino.getC()) <= 1)
                    && Math.abs(casillaOrigen.getF() - casillaDestino.getF()) <= 1) {
                return true;
            }
        }
        //Se desplaza idénticamente a la torre del ajedrez, esto es, cualquier número de casillas libres vertical u horizontalmente.

        //verifico si en casilla de destino hay pieza del mismo jugador que esta moviendo
        if (casillaDestino.getPieza() != null) {
            if (casillaOrigen.getPieza().getJugador() == casillaDestino.getPieza().getJugador()) {
                return false;
            }
        }
        //verifico que no mueva en diagonal
        if (casillaOrigen.getC() != casillaDestino.getC() && casillaOrigen.getF() != casillaDestino.getF()) {
            return false;
        }

        //movimiento lateral
        if (casillaOrigen.getC() - casillaDestino.getC() > 0) {
            for (int i = casillaOrigen.getC() - 1; i > casillaDestino.getC(); i--) {
                // valido que las casillas intermedias esten vacias
                if (tablero.getCasilla(casillaOrigen.getF(), i).getPieza() != null) {
                    return false;
                }
            }
        }

        //movimiento lateral
        if (casillaOrigen.getC() - casillaDestino.getC() < 0) {
            for (int i = casillaOrigen.getC() + 1; i < casillaDestino.getC(); i++) {
                // valido que las casillas intermedias esten vacias
                if (tablero.getCasilla(casillaOrigen.getF(), i).getPieza() != null) {
                    return false;
                }
            }
        }

        //movimiento descendente
        if (casillaOrigen.getF() - casillaDestino.getF() < 0) {
            for (int i = casillaOrigen.getF() + 1; i < casillaDestino.getF(); i++) {
                // valido que las casillas intermedias esten vacias
                if (tablero.getCasilla(i, casillaOrigen.getC()).getPieza() != null) {
                    return false;
                }
            }
        }

        //movimiento ascendente
        if (casillaOrigen.getF() - casillaDestino.getF() > 0) {
            for (int i = casillaOrigen.getF() - 1; i > casillaDestino.getF(); i--) {
                // valido que las casillas intermedias esten vacias
                if (tablero.getCasilla(i, casillaOrigen.getC()).getPieza() != null) {
                    return false;
                }
            }
        }

        return true;
    }
}
