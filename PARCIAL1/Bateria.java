package PARCIAL1;

public class Bateria {
    public final static int capacidad_Maxima = 1000;
    private char estado;
    private int carga;

    public Bateria(char estado) {
        this.estado = estado;
        carga = capacidad_Maxima;
    }

    public void establecerEstado(char e) {
        estado = e;
    }

    public void establecerCarga(int c) {
        carga = c;
    }

    public void copy(Bateria b) {
        carga = b.carga;
        estado = b.estado;
    }

    public char obtenerEstado() {
        return estado;
    }

    public int obtenerCarga() {
        return carga;
    }

    public Bateria clone() {
        Bateria aux;
        aux = new Bateria(estado);
        return aux;
    }

    public boolean equals(Bateria b) {
        if (b != null)
            return carga == b.carga && estado == b.estado;
        return false;
    }
}
