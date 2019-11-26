/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shogi.utilidades;

import shogi.Enumeraciones.TipoPieza;
import shogi.entidades.Casilla;
import shogi.entidades.Pieza;
import shogi.entidades.Jugador;
import shogi.entidades.Tablero;

/**
 *
 * @author lisandroscofano
 */
public class CreaFichasNegras {

    public static void creaFichasNegro(Jugador jugador1, Tablero tablero) {
        Casilla casillas[][] = tablero.getTablero();
        //agrego rey negro
        casillas[8][4].setPieza(new Pieza(TipoPieza.REY.getAbreviacion() + "^", TipoPieza.REY, jugador1));
        //agrego 2 generales de oro negros
        casillas[8][5].setPieza(new Pieza(TipoPieza.GENERAL_DE_ORO.getAbreviacion() + "^", TipoPieza.GENERAL_DE_ORO, jugador1));
        casillas[8][3].setPieza(new Pieza(TipoPieza.GENERAL_DE_ORO.getAbreviacion() + "^", TipoPieza.GENERAL_DE_ORO, jugador1));
        //agrego 2 generales de plata negros
        casillas[8][6].setPieza(new Pieza(TipoPieza.GENERAL_DE_PLATA.getAbreviacion() + "^", TipoPieza.GENERAL_DE_PLATA, jugador1));
        casillas[8][2].setPieza(new Pieza(TipoPieza.GENERAL_DE_PLATA.getAbreviacion() + "^", TipoPieza.GENERAL_DE_PLATA, jugador1));
        //agrego 2 caballos negros
        casillas[8][7].setPieza(new Pieza(TipoPieza.CABALLO.getAbreviacion() + "^", TipoPieza.CABALLO, jugador1));
        casillas[8][1].setPieza(new Pieza(TipoPieza.CABALLO.getAbreviacion() + "^", TipoPieza.CABALLO, jugador1));
        //agrego 2 lanceros negros
        casillas[8][8].setPieza(new Pieza(TipoPieza.LANCERO.getAbreviacion() + "^", TipoPieza.LANCERO, jugador1));
        casillas[8][0].setPieza(new Pieza(TipoPieza.LANCERO.getAbreviacion() + "^", TipoPieza.LANCERO, jugador1));
        //agrego alfil negro
        casillas[7][1].setPieza(new Pieza(TipoPieza.ALFIL.getAbreviacion() + "^", TipoPieza.ALFIL, jugador1));
        //agrego torre negra
        casillas[7][7].setPieza(new Pieza(TipoPieza.TORRE.getAbreviacion() + "^", TipoPieza.TORRE, jugador1));

        //agrego los 9 peones negros
        for (int i = 0; i < 9; i++) {
            casillas[6][i].setPieza(new Pieza(TipoPieza.PEON.getAbreviacion() + "^", TipoPieza.PEON, jugador1));
        }

    }
}
