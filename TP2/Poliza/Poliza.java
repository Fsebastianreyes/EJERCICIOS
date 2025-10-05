public class Poliza {
    private int nroPoliza;
    private float incendio;
    private float robo;
    private boolean activa;

    public Poliza(int np) {
        nroPoliza = np;
        incendio = 0;
        robo = 0;
        activa = true;
    }

    public Poliza(int np, float i, float r) {
        nroPoliza = np;
        incendio = i;
        robo = r;
        activa = true;
    }

    public void establecerIncendio(float m) {
        incendio = m > 0 ? m : 0;
    }

    public void establecerRobo(float m) {
        robo = m > 0 ? m : 0;
    }

    public void actualizarPorcentaje(int p) {
        if (activa && p > 0) {
            incendio += incendio * p / 100;
            robo += robo * p / 100;
        }
    }

    public void activar() {
        activa = true;
    }

    public void desactivar() {
        activa = false;
    }

    public int obtenerNroPoliza() {
        return nroPoliza;
    }

    public float obtenerIncendio() {
        return incendio;
    }

    public float obtenerRobo() {
        return robo;
    }

    public float obtenerCostoPoliza() {
        return incendio + robo;
    }

    public boolean estaActiva() {
        return activa;
    }
}