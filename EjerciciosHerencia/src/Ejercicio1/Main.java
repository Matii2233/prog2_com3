package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche("gris", 4, 220, 3000.0F);
        Bici bici = new Bici("negro y rojo", 2, "Urbana");
        Camioneta camioneta = new Camioneta("rojo", 4, 2000);
        Motocicleta motocicleta = new Motocicleta("amarillo", 2, 310, 3200.0F);


        Vehiculo[] v1 = new Vehiculo[4];
        v1[0] = coche;
        v1[1] = bici;
        v1[2] = camioneta;
        v1[3] = motocicleta;


        boolean mostrarTodosLosDatos = false;
        int cantidadVehiculos=0;
        //int ruedas = 0;
        //int ruedas = 2;
        int ruedas = 4;

        Funciones.catalogar(cantidadVehiculos, mostrarTodosLosDatos, ruedas, v1, coche, bici, camioneta, motocicleta);
    }
}