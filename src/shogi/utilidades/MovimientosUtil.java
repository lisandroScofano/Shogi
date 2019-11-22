package shogi.utilidades;

/**
 *
 * @author lisandroscofano Pagina con reglas:
 * https://es.wikipedia.org/wiki/Sh%C5%8Dgi#Piezas
 */
public class MovimientosUtil {

    public boolean validarMovimientoRey() {
        //se mueve una casilla en cualquier dirección. Los reyes no pueden coronarse.
        return true;
    }

    public boolean validarMovimientoTorre() {
        //cualquier número de casillas libres vertical u horizontalmente.
        return true;
    }

    public boolean validarMovimientoTorreCoronada() {
        //Puede desplazarse como la torre, o bien una casilla en diagonal.
        return true;
    }

    public boolean validarMovimientoAlfil() {
        //puede desplazarse cualquier número de casillas libres en diagonal.
        return true;
    }

    public boolean validarMovimientoAlfilCoronado() {
        //Se mueve como el alfil, o bien una casilla en horizontal o vertical.
        return true;
    }

    public boolean validarMovimientoGeneralOro() {
        //Una casilla en vertical, horizontal o diagonalmente adelante. No puede desplazarse diagonalmente hacia atrás.
        return true;
    }

    public boolean validarMovimientoGeneralPlata() {
        //Una casilla en diagonal, o bien vertical adelante, es decir, cinco movimientos posibles.
        return true;
    }

    public boolean validarMovimientoGeneralPlataCoronado() {
        //Igual que el general de oro.
        return true;
    }

    public boolean validarMovimientoCaballo() {
        //El caballo tiene un movimiento complejo compuesto siempre por dos casillas adelante y una casilla hacia su derecha o izquierda. 
        //No puede desplazarse hacia atrás. Tiene por tanto solo dos movimientos posibles. Al igual que su equivalente en el ajedrez occidental, puede saltar por encima de otras piezas.
        return true;
    }

    public boolean validarMovimientoCaballoCoronado() {
        //Igual que el general de oro.
        return true;
    }

    public boolean validarMovimientoLancero() {
        //Se mueve cualquier número de casillas libres verticalmente hacia adelante. No puede desplazarse hacia atrás
        return true;
    }

    public boolean validarMovimientoLanceroCoronado() {
        //Igual que el general de oro.
        return true;
    }

    public boolean validarMovimientoPeon() {
        //Se mueve una casilla adelante. A diferencia del ajedrez, nunca se mueve más de una casilla y nunca come en diagonal.
        return true;
    }

    public boolean validarMovimientoPeonCoronado() {
        //Igual que el general de oro.
        return true;
    }

}
