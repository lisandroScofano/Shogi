package shogi.utilidades;

import shogi.entidades.Casilla;
import shogi.entidades.Pieza;

/**
 *
 * @author lisandroscofano Pagina con reglas:
 * https://es.wikipedia.org/wiki/Sh%C5%8Dgi#Piezas
 */
public class MovimientosUtil {

    public static boolean validarMovimientoRey(Pieza ficha, Casilla origen, Casilla destino) {
        //se mueve una casilla en cualquier dirección. Los reyes no pueden coronarse.
        
        return true;
    }

    public static boolean validarMovimientoTorre(Pieza ficha, Casilla origen, Casilla destino) {
        //cualquier número de casillas libres vertical u horizontalmente.
        return true;
    }

    public static boolean validarMovimientoTorreCoronada(Pieza ficha, Casilla origen, Casilla destino) {
        //Puede desplazarse como la torre, o bien una casilla en diagonal.
        return true;
    }

    public static boolean validarMovimientoAlfil(Pieza ficha, Casilla origen, Casilla destino) {
        //puede desplazarse cualquier número de casillas libres en diagonal.
        return true;
    }

    public static boolean validarMovimientoAlfilCoronado(Pieza ficha, Casilla origen, Casilla destino) {
        //Se mueve como el alfil, o bien una casilla en horizontal o vertical.
        return true;
    }

    public static boolean validarMovimientoGeneralOro(Pieza ficha, Casilla origen, Casilla destino) {
        //Una casilla en vertical, horizontal o diagonalmente adelante. No puede desplazarse diagonalmente hacia atrás.
        return true;
    }

    public static boolean validarMovimientoGeneralPlata(Pieza ficha, Casilla origen, Casilla destino) {
        //Una casilla en diagonal, o bien vertical adelante, es decir, cinco movimientos posibles.
        return true;
    }

    public static boolean validarMovimientoGeneralPlataCoronado(Pieza ficha, Casilla origen, Casilla destino) {
        //Igual que el general de oro.
        return true;
    }

    public static boolean validarMovimientoCaballo(Pieza ficha, Casilla origen, Casilla destino) {
        //El caballo tiene un movimiento complejo compuesto siempre por dos casillas adelante y una casilla hacia su derecha o izquierda. 
        //No puede desplazarse hacia atrás. Tiene por tanto solo dos movimientos posibles. Al igual que su equivalente en el ajedrez occidental, puede saltar por encima de otras piezas.
        return true;
    }

    public static boolean validarMovimientoCaballoCoronado(Pieza ficha, Casilla origen, Casilla destino) {
        //Igual que el general de oro.
        return true;
    }

    public static boolean validarMovimientoLancero(Pieza ficha, Casilla origen, Casilla destino) {
        //Se mueve cualquier número de casillas libres verticalmente hacia adelante. No puede desplazarse hacia atrás
        return true;
    }

    public static boolean validarMovimientoLanceroCoronado(Pieza ficha, Casilla origen, Casilla destino) {
        //Igual que el general de oro.
        return true;
    }

    public static boolean validarMovimientoPeon(Pieza ficha, Casilla origen, Casilla destino) {
        //Se mueve una casilla adelante. A diferencia del ajedrez, nunca se mueve más de una casilla y nunca come en diagonal.
        return true;
    }

    public static boolean validarMovimientoPeonCoronado(Pieza ficha, Casilla origen, Casilla destino) {
        //Igual que el general de oro.
        return true;
    }

}
