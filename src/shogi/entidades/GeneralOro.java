package shogi.entidades;

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
    public boolean movimientoEsValido(Casilla origen, Casilla destino, Tablero tablero) {
//Una casilla en vertical, horizontal o diagonalmente adelante. No puede desplazarse diagonalmente hacia atrás.
    }

}
