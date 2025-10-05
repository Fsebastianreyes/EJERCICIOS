import java.util.Scanner;

public class TesterPoliza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables para guardar datos
        int np;
        float inc;
        float rob;

        // Ingreso de dats
        System.out.print("Ingrese numero de poliza: ");
        np = sc.nextInt();

        System.out.print("Ingrese monto de incendio: ");
        inc = sc.nextFloat();

        System.out.print("Ingrese monto de robo: ");
        rob = sc.nextFloat();

        // Crear objeto Poliza
        Poliza p = new Poliza(np, inc, rob);

        // Secuencia pedida
        p.actualizarPorcentaje(20);
        p.desactivar();
        p.actualizarPorcentaje(10);
        p.activar();

        // Mostrar los resultados
        System.out.println("Nro de poliza: " + p.obtenerNroPoliza());
        System.out.println("Costo de poliza: " + p.obtenerCostoPoliza());
        System.out.println("Estado: " + p.estaActiva());

        sc.close();
    }
}
