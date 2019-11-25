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
public class CreaFichasNegras {

    public static void creaFichasNegro(Jugador jugador1, Tablero tablero) {
        Ficha fichas[][] = tablero.getTablero();

        Ficha reyNegro = new Ficha(TipoFicha.REY.getAbreviacion() + "^", TipoFicha.REY, jugador1);
        tablero.agregarFicha(reyNegro);
        fichas[8][4] = reyNegro;

        Ficha generalOroNegro1 = new Ficha(TipoFicha.GENERAL_DE_ORO.getAbreviacion() + "^", TipoFicha.GENERAL_DE_ORO, jugador1);
        tablero.agregarFicha(generalOroNegro1);
        fichas[8][5] = generalOroNegro1;

        Ficha generalOroNegro2 = new Ficha(TipoFicha.GENERAL_DE_ORO.getAbreviacion() + "^", TipoFicha.GENERAL_DE_ORO, jugador1);
        tablero.agregarFicha(generalOroNegro2);
        fichas[8][3] = generalOroNegro2;

        Ficha generalPlataNegro1 = new Ficha(TipoFicha.GENERAL_DE_PLATA.getAbreviacion() + "^", TipoFicha.GENERAL_DE_PLATA, jugador1);
        tablero.agregarFicha(generalPlataNegro1);
        fichas[8][6] = generalPlataNegro1;

        Ficha generalPlataNegro2 = new Ficha(TipoFicha.GENERAL_DE_PLATA.getAbreviacion() + "^", TipoFicha.GENERAL_DE_PLATA, jugador1);
        tablero.agregarFicha(generalPlataNegro2);
        fichas[8][2] = generalPlataNegro2;

        Ficha caballoNegro1 = new Ficha(TipoFicha.CABALLO.getAbreviacion() + "^", TipoFicha.CABALLO, jugador1);
        tablero.agregarFicha(caballoNegro1);
        fichas[8][7] = caballoNegro1;

        Ficha caballoNegro2 = new Ficha(TipoFicha.CABALLO.getAbreviacion() + "^", TipoFicha.CABALLO, jugador1);
        tablero.agregarFicha(caballoNegro2);
        fichas[8][1] = caballoNegro2;

        Ficha lanceroNegro1 = new Ficha(TipoFicha.LANCERO.getAbreviacion() + "^", TipoFicha.LANCERO, jugador1);
        tablero.agregarFicha(lanceroNegro1);
        fichas[8][8] = lanceroNegro1;

        Ficha lanceroNegro2 = new Ficha(TipoFicha.LANCERO.getAbreviacion() + "^", TipoFicha.LANCERO, jugador1);
        tablero.agregarFicha(lanceroNegro2);
        fichas[8][0] = lanceroNegro2;

        Ficha alfilNegro = new Ficha(TipoFicha.ALFIL.getAbreviacion() + "^", TipoFicha.ALFIL, jugador1);
        tablero.agregarFicha(alfilNegro);
        fichas[7][1] = alfilNegro;

        Ficha torreNegro = new Ficha(TipoFicha.TORRE.getAbreviacion() + "^", TipoFicha.TORRE, jugador1);
        tablero.agregarFicha(torreNegro);
        fichas[7][7] = torreNegro;

        Ficha peonNegro1 = new Ficha(TipoFicha.PEON.getAbreviacion() + "^", TipoFicha.PEON, jugador1);
        tablero.agregarFicha(peonNegro1);
        fichas[6][0] = peonNegro1;

        Ficha peonNegro2 = new Ficha(TipoFicha.PEON.getAbreviacion() + "^", TipoFicha.PEON, jugador1);
        tablero.agregarFicha(peonNegro2);
        fichas[6][1] = peonNegro2;

        Ficha peonNegro3 = new Ficha(TipoFicha.PEON.getAbreviacion() + "^", TipoFicha.PEON, jugador1);
        tablero.agregarFicha(peonNegro3);
        fichas[6][2] = peonNegro3;

        Ficha peonNegro4 = new Ficha(TipoFicha.PEON.getAbreviacion() + "^", TipoFicha.PEON, jugador1);
        tablero.agregarFicha(peonNegro4);
        fichas[6][3] = peonNegro4;

        Ficha peonNegro5 = new Ficha(TipoFicha.PEON.getAbreviacion() + "^", TipoFicha.PEON, jugador1);
        tablero.agregarFicha(peonNegro5);
        fichas[6][4] = peonNegro5;

        Ficha peonNegro6 = new Ficha(TipoFicha.PEON.getAbreviacion() + "^", TipoFicha.PEON, jugador1);
        tablero.agregarFicha(peonNegro6);
        fichas[6][5] = peonNegro6;

        Ficha peonNegro7 = new Ficha(TipoFicha.PEON.getAbreviacion() + "^", TipoFicha.PEON, jugador1);
        tablero.agregarFicha(peonNegro7);
        fichas[6][6] = peonNegro7;

        Ficha peonNegro8 = new Ficha(TipoFicha.PEON.getAbreviacion() + "^", TipoFicha.PEON, jugador1);
        tablero.agregarFicha(peonNegro8);
        fichas[6][7] = peonNegro8;

        Ficha peonNegro9 = new Ficha(TipoFicha.PEON.getAbreviacion() + "^", TipoFicha.PEON, jugador1);
        tablero.agregarFicha(peonNegro9);
        fichas[6][8] = peonNegro9;

    }
}
