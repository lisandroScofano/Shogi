/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shogi;

import java.util.Scanner;
import shogi.Enumeraciones.ColorJugador;
import shogi.entidades.Ficha;
import shogi.entidades.Jugador;
import shogi.entidades.Tablero;
import shogi.utilidades.FichaUtil;
import shogi.utilidades.JugadorUtil;
import shogi.utilidades.MovimientosUtil;
import shogi.utilidades.TableroUtil;

/**
 *
 * @author lisandroscofano
 */
public class Interfaz {

    public Interfaz() {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese el nombre del primer jugador (Negro):");
        Jugador jugador1 = new Jugador(input.nextLine(), ColorJugador.NEGRO);

        System.out.println("Por favor ingrese el nombre del segundo jugador (Blanco):");
        Jugador jugador2 = new Jugador(input.nextLine(), ColorJugador.BLANCO);

        Tablero tablero1 = new Tablero();

        TableroUtil.armarTableroInicio(jugador1, jugador2, tablero1);

        TableroUtil.imprimirTablero(tablero1);

        boolean jaqueMate = false;
        boolean esValido = false;
        int jugada = 1;
        Jugador jugadorActual = jugador1;

        while (jaqueMate == false) {
            System.out.println("************ Turno Jugador " + jugadorActual.getNombre() + " - Color: " + jugadorActual.getColor() + " ************");
            System.out.println("Jugada Nº " + jugada);

            Ficha ficha = TableroUtil.solicitoPiezaAMover(tablero1, jugadorActual);

            int[] posicionOriginal = FichaUtil.obtengoPosicionActualFicha(tablero1, ficha);
            int[] destino = TableroUtil.solicitoDestinoPieza();
             esValido = TableroUtil.validoMovimiento(ficha, posicionOriginal, destino);

            if (esValido) {
                TableroUtil.moverFicha(ficha, posicionOriginal, destino, tablero1);
            }
            
            jugadorActual = JugadorUtil.alternaJugadorVigente(jugadorActual, jugador1, jugador2);
            jugada++;
        }

    }

}
