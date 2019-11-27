/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shogi.utilidades;

import shogi.Enumeraciones.TipoPieza;
import shogi.entidades.Alfil;
import shogi.entidades.Caballo;
import shogi.entidades.Casilla;
import shogi.entidades.GeneralOro;
import shogi.entidades.GeneralPlata;
import shogi.entidades.Jugador;
import shogi.entidades.Lancero;
import shogi.entidades.Peon;
import shogi.entidades.Rey;
import shogi.entidades.Tablero;
import shogi.entidades.Torre;

/**
 *
 * @author lisandroscofano
 */
public class CreaFichasNegras {

    public static void creaFichasNegro(Jugador jugador1, Tablero tablero) {
        Casilla casillas[][] = tablero.getTablero();
        //agrego rey negro
        casillas[8][4].setPieza(new Rey(TipoPieza.REY.getAbreviacion() + "^", jugador1));
        //agrego 2 generales de oro negros
        casillas[8][5].setPieza(new GeneralOro(TipoPieza.GENERAL_DE_ORO.getAbreviacion() + "^", jugador1));
        casillas[8][3].setPieza(new GeneralOro(TipoPieza.GENERAL_DE_ORO.getAbreviacion() + "^", jugador1));
        //agrego 2 generales de plata negros
        casillas[8][6].setPieza(new GeneralPlata(TipoPieza.GENERAL_DE_PLATA.getAbreviacion() + "^", jugador1));
        casillas[8][2].setPieza(new GeneralPlata(TipoPieza.GENERAL_DE_PLATA.getAbreviacion() + "^", jugador1));
        //agrego 2 caballos negros
        casillas[8][7].setPieza(new Caballo(TipoPieza.CABALLO.getAbreviacion() + "^", jugador1));
        casillas[8][1].setPieza(new Caballo(TipoPieza.CABALLO.getAbreviacion() + "^", jugador1));
        //agrego 2 lanceros negros
        casillas[8][8].setPieza(new Lancero(TipoPieza.LANCERO.getAbreviacion() + "^", jugador1));
        casillas[8][0].setPieza(new Lancero(TipoPieza.LANCERO.getAbreviacion() + "^", jugador1));
        //agrego alfil negro
        casillas[7][1].setPieza(new Alfil(TipoPieza.ALFIL.getAbreviacion() + "^", jugador1));
        //agrego torre negra
        casillas[7][7].setPieza(new Torre(TipoPieza.TORRE.getAbreviacion() + "^", jugador1));

        //agrego los 9 peones negros
        for (int i = 0; i < 9; i++) {
            casillas[6][i].setPieza(new Peon(TipoPieza.PEON.getAbreviacion() + "^", jugador1));
        }

    }
}
