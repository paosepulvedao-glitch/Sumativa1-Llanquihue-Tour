package OperacionesLlanquihueTour.model;

public class Cliente extends Persona{

    //ATRIBUTOS CLASE
    private Empleado EmpleadoAsignado;
    private DestinoViaje destino;


    //CONSTRUCTOR CLASE
    public Cliente(String nombre, String rut, Direccion direccion, String telefono, Empleado empleadoAsignado,
            DestinoViaje destino) {
        super(nombre, rut, direccion, telefono);
        EmpleadoAsignado = empleadoAsignado;
        this.destino = destino;
    }


    //GETTERS Y SETTERS
    public Empleado getEmpleadoAsignado() {
        return EmpleadoAsignado;
    }


    public DestinoViaje getDestino() {
        return destino;
    }


    public void setEmpleadoAsignado(Empleado empleadoAsignado) {
        EmpleadoAsignado = empleadoAsignado;
    }


    public void setDestino(DestinoViaje destino) {
        this.destino = destino;
    }


    //TO STRING
    @Override
      public String toString() {
         return super.toString()
         + "\nEmpleado Asignado: " + EmpleadoAsignado.getNombre()
         + "\n" + destino;
                
    }

}
