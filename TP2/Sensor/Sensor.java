
public class Sensor {
    // atributo de clase
    private static final double max = 0.01;

    // atributo de instancia
    private double p1;
    private double p2;

    // constructor
    public Sensor(double p1, double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // comandos
    public void establecerP1(double p) {
        this.p1 = p;
    }

    public void establecerP2(double p) {
        this.p2 = p;
    }

    public void copy(Sensor s) {
        if (s != null) {
            this.p1 = s.p1;
            this.p2 = s.p2;
        }
    }

    // consultas
    public double obtenerP1() {
        return p1;
    }

    public double obtenerP2() {
        return p2;
    }

    public boolean riesgo() {
        return p2 > p1;
    }

    public boolean emergencia() {
        return p1 < max;
    }

    public boolean equals(Sensor s) {
        if (s == null)
            return false;
        return this.p1 == s.p1 && this.p2 == s.p2;
    }

    public Sensor clone() {
        return new Sensor(this.p1, this.p2);
    }
}
