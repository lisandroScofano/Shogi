package shogi.entidades;

import shogi.Enumeraciones.TipoPieza;

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
    public boolean movimientoEsValido(Casilla origen, Casilla destino, Tablero tablero) {
 //El caballo tiene un movimiento complejo compuesto siempre por dos casillas adelante y una casilla hacia su derecha o izquierda. 
 //No puede desplazarse hacia atrás. Tiene por tanto solo dos movimientos posibles. Al igual que su equivalente en el ajedrez occidental, puede saltar por encima de otras piezas.    }

}
