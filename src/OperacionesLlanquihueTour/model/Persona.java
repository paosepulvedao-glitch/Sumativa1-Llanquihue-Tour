package OperacionesLlanquihueTour.model;

/**
 * Esta es la clase base del proyecto.
 * Contiene datos personales de personas.
 */

public class Persona {

     //ATRIBUTOS CLASE
     private String nombre;
     private Rut rut;
     private Direccion direccion;
     private String telefono;

    
     //CONSTRUCTOR CLASE
     
    public Persona(String nombre, String rut, Direccion direccion, String telefono) {
        this.nombre = nombre;
        this.rut = new Rut(rut);        //validacion del formato RUT 
        this.direccion = direccion;
        this.telefono = telefono;
    }


     //GETTERS Y SETTERS
     public String getNombre() {
         return nombre;
     }


     public Rut getRut() {
         return rut;
     }


     public Direccion getDireccion() {
         return direccion;
     }


     public String getTelefono() {
         return telefono;
     }


     public void setNombre(String nombre) {
         this.nombre = nombre;
     }


     public void setRut(String rut) {
         this.rut = new Rut(rut);
     }


     public void setDireccion(Direccion direccion) {
         this.direccion = direccion;
     }


     public void setTelefono(String telefono) {
         this.telefono = telefono;
     }

     


    /**
     * TOSTRING
     * Devuelve una representación en texto de la clase persona,
     * @return datos de la persona en formato legible
     */
    @Override
      public String toString() {
         return "Nombre: " + nombre + "\n"
         + "RUT: " + rut + "\n"
         + "Dirección: " + direccion + "\n"
         + "Teléfono: " + telefono;
    }
    
}
