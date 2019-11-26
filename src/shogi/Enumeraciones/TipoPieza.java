package shogi.Enumeraciones;

/**
 *
 * @author lisandroscofano
 */
public enum TipoPieza {
    REY("REY", "K"),
    GENERAL_DE_ORO("GENERAL DE ORO", "G"),
    GENERAL_DE_PLATA("GENERAL DE PLATA", "S"),
    GENERAL_DE_PLATA_PROMOCIONADO("GENERAL DE PLATA PROMOCIONADO", "+S"),
    CABALLO("CABALLO", "N"),
    CABALLO_PROMOCIONADO("CABALLO_PROMOCIONADO", "+N"),
    LANCERO("LANCERO", "L"),
    LANCERO_PROMOCIONADO("LANCERO_PROMOCIONADO", "+L"),
    ALFIL("ALFIL", "B"),
    ALFIL_PROMOCIONADO("ALFIL_PROMOCIONADO", "+B"),
    TORRE("TORRE", "R"),
    TORRE_PROMOCIONADA("TORRE_PROMOCIONADA", "+R"),
    PEON("PEON", "P"),
    PEON_PROMOCIONADO("PEON_PROMOCIONADO", "+P");

    private final String completo;
    private final String abreviacion;

    private TipoPieza(String completo, String abreviacion) {
        this.completo = completo;
        this.abreviacion = abreviacion;

    }

    public String getCompleto() {
        return completo;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

}
