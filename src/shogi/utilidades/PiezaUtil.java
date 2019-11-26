package shogi.utilidades;

import java.util.Scanner;
import shogi.entidades.Casilla;
import shogi.entidades.Pieza;
import shogi.entidades.Jugador;
import shogi.entidades.Tablero;

/**
 *
 * @author lisandroscofano
 *
 * https://es.wikipedia.org/wiki/Sh%C5%8Dgi#C%C3%B3mo_promover_o_coronar_las_piezas
 *
 * https://es.wikipedia.org/wiki/Sh%C5%8Dgi#C%C3%B3mo_reintroducir_piezas
 */
public class PiezaUtil {

    public void reingresarFicha(Pieza pieza) {
        //debo reingresarla en la posicion que desee el jugador siguiendo las reglas 
    }

    public static Pieza buscarPiezaPorUbicacion(Tablero tablero, int x, int y) {
        Casilla[][] casillas = tablero.getTablero();
        Pieza piezaBuscada = casillas[x][y].getPieza();
        if (piezaBuscada == null) {
            return null;
        } else {
            return piezaBuscada;
        }
    }

    public static boolean verificarPiezaCorrespondeAJugador(Pieza pieza, Jugador jugador) {
        return pieza.getJugador().equals(jugador);//devuelve true si la pieza corresponde al jugador, sino false
    }

    public static int solicitoFila() {
        Scanner input = new Scanner(System.in);
        int fila;
        do {
            System.out.println("Ingrese el numero de fila de la pieza que desea mover (Numeros enteros del 0 al 8):");
            while (!input.hasNextInt()) {
                System.out.println("Por favor ingresar solo numeros enteros entre 0 y 8 para la fila");
                input.next();
            }
            fila = input.nextInt();
        } while ((fila > 8) || (fila < 0));
        return fila;
    }

    public static int solicitoColumna() {
        Scanner input = new Scanner(System.in);
        int columna;
        do {
            System.out.println("Ingrese el numero de columna de la pieza que desea mover (Numeros enteros del 0 al 8):");
            while (!input.hasNextInt()) {
                System.out.println("Por favor ingresar solo numeros enteros entre 0 y 8 para la columna");
                input.next();
            }
            columna = input.nextInt();
        } while ((columna > 8) || (columna < 0));
        return columna;
    }

    public static Casilla obtengoCasillaActualPieza(Tablero tablero, Pieza pieza) {
        Casilla casillas[][] = tablero.getTablero();
        Casilla casilla = new Casilla();
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[0].length; j++) {
                if (casillas[i][j].equals(pieza)) {
                    casilla = casillas[i][j];
                }
            }
        }
        return casilla;
    }

}
