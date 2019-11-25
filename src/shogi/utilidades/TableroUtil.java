package shogi.utilidades;

import java.util.Scanner;
import shogi.entidades.Ficha;
import shogi.entidades.Jugador;
import shogi.entidades.Tablero;
import static shogi.utilidades.CreaFichasBlancas.creaFichasBlanco;
import static shogi.utilidades.CreaFichasNegras.creaFichasNegro;

/**
 *
 * @author lisandroscofano
 */
public class TableroUtil {

    public static void imprimirTablero(Tablero tablero) {

        Ficha[][] fichas = tablero.getTablero();

        System.out.print("   ");
        for (int i = 0; i < 9; i++) {
            System.out.print(i);
            System.out.print("\t");

        }
        System.out.println("");
        System.out.print("  +");

        for (int i = 0; i < 63; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println("");

        for (int i = 0; i < fichas.length; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < fichas[i].length; j++) {
                if (fichas[i][j] != null) {
                    System.out.print(fichas[i][j].getRepresentacion().toString());
                } else {
                    System.out.print("  ");
                }
                if (j != fichas[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        System.out.print("  +");

        for (int i = 0; i < 63; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println("");
    }

    public static void armarTableroInicio(Jugador jugador1, Jugador jugador2, Tablero tablero) {
        //posiciono las fichas del jugador 1 (negro)
        creaFichasNegro(jugador1, tablero);
        creaFichasBlanco(jugador2, tablero);

    }

    public static void solicitoMovimiento(Jugador jugador) {//solicito datos para movimiento y valido que la ficha corresponda al jugador
        Scanner input = new Scanner(System.in);

        int fila;
        int columna;
        do {
            System.out.println("Ingrese el numero de fila de la ficha que desea mover (Numeros enteros del 0 al 8):");
            fila = input.nextInt();
        } while ((fila > 8) || (fila < 0));

        do {
            System.out.println("Ingrese el numero de columna de la ficha que desea mover (Numeros enteros del 0 al 8):");
            columna = input.nextInt();
        } while ((columna > 8) || (columna < 0));

    }
}
