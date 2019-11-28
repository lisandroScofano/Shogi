package shogi.entidades;

import shogi.Enumeraciones.ColorJugador;
import shogi.Enumeraciones.TipoPieza;
import shogi.utilidades.MovimientosUtil;

/**
 *
 * @author lisandroscofano
 */
public class Caballo extends Pieza {

    public Caballo() {
        super(TipoPieza.CABALLO);
    }

    public Caballo(String representacion, Jugador jugador) {
        super(TipoPieza.CABALLO, representacion, jugador);

    }

    @Override
    public boolean movimientoEsValido(Casilla casillaOrigen, Casilla casillaDestino, Tablero tablero) {
        if (isCoronada()) {
            MovimientosUtil.validarMovimientoGeneralOro(casillaOrigen, casillaDestino);
        }
        //El caballo tiene un movimiento complejo compuesto siempre por dos casillas adelante y una casilla hacia su derecha o izquierda. 
        //No puede desplazarse hacia atrás. Tiene por tanto solo dos movimientos posibles. Al igual que su equivalente en el ajedrez occidental, puede saltar por encima de otras piezas.    }

        if (casillaOrigen.getPieza().getJugador().getColor() == ColorJugador.NEGRO) {
            //valido movimiento de caballo hacia arriba
            if (casillaOrigen.getF() - casillaDestino.getF() != 2 || Math.abs(casillaOrigen.getC() - casillaDestino.getC()) != 1) {
                return false;
            }
        }
        if (casillaOrigen.getPieza().getJugador().getColor() == ColorJugador.BLANCO) {
            //valido movimiento de caballo hacia abajo
            if (casillaOrigen.getF() - casillaDestino.getF() != -2 || Math.abs(casillaOrigen.getC() - casillaDestino.getC()) != 1) {
                return false;
            }
        }

        if (casillaDestino.getPieza() != null) {
            //verifico que la casilla de destino no este ocupada por pieza del jugador que mueve	
            if (casillaOrigen.getPieza().getJugador() == casillaDestino.getPieza().getJugador()) {
                return false;
            }
        }

        return true;
    }
}
