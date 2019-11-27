package shogi.entidades;

import shogi.Enumeraciones.ColorJugador;
import shogi.Enumeraciones.TipoPieza;
import shogi.utilidades.MovimientosUtil;

/**
 *
 * @author lisandroscofano
 */
public class Lancero extends Pieza {

    public Lancero() {
        super(TipoPieza.LANCERO);
    }

    public Lancero(String representacion, Jugador jugador) {
        super(TipoPieza.LANCERO, representacion, jugador);

    }

    @Override
    public boolean movimientoEsValido(Casilla casillaOrigen, Casilla casillaDestino, Tablero tablero) {
        //Se mueve cualquier número de casillas libres verticalmente hacia adelante. No puede desplazarse hacia atrás
        if (isCoronada()) {
            MovimientosUtil.validarMovimientoGeneralOro(casillaOrigen, casillaDestino);
        }
        //reviso que se mueva en la misma columna verticalmente
        if (casillaOrigen.getC() == casillaDestino.getC()) {
            if (casillaOrigen.getPieza().getJugador().getColor() == ColorJugador.NEGRO) {
                //reviso que se mueva para arriba
                if (casillaOrigen.getF() - casillaDestino.getF() > 0) {
                    //reviso si hay piezas en el camino a la nueva posicion
                    for (int i = casillaOrigen.getF() - 1; i > casillaDestino.getF(); i--) {
                        if (tablero.getCasilla(i, casillaOrigen.getC()).getPieza() != null) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            if (casillaOrigen.getPieza().getJugador().getColor() == ColorJugador.BLANCO) {
                //reviso que se mueva para abajo y dentro de la misma columna
                if (casillaOrigen.getC() == casillaDestino.getC()) {
                    if (casillaOrigen.getF() - casillaDestino.getF() < 0) {
                        //reviso si hay piezas en el camino a la nueva posicion
                        for (int i = casillaOrigen.getF() + 1; i < casillaDestino.getF(); i++) {
                            if (tablero.getCasilla(i, casillaOrigen.getC()).getPieza() != null) {
                                return false;
                            }
                        }
                    }
                } else {
                    return false;
                }
            }
            //reviso si hay una ficha que no sea del mismo jugador que mueve
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
