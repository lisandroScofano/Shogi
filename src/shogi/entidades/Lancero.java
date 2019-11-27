package shogi.entidades;

import shogi.Enumeraciones.TipoPieza;

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
    public boolean movimientoEsValido(Casilla origen, Casilla destino, Tablero tablero) {
//Se mueve cualquier número de casillas libres verticalmente hacia adelante. No puede desplazarse hacia atrás
    }

}
