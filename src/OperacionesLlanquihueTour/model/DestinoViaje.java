package OperacionesLlanquihueTour.model;

public class DestinoViaje {

    //ATRIBUTOS CLASE
    private String NombreDestino;


    //CONSTRUCTOR CLASE
    public DestinoViaje(String nombreDestino) {
        NombreDestino = nombreDestino;
    }

    //GETTERS Y SETTERES
    public String getNombreDestino() {
        return NombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        NombreDestino = nombreDestino;
    }


    //TO STRING
     @Override
      public String toString() {
         return "Destino: " + NombreDestino;
 
        }
}
