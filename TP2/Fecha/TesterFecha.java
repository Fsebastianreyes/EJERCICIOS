package TP2.Fecha;

public class TesterFecha {
    public static void main(String[] args) {
        // Crear fechas de prueba
        Fecha f1 = new Fecha(18, 6, 2024);
        Fecha f2 = new Fecha(29, 9, 2005);
        Fecha f3 = new Fecha(4, 12, 2000);
        Fecha f4 = new Fecha(19, 8, 2020);
        // ToString
        System.out.println("Fecha f1 es: " + f1.toString());
        System.out.println("Fecha f2 es:" + f2.toString());
        System.out.println("Fecha f3 es: " + f3.toString());
        System.out.println("Fecha de f4 es: " + f4.toString());
        // Consultas
        System.out.println("Dia de f1 es: " + f1.obtenerDia());
        System.out.println("Mes de f1 es: " + f1.obtenerMes());
        System.out.println("Año de f1 es: " + f1.obtenerAnio());
        // Comandos
        f1.establecerDia(19);
        f1.establecerMes(8);
        f1.establecerAnio(2020);
        System.out.println("Ahora f1 es: " + f1.toString());
        System.out.println("f1 es anterior a f2? :" + f1.esAnterior(f2));
        System.out.println("f2 es anterior a f3? :" + f2.esAnterior(f3));
        System.out.println("f3 es bisiesto?: " + f3.esBisiesto());
        System.out.println("f1 y f3 tienen el mismo año?: " + f1.mismoAnio(f3));
        System.out.println("f1 y f4 son iguales?: " + f1.equals(f4));
    }
}