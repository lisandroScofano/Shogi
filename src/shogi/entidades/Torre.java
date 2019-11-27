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
    public boolean movimientoEsValido(Casilla origen, Casilla destino, Tablero tablero) {
//Se desplaza idénticamente a la torre del ajedrez, esto es, cualquier número de casillas libres vertical u horizontalmente.    }

}
