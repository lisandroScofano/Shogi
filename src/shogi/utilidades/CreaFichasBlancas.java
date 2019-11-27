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
public class CreaFichasBlancas {

    public static void creaFichasBlanco(Jugador jugador2, Tablero tablero) {
        Casilla casillas[][] = tablero.getTablero();
        //agrego al rey blanco
        casillas[0][4].setPieza(new Rey(TipoPieza.REY.getAbreviacion() + "v", jugador2));
        //agrego a los 2 generales de oro blanco
        casillas[0][5].setPieza(new GeneralOro(TipoPieza.GENERAL_DE_ORO.getAbreviacion() + "v", jugador2));
        casillas[0][3].setPieza(new GeneralOro(TipoPieza.GENERAL_DE_ORO.getAbreviacion() + "v", jugador2));
        //agrego a los 2 generales de plata blanco
        casillas[0][6].setPieza(new GeneralPlata(TipoPieza.GENERAL_DE_PLATA.getAbreviacion() + "v", jugador2));
        casillas[0][2].setPieza(new GeneralPlata(TipoPieza.GENERAL_DE_PLATA.getAbreviacion() + "v", jugador2));
        //agrego a los 2 caballos blancos
        casillas[0][7].setPieza(new Caballo(TipoPieza.CABALLO.getAbreviacion() + "v", jugador2));
        casillas[0][1].setPieza(new Caballo(TipoPieza.CABALLO.getAbreviacion() + "v", jugador2));
        //agergo a los 2 lanceros blancos
        casillas[0][8].setPieza(new Lancero(TipoPieza.LANCERO.getAbreviacion() + "v", jugador2));
        casillas[0][0].setPieza(new Lancero(TipoPieza.LANCERO.getAbreviacion() + "v", jugador2));
        //agrego al alfil blanco
        casillas[1][7].setPieza(new Alfil(TipoPieza.ALFIL.getAbreviacion() + "v", jugador2));
        //agrego a la torre blanca
        casillas[1][1].setPieza(new Torre(TipoPieza.TORRE.getAbreviacion() + "v", jugador2));

        //agrego los 9 peones blancos
        for (int i = 0; i < 9; i++) {
            casillas[2][i].setPieza(new Peon(TipoPieza.PEON.getAbreviacion() + "v", jugador2));
        }

    }
}
