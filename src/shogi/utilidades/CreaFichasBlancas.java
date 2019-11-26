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
import shogi.entidades.Rey;
import shogi.entidades.Tablero;

/**
 *
 * @author lisandroscofano
 */
public class CreaFichasBlancas {

    public static void creaFichasBlanco(Jugador jugador2, Tablero tablero) {
        Casilla casillas[][] = tablero.getTablero();
        //agrego al rey blanco
        casillas[0][4].setPieza(new Rey(TipoPieza.REY.getAbreviacion() + "v", TipoPieza.REY, jugador2));
        //agrego a los 2 generales de oro blanco
        casillas[0][5].setPieza(new Pieza(TipoPieza.GENERAL_DE_ORO.getAbreviacion() + "v", TipoPieza.GENERAL_DE_ORO, jugador2));
        casillas[0][3].setPieza(new Pieza(TipoPieza.GENERAL_DE_ORO.getAbreviacion() + "v", TipoPieza.GENERAL_DE_ORO, jugador2));
        //agrego a los 2 generales de plata blanco
        casillas[0][6].setPieza(new Pieza(TipoPieza.GENERAL_DE_PLATA.getAbreviacion() + "v", TipoPieza.GENERAL_DE_PLATA, jugador2));
        casillas[0][2].setPieza(new Pieza(TipoPieza.GENERAL_DE_PLATA.getAbreviacion() + "v", TipoPieza.GENERAL_DE_PLATA, jugador2));
        //agrego a los 2 caballos blancos
        casillas[0][7].setPieza(new Pieza(TipoPieza.CABALLO.getAbreviacion() + "v", TipoPieza.CABALLO, jugador2));
        casillas[0][1].setPieza(new Pieza(TipoPieza.CABALLO.getAbreviacion() + "v", TipoPieza.CABALLO, jugador2));
        //agergo a los 2 lanceros blancos
        casillas[0][8].setPieza(new Pieza(TipoPieza.LANCERO.getAbreviacion() + "v", TipoPieza.LANCERO, jugador2));
        casillas[0][0].setPieza(new Pieza(TipoPieza.LANCERO.getAbreviacion() + "v", TipoPieza.LANCERO, jugador2));
        //agrego al alfil blanco
        casillas[1][7].setPieza(new Pieza(TipoPieza.ALFIL.getAbreviacion() + "v", TipoPieza.ALFIL, jugador2));
        //agrego a la torre blanca
        casillas[1][1].setPieza(new Pieza(TipoPieza.TORRE.getAbreviacion() + "v", TipoPieza.TORRE, jugador2));

        //agrego los 9 peones blancos
        for (int i = 0; i < 9; i++) {
            casillas[2][i].setPieza(new Pieza(TipoPieza.PEON.getAbreviacion() + "v", TipoPieza.PEON, jugador2));
        }

    }
}
