package ejecutable;

import modelo.Fecha;

public class Test {
    public static void main(String[] args) {
        Fecha f = new Fecha(2, 10, 1970);
        System.out.println("Dia: " + f.getDia());
        System.out.println("Mes: " + f.getMes());
        System.out.println("Año: " + f.getAnio());
        System.out.println(f);

        Fecha f2 = new Fecha();
        System.out.println("Clase Fecha vacia: " + f2);

        Fecha f3 = new Fecha ("10/11/2022");
        System.out.println("Clase Fecha Tipo String: " + f3);

        Fecha otra = new Fecha(5, 5, 1995);
        otra.setDia(5);
        otra.setMes(5);
        otra.setAnio(1995);

        System.out.println(otra.equals(f));

        if (otra.equals(f) == false){
            System.out.println("Las dos fechas son diferentes");
        }

        if (otra.equals(f) == true) {
            System.out.println("Las dos fechas son iguales");
        }
    }
}
