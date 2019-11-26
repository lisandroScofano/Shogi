package shogi.utilidades;

import java.util.Scanner;
import shogi.Enumeraciones.TipoPieza;
import shogi.entidades.Casilla;
import shogi.entidades.Pieza;
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

        Casilla[][] casillas = tablero.getTablero();

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

        for (int i = 0; i < casillas.length; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < casillas[i].length; j++) {
                if (casillas[i][j].getPieza() != null) {
                    System.out.print(casillas[i][j].getPieza().getRepresentacion());
                } else {
                    System.out.print("  ");
                }
                if (j != casillas[i].length - 1) {
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
        //posiciono las fichas del jugador 2 (blanco)
        creaFichasBlanco(jugador2, tablero);

    }

    public static Pieza solicitoPiezaAMover(Tablero tablero, Jugador jugador) {//solicito datos para movimiento y valido que la ficha corresponda al jugador
        Scanner input = new Scanner(System.in);

        Pieza ficha = new Pieza();
        int fila;
        int columna;
        boolean correspondeAlJugador = false;
        int intento = 0;
        do {
            if (intento > 0) {
                System.out.println("La ficha ingresada no es correcta, por favor revise las coordenadas");
            }
            fila = PiezaUtil.solicitoFila();

            columna = PiezaUtil.solicitoColumna();

            ficha = PiezaUtil.buscarPiezaPorUbicacion(tablero, fila, columna);
            if (ficha != null) {
                correspondeAlJugador = PiezaUtil.verificarPiezaCorrespondeAJugador(ficha, jugador);
            }
            intento++;
        } while (!correspondeAlJugador);
        return ficha;
    }

    public static Casilla solicitoCasillaDestinoPieza() {
        Casilla casilla = new Casilla();
        casilla.setF(PiezaUtil.solicitoFila());
        casilla.setC(PiezaUtil.solicitoColumna());
        return casilla;
    }

    public static boolean validoMovimiento(Pieza pieza, Casilla origen, Casilla destino) {
        boolean esValido;
        TipoPieza tipoFicha = pieza.getTipoPieza();
        switch (tipoFicha) {
            case ALFIL:
                esValido = MovimientosUtil.validarMovimientoAlfil(pieza, origen, destino);
                break;
            case ALFIL_PROMOCIONADO:
                esValido = MovimientosUtil.validarMovimientoAlfilCoronado(pieza, origen, destino);
                break;
            case CABALLO:
                esValido = MovimientosUtil.validarMovimientoCaballo(pieza, origen, destino);
                break;
            case CABALLO_PROMOCIONADO:
                esValido = MovimientosUtil.validarMovimientoCaballoCoronado(pieza, origen, destino);
                break;
            case GENERAL_DE_ORO:
                esValido = MovimientosUtil.validarMovimientoGeneralOro(pieza, origen, destino);
                break;
            case GENERAL_DE_PLATA:
                esValido = MovimientosUtil.validarMovimientoGeneralPlata(pieza, origen, destino);
                break;
            case GENERAL_DE_PLATA_PROMOCIONADO:
                esValido = MovimientosUtil.validarMovimientoGeneralPlataCoronado(pieza, origen, destino);
                break;
            case LANCERO:
                esValido = MovimientosUtil.validarMovimientoLancero(pieza, origen, destino);
                break;
            case LANCERO_PROMOCIONADO:
                esValido = MovimientosUtil.validarMovimientoLanceroCoronado(pieza, origen, destino);
                break;
            case PEON:
                esValido = MovimientosUtil.validarMovimientoPeon(pieza, origen, destino);
                break;
            case PEON_PROMOCIONADO:
                esValido = MovimientosUtil.validarMovimientoPeonCoronado(pieza, origen, destino);
                break;
            case REY:
                esValido = MovimientosUtil.validarMovimientoRey(pieza, origen, destino);
                break;
            case TORRE:
                esValido = MovimientosUtil.validarMovimientoTorre(pieza, origen, destino);
                break;
            case TORRE_PROMOCIONADA:
                esValido = MovimientosUtil.validarMovimientoTorreCoronada(pieza, origen, destino);
                break;
            default:
                esValido = false;
                break;
        }
        return esValido;
    }

    public static void moverPieza(Casilla origen, Casilla destino) {
        destino.setPieza(origen.getPieza());
        origen.setPieza(null);
    }
}
