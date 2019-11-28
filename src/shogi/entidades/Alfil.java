package shogi.entidades;

import shogi.Enumeraciones.TipoPieza;

/**
 *
 * @author lisandroscofano
 */
public class Alfil extends Pieza {

    public Alfil() {
        super(TipoPieza.ALFIL);
    }

    public Alfil(String representacion, Jugador jugador) {
        super(TipoPieza.ALFIL, representacion, jugador);
    }

    @Override
    public boolean movimientoEsValido(Casilla casillaOrigen, Casilla casillaDestino, Tablero tablero) {
//Se desplaza idénticamente al alfil del ajedrez occidentalː puede desplazarse cualquier número de casillas libres en diagonal.    

        if (isCoronada()) {
            //revisar si no es || en vez de &&
            if ((Math.abs(casillaOrigen.getC() - casillaDestino.getC()) <= 1)
                    && Math.abs(casillaOrigen.getF() - casillaDestino.getF()) <= 1) {
                return true;
            }
        }
        // si se mueve la misma cantidad de casillas para los costados que para arriba o abajo es diagonal
        if (Math.abs(casillaOrigen.getF() - casillaDestino.getF()) == Math.abs(casillaOrigen.getC() - casillaDestino.getC())) {
            int dirC = casillaDestino.getC() > casillaOrigen.getC() ? 1 : -1;
            int dirF = casillaDestino.getF() > casillaOrigen.getF() ? 1 : -1;
            for (int i = 1; i < Math.abs(casillaDestino.getC() - casillaOrigen.getC()); i++) {//verifico que las casillas entre origen y destino esten vacias
                if (tablero.getCasilla(casillaOrigen.getF() + i * dirF, casillaOrigen.getC() + i * dirC).getPieza() != null) {
                    return false;
                }
            }

            if (casillaDestino.getPieza() != null) {
                //valido que en la casilla de destino no haya una pieza del mismo jugador que mueve
                if (casillaOrigen.getPieza().getJugador() == casillaDestino.getPieza().getJugador()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
