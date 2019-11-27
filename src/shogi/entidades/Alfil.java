package shogi.entidades;

import shogi.Enumeraciones.TipoPieza;

/**
 *
 * @author lisandroscofano
 */
public class Alfil extends Pieza{
    
    public Alfil() {
        super(TipoPieza.ALFIL);
    }

    public Alfil(String representacion, Jugador jugador) {
        super(TipoPieza.ALFIL, representacion, jugador);
    }

    @Override
    public boolean movimientoEsValido(Casilla origen, Casilla destino, Tablero tablero) {
//Se desplaza idénticamente al alfil del ajedrez occidentalː puede desplazarse cualquier número de casillas libres en diagonal.    
    }

}
