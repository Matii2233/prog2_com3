package Ejercicio1;

public class Funciones {
    public static void catalogar(int cantidadVehiculos, boolean mostrarTodosLosDatos, int ruedas, Vehiculo[] v1, Coche coche, Bici bici,
                                 Camioneta camioneta, Motocicleta motocicleta) {
        if (mostrarTodosLosDatos==true) {
            System.out.println("Los vehiculos tienen las siguientes caracteristicas:");
            for (int i = 0; i<v1.length; i++) {
                System.out.println("color: "+v1[i].getColor()+";  ruedas: "+v1[i].getWheels());
                switch(i) {
                    case 0:
                        System.out.println("velocidad del auto: "+coche.getSpeed()+"km;  cilindrada del auto: "
                                +coche.getDisplaysment()+"cc");
                        break;
                    case 1:
                        System.out.println("tipo de bici: "+bici.getType());
                        break;
                    case 2:
                        System.out.println("carga de la camineta: "+camioneta.getLoad()+"kg");
                        break;
                    case 3:
                        System.out.println("velocidad de la moto: "+motocicleta.getSpeed()+"km;  cilindrada de la moto: "
                                +motocicleta.getDisplayment()+"cc");
                        break;

                    default:
                        System.out.println("La opción no es válida");
                }
                System.out.println();
            }
            System.out.println();
        } else {
            for (int i = 0; i<v1.length; i++) {
                if (v1[i].getWheels() == ruedas) {
                    cantidadVehiculos++;
                }
            }
            System.out.println("Se han encontrado "+cantidadVehiculos+" vehiculos de "+ruedas+" ruedas:");
            for (int i = 0; i<v1.length; i++) {
                switch(i) {
                    case 0:
                        if (ruedas == v1[i].getWheels()) {
                            System.out.println("color: "+v1[i].getColor()+";  ruedas: "+v1[i].getWheels());
                            System.out.println("velocidad del auto: "+coche.getSpeed()+"km;  cilindrada del auto: "
                                    +coche.getDisplaysment()+"cc");
                        }
                        break;
                    case 1:
                        if (ruedas == v1[i].getWheels()) {
                            System.out.println("color: "+v1[i].getColor()+";  ruedas: "+v1[i].getWheels());
                            System.out.println("tipo de bici: "+bici.getType());
                        }
                        break;
                    case 2:
                        if (ruedas == v1[i].getWheels()) {
                            System.out.println("color: "+v1[i].getColor()+";  ruedas: "+v1[i].getWheels());
                            System.out.println("carga de la camineta: "+camioneta.getLoad()+"kg");
                        }
                        break;
                    case 3:
                        if (ruedas == v1[i].getWheels()) {
                            System.out.println("color: "+v1[i].getColor()+";  ruedas: "+v1[i].getWheels());
                            System.out.println("velocidad de la moto: "+motocicleta.getSpeed()+"km;  cilindrada de la moto: "
                                    +motocicleta.getDisplayment()+"cc");
                        }
                        break;
                    default:
                        System.out.println("La opción no es válida");
                }
                System.out.println();
            }
        }
    }
}
