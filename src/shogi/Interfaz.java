/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shogi;

import java.util.Scanner;
import shogi.Enumeraciones.ColorJugador;
import shogi.entidades.Pieza;
import shogi.entidades.Jugador;
import shogi.entidades.Tablero;
import shogi.entidades.Casilla;
import shogi.utilidades.PiezaUtil;
import shogi.utilidades.JugadorUtil;
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

            Pieza ficha = TableroUtil.solicitoPiezaAMover(tablero1, jugadorActual);

            Casilla casillaOriginal = PiezaUtil.obtengoCasillaActualPieza(tablero1, ficha);
            Casilla casillaDestino = TableroUtil.solicitoCasillaDestinoPieza();
             esValido = TableroUtil.validoMovimiento(ficha, casillaOriginal, casillaDestino);

            if (esValido) {
                TableroUtil.moverPieza(casillaOriginal, casillaDestino);
            }
            
            jugadorActual = JugadorUtil.alternaJugadorVigente(jugadorActual, jugador1, jugador2);
            jugada++;
        }

    }

}
