package shogi.entidades;

import shogi.Enumeraciones.ColorJugador;
import shogi.Enumeraciones.TipoPieza;
import shogi.utilidades.MovimientosUtil;

/**
 *
 * @author lisandroscofano
 */
public class GeneralPlata extends Pieza {

    public GeneralPlata() {
        super(TipoPieza.GENERAL_DE_PLATA);
    }

    public GeneralPlata(String representacion, Jugador jugador) {
        super(TipoPieza.GENERAL_DE_PLATA, representacion, jugador);

    }

    @Override
    public boolean movimientoEsValido(Casilla casillaOrigen, Casilla casillaDestino, Tablero tablero) {
        if (isCoronada()) {
            MovimientosUtil.validarMovimientoGeneralOro(casillaOrigen, casillaDestino);
        }
        //Una casilla en diagonal, o bien vertical adelante, es decir, cinco movimiencasillaDestinos posibles.
        	if(((Math.abs(casillaOrigen.getF() - casillaDestino.getF()) <= 1) 
                        && ((Math.abs(casillaOrigen.getC() - casillaDestino.getC()) <= 1)))) {
			if(casillaOrigen.getPieza().getJugador().getColor() == ColorJugador.NEGRO) {
				//controlo que la ficha no se mueva para atras
				if(casillaOrigen.getF() - casillaDestino.getF() == -1) {
					if(casillaOrigen.getC() == casillaDestino.getC()) {
						return false;
					}
				}
			} else if(casillaOrigen.getPieza().getJugador().getColor() == ColorJugador.BLANCO) {
 				//controlo que la ficha no se mueva para atras
				if(casillaOrigen.getF() - casillaDestino.getF() == 1) {
					if(casillaOrigen.getC() == casillaDestino.getC()) {
						return false;
					}
				}
			}
			
			//verifico si solo se mueve para los costados (ni arriba ni abajo)
			if(casillaOrigen.getF() == casillaDestino.getF()) {
				return false;
			}   
			if(casillaDestino.getPieza() != null) {
                            //verifico que si la casilla esta ocupada no sea una pieza del jugador que mueve
				if(casillaOrigen.getPieza().getJugador()== casillaDestino.getPieza().getJugador()) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}

