package shogi.entidades;

import shogi.Enumeraciones.TipoPieza;

/**
 *
 * @author lisandroscofano
 */
public class Rey extends Pieza{
    
    public Rey(){
        super.setTipoPieza(TipoPieza.REY);
        super.setRepresentacion(TipoPieza.REY.getAbreviacion()); 
    }
    
        public Rey(Jugador jugador){
        super.setTipoPieza(TipoPieza.REY);
        super.setRepresentacion(TipoPieza.REY.getAbreviacion()); 
        super.setJugador(jugador);
    }

    @Override
    public boolean movimientoEsValido(Casilla origen, Casilla destino, Tablero tablero) {
        return super.movimientoEsValido(origen, destino, tablero); 
    }

}
