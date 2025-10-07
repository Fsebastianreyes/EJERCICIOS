package PARCIAL1;

public class RegistroVentas {
    private double[] reg;

    public RegistroVentas(int cantDias) {
        reg = new double[cantDias];
    }

    public void establecerVenta(int dia, double v) {
        reg[dia] = v;
    }

    public double obtenerVenta(int dia) {
        return reg[dia - 1];
    }

    public boolean exactamenteNVentasSuperioresA(int n, double m) {
        int cant;
        cant = 0;
        for (int i = 0; i <= reg.length - 1; i++) {
            if (reg[i] > m)
                cant += 1;
        }
        return cant == n;
    }

    public double ventaMaxima() {
        double max = reg[0];
        for (int i = 1; i <= reg.length - 1; i++) {
            if (reg[i] > max)
                max = reg[i];
        }
        return max;
    }
}
