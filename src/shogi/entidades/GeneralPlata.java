package shogi.entidades;

import shogi.Enumeraciones.TipoPieza;

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
    public boolean movimientoEsValido(Casilla origen, Casilla destino, Tablero tablero) {
//Una casilla en diagonal, o bien vertical adelante, es decir, cinco movimientos posibles.
    }

}
