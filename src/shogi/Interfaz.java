/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shogi;

import java.util.Scanner;
import shogi.Enumeraciones.ColorJugador;
import shogi.entidades.Jugador;
import shogi.entidades.Tablero;
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
        int jugada = 1;


        while (!jaqueMate) {
            System.out.println("************ Turno Jugador " + jugador1.getNombre() + " - Color: " + jugador1.getColor() + " ************");
            System.out.println("Jugada Nº " + jugada);

            jaqueMate = true;
        }

    }

}
