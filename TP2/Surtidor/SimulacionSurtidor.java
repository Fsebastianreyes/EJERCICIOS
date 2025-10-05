package TP2.Surtidor;

import java.util.Scanner;

public class SimulacionSurtidor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Surtidor surtidor = new Surtidor(); //constructor de la clase Surtidor

        System.out.print("Ingrese la cantidad de iteraciones");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Iteracion " + (i+1));
            System.out.println("Gasoil: " + surtidor.obtenerLitrosGasoil());
            System.out.println("Premium: " + surtidor.obtenerLitrosPremium());
            System.out.println("Super: " + surtidor.obtenerLitrosSuper());
        

        System.out.print("Opciones (1 - 6): ");
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Litros a cargar de Gasoil: ");
                int cargaGasoil = sc.nextInt();
                setCantGasoil(cargaGasoil);
                break;
            case 2:
                System.out.println("Litros a cargar de Premium: ");
                int cargaPremium = sc.nextInt();
                System.out.println(surtidor.obtenerLitrosPremium()+cargaPremium);
                break;
            case 3:
                System.out.println("Litros a cargar de Super: ");
                int cargaSuper = sc.nextInt();
                System.out.println(surtidor.obtenerLitrosSuper()+cargaSuper);
                break;
            case 4:
                surtidor.llenarDepositoGasoil();
                break;
            case 5:
                surtidor.llenarDepositoSuper();
                break;
            case 6:
                surtidor.extraerPremium();
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
sc.close();
}