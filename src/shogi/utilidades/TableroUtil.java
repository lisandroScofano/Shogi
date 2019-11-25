package shogi.utilidades;

import java.util.Scanner;
import shogi.Enumeraciones.TipoFicha;
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
                    System.out.print(fichas[i][j].getRepresentacion());
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

    public static Ficha solicitoPiezaAMover(Tablero tablero, Jugador jugador) {//solicito datos para movimiento y valido que la ficha corresponda al jugador
        Scanner input = new Scanner(System.in);

        Ficha ficha = new Ficha();
        int fila;
        int columna;
        boolean correspondeAlJugador = false;
        int intento = 0;
        do {
            if (intento > 0) {
                System.out.println("La ficha ingresada no es correcta, por favor revise las coordenadas");
            }
            fila = FichaUtil.solicitoFila();

            columna = FichaUtil.solicitoColumna();

            ficha = FichaUtil.buscarFichaPorUbicacion(tablero, fila, columna);
            if (ficha != null) {
                correspondeAlJugador = FichaUtil.verificarFichaCorrespondeAJugador(ficha, jugador);
            }
            intento++;
        } while (!correspondeAlJugador);
        return ficha;
    }

    public static int[] solicitoDestinoPieza() {
        int destinoPieza[] = new int[2];
        destinoPieza[0] = FichaUtil.solicitoFila();
        destinoPieza[1] = FichaUtil.solicitoColumna();
        return destinoPieza;
    }

    public static boolean validoMovimiento(Ficha ficha, int[] origen, int[] destino) {
        boolean esValido; 
        TipoFicha tipoFicha = ficha.getTipoFicha();
        switch (tipoFicha) {
            case ALFIL:
                esValido = MovimientosUtil.validarMovimientoAlfil(ficha, origen, destino);
                break;
            case ALFIL_PROMOCIONADO:
                esValido = MovimientosUtil.validarMovimientoAlfilCoronado(ficha, origen, destino);
                break;
            case CABALLO:
                esValido = MovimientosUtil.validarMovimientoCaballo(ficha, origen, destino);
                break;
            case CABALLO_PROMOCIONADO:
                esValido = MovimientosUtil.validarMovimientoCaballoCoronado(ficha, origen, destino);
                break;
            case GENERAL_DE_ORO:
                esValido = MovimientosUtil.validarMovimientoGeneralOro(ficha, origen, destino);
                break;
            case GENERAL_DE_PLATA:
                esValido = MovimientosUtil.validarMovimientoGeneralPlata(ficha, origen, destino);
                break;
            case GENERAL_DE_PLATA_PROMOCIONADO:
                esValido = MovimientosUtil.validarMovimientoGeneralPlataCoronado(ficha, origen, destino);
                break;
            case LANCERO:
                esValido = MovimientosUtil.validarMovimientoLancero(ficha, origen, destino);
                break;
            case LANCERO_PROMOCIONADO:
                esValido = MovimientosUtil.validarMovimientoLanceroCoronado(ficha, origen, destino);
                break;
            case PEON:
                esValido = MovimientosUtil.validarMovimientoPeon(ficha, origen, destino);
                break;
            case PEON_PROMOCIONADO:
                esValido = MovimientosUtil.validarMovimientoPeonCoronado(ficha, origen, destino);
                break;
            case REY:
                esValido = MovimientosUtil.validarMovimientoRey(ficha, origen, destino);
                break;
            case TORRE:
                esValido = MovimientosUtil.validarMovimientoTorre(ficha, origen, destino);
                break;
            case TORRE_PROMOCIONADA:
                esValido = MovimientosUtil.validarMovimientoTorreCoronada(ficha, origen, destino);
                break;
            default:
                esValido = false;
                break;
        }
        return esValido;
    }
    
    public static void moverFicha(Ficha ficha,int[] origen, int[] destino, Tablero tablero){
        Ficha fichas[][] = tablero.getTablero();
        fichas[destino[0]][destino[1]] = ficha;
        fichas[origen[0]][origen[1]] = null;
    }
}
