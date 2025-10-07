package PARCIAL1;

public class AutoAControl {
    private int frecuencia;
    private boolean encendido;
    private Bateria bat;

    public AutoAControl(int f, boolean e, Bateria b) {
        frecuencia = f;
        encendido = e;
        bat = b;
    }

    public void establecerFrecuencia(int f) {
        frecuencia = f;
    }

    public void enciendeOApaga() {
        encendido = !encendido;
    }

    public void copy(AutoAControl a) {
        frecuencia = a.frecuencia;
        encendido = a.encendido;
        bat = a.bat;
    }

    public int obtenerFrecuencia() {
        return frecuencia;
    }

    public boolean obtenerEncendido() {
        return encendido;
    }

    public Bateria obtenerBateria() {
        return bat;
    }

    public boolean enCondiciones() {
        return encendido && (bat.obtenerCarga() > 500);
    }

    public AutoAControl clone() {
        AutoAControl aux = new AutoAControl(frecuencia, encendido, bat.clone());
        return aux;
    }

    public boolean equals(AutoAControl a) {
        if (a != null) {
            return (frecuencia == a.frecuencia && encendido == a.encendido && bat.equals(a.bat));
        }
        return encendido;
    }

    public AutoAControl AutoConMenosCarga(AutoAControl a) {
        if (a == null)
            return null;
        else {
            if (bat.obtenerCarga() < a.bat.obtenerCarga()) {
                return this;
            } else if (bat.obtenerCarga() > a.bat.obtenerCarga()) {
                return a;
            }
        }
        return a;
    }
}
