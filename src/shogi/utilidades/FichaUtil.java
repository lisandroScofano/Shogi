package shogi.utilidades;

import java.util.List;
import shogi.entidades.Ficha;
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
        return fichaBuscada;
    }
    
    public static boolean verificarFichaCorrespondeAJugador(Ficha ficha){
        
        
        return true;
    }
}
