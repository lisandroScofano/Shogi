package shogi.utilidades;

import java.util.Scanner;
import shogi.entidades.Ficha;
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
public class FichaUtil {

    public void reingresarFicha(Ficha ficha) {
        //debo reingresarla en la posicion que desee el jugador siguiendo las reglas 
    }

    public static Ficha buscarFichaPorUbicacion(Tablero tablero, int x, int y) {
        Ficha[][] ficha = tablero.getTablero();
        Ficha fichaBuscada = ficha[x][y];
        if (fichaBuscada == null) {
            return null;
        } else {
            return fichaBuscada;
        }
    }

    public static boolean verificarFichaCorrespondeAJugador(Ficha ficha, Jugador jugador) {
        return ficha.getJugador().equals(jugador);//devuelve true si la ficha corresponde al jugador, sino false
    }

    public static int solicitoFila() {
        Scanner input = new Scanner(System.in);
        int fila;
        do {
            System.out.println("Ingrese el numero de fila de la ficha que desea mover (Numeros enteros del 0 al 8):");
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
            System.out.println("Ingrese el numero de columna de la ficha que desea mover (Numeros enteros del 0 al 8):");
            while (!input.hasNextInt()) {
                System.out.println("Por favor ingresar solo numeros enteros entre 0 y 8 para la columna");
                input.next();
            }
            columna = input.nextInt();
        } while ((columna > 8) || (columna < 0));
        return columna;
    }

    public static int[] obtengoPosicionActualFicha(Tablero tablero, Ficha ficha) {
        Ficha fichas[][] = tablero.getTablero();
        int posicionOriginal[] = new int[2];
        for (int i = 0; i < fichas.length; i++) {
            for (int j = 0; j < fichas[0].length; j++) {
                if (fichas[i][j].equals(ficha)) {
                    posicionOriginal[0] = i;
                    posicionOriginal[1] = j;
                }
            }
        }
        return posicionOriginal;
    }

}
