package OperacionesLlanquihueTour.app;

import OperacionesLlanquihueTour.model.Cliente;
import OperacionesLlanquihueTour.model.DestinoViaje;
import OperacionesLlanquihueTour.model.Direccion;
import OperacionesLlanquihueTour.model.Empleado;


public class Main {

    public static void main(String[]args){


     /** 
     * CREANDO INSTANCIAS PARA EMPLEADOS
     */
        Direccion direccionEmpleado1 = new Direccion("Los Alerces 952", "Llanquihue", "Los Lagos");
        Empleado Empleado1 = new Empleado("Francisca Valenzuela", "20.783.575-9", direccionEmpleado1, "983621783", "Guia Turistica", 600000);

        Direccion direccionEmpleado2 = new Direccion("Los Conquistadores 1145", "Llanquihue", "Los Lagos");
        Empleado Empleado2 = new Empleado("Manuel Gajardo", "18.484.255-4", direccionEmpleado2, "995718847", "Guia Turistico", 1000000);
     /**
     * CREANDO INSTANCIAS PARA DESTINOS
     */
        DestinoViaje destino1 = new DestinoViaje("Playa los Cisnes");

        DestinoViaje destino2 = new DestinoViaje("Humedal El Loto");

     /**
     * CREANDO INSTANCIAS PARA CLIENTES
     */
        Direccion direccionCliente1 = new Direccion("Colo Colo 768", "Linares", "Maule");
        Cliente cliente1 = new Cliente("Javiera Ramirez", "21.221.641-k", direccionCliente1, "951515151", Empleado1, destino1); 

        Direccion direccionCliente2 = new Direccion("Los misioneros 421", "Arica", "Arica y Parinacota");
        Cliente cliente2 = new Cliente("Luis Sepulveda", "9.352.145-9", direccionCliente2, "929350193", Empleado2, destino2); 


       /**
     * PARA IMPRIMIR LA INFORMACION FINAL UI
     * 
     */
        System.out.println("\nREGISTRO CREADO EXITOSAMENTE: \n ");
        //IMPRIME DATOS DEL EMPLEADO
        System.out.println("DATOS EMPLEADO: \n" + Empleado1.toString()+ "\n");
        //IMPRIME DATOS DEL CLIENTE
        System.out.println("DATOS CLIENTE: \n" + cliente1.toString()+ "\n");

        System.out.println("=================================================================");

        System.out.println("\nREGISTRO CREADO EXITOSAMENTE: \n ");
        //IMPRIME DATOS DEL EMPLEADO
        System.out.println("DATOS EMPLEADO: \n" + Empleado2.toString()+ "\n");
        //IMPRIME DATOS DEL CLIENTE
        System.out.println("DATOS CLIENTE: \n" + cliente2.toString()+ "\n");

    }

}

