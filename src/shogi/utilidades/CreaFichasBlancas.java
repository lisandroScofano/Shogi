/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shogi.utilidades;

import shogi.Enumeraciones.TipoFicha;
import shogi.entidades.Ficha;
import shogi.entidades.Jugador;
import shogi.entidades.Tablero;

/**
 *
 * @author lisandroscofano
 */
public class CreaFichasBlancas {

    public static void creaFichasBlanco(Jugador jugador2, Tablero tablero) {
        Ficha fichas[][] = tablero.getTablero();

        Ficha reyBlanco = new Ficha(TipoFicha.REY.getAbreviacion() + "v", TipoFicha.REY, jugador2);
        tablero.agregarFicha(reyBlanco);
        fichas[0][4] = reyBlanco;

        Ficha generalOroBlanco1 = new Ficha(TipoFicha.GENERAL_DE_ORO.getAbreviacion() + "v", TipoFicha.GENERAL_DE_ORO, jugador2);
        tablero.agregarFicha(generalOroBlanco1);
        fichas[0][5] = generalOroBlanco1;

        Ficha generalOroBlanco2 = new Ficha(TipoFicha.GENERAL_DE_ORO.getAbreviacion() + "v", TipoFicha.GENERAL_DE_ORO, jugador2);
        tablero.agregarFicha(generalOroBlanco2);
        fichas[0][3] = generalOroBlanco2;

        Ficha generalPlataBlanco1 = new Ficha(TipoFicha.GENERAL_DE_PLATA.getAbreviacion() + "v", TipoFicha.GENERAL_DE_PLATA, jugador2);
        tablero.agregarFicha(generalPlataBlanco1);
        fichas[0][6] = generalPlataBlanco1;

        Ficha generalPlataBlanco2 = new Ficha(TipoFicha.GENERAL_DE_PLATA.getAbreviacion() + "v", TipoFicha.GENERAL_DE_PLATA, jugador2);
        tablero.agregarFicha(generalPlataBlanco2);
        fichas[0][2] = generalPlataBlanco2;

        Ficha caballoBlanco1 = new Ficha(TipoFicha.CABALLO.getAbreviacion() + "v", TipoFicha.CABALLO, jugador2);
        tablero.agregarFicha(caballoBlanco1);
        fichas[0][7] = caballoBlanco1;

        Ficha caballoBlanco2 = new Ficha(TipoFicha.CABALLO.getAbreviacion() + "v", TipoFicha.CABALLO, jugador2);
        tablero.agregarFicha(caballoBlanco2);
        fichas[0][1] = caballoBlanco2;

        Ficha lanceroBlanco1 = new Ficha(TipoFicha.LANCERO.getAbreviacion() + "v", TipoFicha.LANCERO, jugador2);
        tablero.agregarFicha(lanceroBlanco1);
        fichas[0][8] = lanceroBlanco1;

        Ficha lanceroBlanco2 = new Ficha(TipoFicha.LANCERO.getAbreviacion() + "v", TipoFicha.LANCERO, jugador2);
        tablero.agregarFicha(lanceroBlanco2);
        fichas[0][0] = lanceroBlanco2;

        Ficha alfilBlanco = new Ficha(TipoFicha.ALFIL.getAbreviacion() + "v", TipoFicha.ALFIL, jugador2);
        tablero.agregarFicha(alfilBlanco);
        fichas[1][7] = alfilBlanco;

        Ficha torreBlanco = new Ficha(TipoFicha.TORRE.getAbreviacion() + "v", TipoFicha.TORRE, jugador2);
        tablero.agregarFicha(torreBlanco);
        fichas[1][1] = torreBlanco;

        Ficha peonBlanco1 = new Ficha(TipoFicha.PEON.getAbreviacion() + "v", TipoFicha.PEON, jugador2);
        tablero.agregarFicha(peonBlanco1);
        fichas[2][0] = peonBlanco1;

        Ficha peonBlanco2 = new Ficha(TipoFicha.PEON.getAbreviacion() + "v", TipoFicha.PEON, jugador2);
        tablero.agregarFicha(peonBlanco2);
        fichas[2][1] = peonBlanco2;

        Ficha peonBlanco3 = new Ficha(TipoFicha.PEON.getAbreviacion() + "v", TipoFicha.PEON, jugador2);
        tablero.agregarFicha(peonBlanco3);
        fichas[2][2] = peonBlanco3;

        Ficha peonBlanco4 = new Ficha(TipoFicha.PEON.getAbreviacion() + "v", TipoFicha.PEON, jugador2);
        tablero.agregarFicha(peonBlanco4);
        fichas[2][3] = peonBlanco4;

        Ficha peonBlanco5 = new Ficha(TipoFicha.PEON.getAbreviacion() + "v", TipoFicha.PEON, jugador2);
        tablero.agregarFicha(peonBlanco5);
        fichas[2][4] = peonBlanco5;

        Ficha peonBlanco6 = new Ficha(TipoFicha.PEON.getAbreviacion() + "v", TipoFicha.PEON, jugador2);
        tablero.agregarFicha(peonBlanco6);
        fichas[2][5] = peonBlanco6;

        Ficha peonBlanco7 = new Ficha(TipoFicha.PEON.getAbreviacion() + "v", TipoFicha.PEON, jugador2);
        tablero.agregarFicha(peonBlanco7);
        fichas[2][6] = peonBlanco7;

        Ficha peonBlanco8 = new Ficha(TipoFicha.PEON.getAbreviacion() + "v", TipoFicha.PEON, jugador2);
        tablero.agregarFicha(peonBlanco8);
        fichas[2][7] = peonBlanco8;

        Ficha peonBlanco9 = new Ficha(TipoFicha.PEON.getAbreviacion() + "v", TipoFicha.PEON, jugador2);
        tablero.agregarFicha(peonBlanco9);
        fichas[2][8] = peonBlanco9;

    }
}
