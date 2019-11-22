package shogi.utilidades;

import shogi.entidades.Ficha;

/**
 *
 * @author lisandroscofano
 * 
 * https://es.wikipedia.org/wiki/Sh%C5%8Dgi#C%C3%B3mo_promover_o_coronar_las_piezas
 * 
 * https://es.wikipedia.org/wiki/Sh%C5%8Dgi#C%C3%B3mo_reintroducir_piezas
 */
public class FichaUtil {

    public void coronarFicha(Ficha ficha) {
        ficha.setCoronado(true);
    }

    public void desCoronarFicha(Ficha ficha) {
        ficha.setCoronado(false);
    }
    
    public void reingresarFicha (Ficha ficha){
        //debo reingresarla en la posicion que desee el jugador siguiendo las reglas 
    }
}
