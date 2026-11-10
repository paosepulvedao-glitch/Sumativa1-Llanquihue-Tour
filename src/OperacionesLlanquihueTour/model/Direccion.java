package OperacionesLlanquihueTour.model;

public class Direccion {

    //ATRIBUTOS CLASE
    private String Calle;
    private String Ciudad;
    private String Region;


    //CONSTRUCTOR CLASE
    public Direccion(String calle, String ciudad, String region) {
        Calle = calle;
        Ciudad = ciudad;
        Region = region;
    }


    //GETTERS Y SETTERS
    public String getCalle() {
        return Calle;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getRegion() {
        return Region;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public void setRegion(String region) {
        Region = region;
    }


    //TO STRING
    @Override
      public String toString() {
        return "Calle: " + Calle + "\n"
         + "Ciudad: " + Ciudad + "\n"
         + "Region: " + Region;

    }


}
