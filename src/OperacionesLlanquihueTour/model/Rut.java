package OperacionesLlanquihueTour.model;


/**
 * Clase que representa rut chileno y valida su formato, el formato de rut solicitado para este proyecto
 * es de 9.999.999-9 o 99.999.999-K, tambien lanza IllegalArgumentException en caso de
 * que no haya ningun rut ingresado
 * 
 */

public class Rut {

    private String numero;

    public Rut(String numeroRUT) throws IllegalArgumentException  {
        if (numeroRUT == null) {
            throw new IllegalArgumentException ("El RUT no puede estar vacio");
        }
        if (!numeroRUT.matches("\\d{1,2}\\.\\d{3}\\.\\d{3}-[\\dkK]")) {      //El "d{1,2}" permite que se puedan colocar 1 o 2 digitos al inicio del RUT. "d{3}" menciona que se deben colocar 3 digitos. [\\dkK] Nos permite poner un digito, k o K como verificador.
            throw new IllegalArgumentException ("Formato de RUT no válido. Utilize puntos y guion verificador");
        }
        this.numero = numeroRUT;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}

    