package shogi.entidades;

import shogi.Enumeraciones.TipoPieza;

/**
 *
 * @author lisandroscofano
 */
public class Pieza {

    private String representacion;
    private TipoPieza tipoPieza;
    private Jugador jugador;
    private boolean coronada;

    public Pieza() {
        this.coronada = false;
    }
    
    public Pieza (TipoPieza tipoPieza){
        this.coronada = false;
        this.tipoPieza = tipoPieza;
    }

    public Pieza(TipoPieza tipoPieza, String representacion, Jugador jugador) {
        this.tipoPieza = tipoPieza;
        this.jugador = jugador;
        this.coronada = false;
        this.representacion = representacion;
    }

    public TipoPieza getTipoPieza() {
        return tipoPieza;
    }

    public String getTipoPiezaCompleta() {
        return tipoPieza.getCompleto();
    }

    public String getTipoPiezaAbreviada() {
        return tipoPieza.getAbreviacion();
    }

    public void setTipoPieza(TipoPieza tipoFicha) {
        this.tipoPieza = tipoFicha;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getRepresentacion() {
        return representacion;
    }

    public void setRepresentacion(String representacion) {
        this.representacion = representacion;
    }

    public boolean isCoronada() {
        return coronada;
    }

    public void setCoronada(boolean coronada) {
        this.coronada = coronada;
    }
    
    //este metodo se reescribe para cada pieza segun sus movimientos
    public boolean movimientoEsValido(Casilla origen, Casilla destino, Tablero tablero) {
        return false;
    }
    
    	public void coronarPieza() {
		this.coronada = true;
		if(!this.representacion.substring(0,1).equals("+")) {
		this.representacion = "+" + this.representacion;
		}
	}

	public void descoronarPieza() {
		this.coronada = false;
		this.representacion = this.representacion.split("+")[1];
	}
}
