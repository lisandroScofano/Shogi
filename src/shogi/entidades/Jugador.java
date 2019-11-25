package shogi.entidades;

import shogi.Enumeraciones.ColorJugador;

/**
 *
 * @author lisandroscofano
 */
public class Jugador {

    private String nombre;
    private ColorJugador color;

    public Jugador() {

    }

    public Jugador(ColorJugador color) {
        this.color = color;
    }

    public Jugador(String nombre, ColorJugador color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ColorJugador getColor() {
        return color;
    }

    public void setColor(ColorJugador color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", color=" + color + '}';
    }

}
