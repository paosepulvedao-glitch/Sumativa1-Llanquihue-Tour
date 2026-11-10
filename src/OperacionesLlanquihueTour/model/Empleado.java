package OperacionesLlanquihueTour.model;

public class Empleado extends Persona {

    //ATRIBUTOS CLASE
    private String cargo;   
    private int sueldo;

    //CONSTRUCTORES CLASE
    public Empleado(String nombre, String rut, Direccion direccion, String telefono, String cargo, int sueldo) {
        super(nombre, rut, direccion, telefono);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    //GETTERS Y SETTERS
    public String getCargo() {
        return cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
       
 
    /**
     * TOSTRING
     * Devuelve una representación en texto de la clase Empleado.
     * El sueldo del empleado lo considere un dato sensible como para que sea revelado en la clase main
     * entonces no lo agregue en el tostring.
     */
    @Override
      public String toString() {
         return super.toString()
         + "\nCargo: " + cargo;
    
    /**
     * El sueldo del empleado lo considere un dato sensible como para que sea revelado en la clase main
     * entonces no lo agregue en el tostring.
     */
                
    }
} 
