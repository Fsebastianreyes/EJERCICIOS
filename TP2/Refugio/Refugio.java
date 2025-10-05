package TP2.Refugio;

public class Refugio {
    // Atributos de clase
    private static final int capacidadAlacena = 20;
    private static final int cantidadCamas = 20;
    // Atributos de instancia
    private int alimentos;
    private int bebidas;
    private int camas;

    // Constructores
    public Refugio(int a, int b, int c) {
        alimentos = a;
        bebidas = b;
        camas = c;
    }

    // Comandos
    public void consumirAlimento() {
        alimentos -= 1;
    }

    public void consumirBebida() {
        bebidas -= 1;
    }

    public boolean ocuparCama() {
        if ((cantidadCamas - camas) > 0) {
            camas += 1;
            return true;
        } else
            return false;
    }

    public boolean desocuparCama() {
        if (camas > 0) {
            camas -= 1;
            return true;
        } else
            return false;
    }

    public boolean reponerAlimentos(int n) {
        if ((n > 0) && (n + alimentos + bebidas) < capacidadAlacena) {
            alimentos += n;
            return true;
        } else
            return false;
    }

    public boolean reponerBebidas(int n) {
        if ((n > 0) && (n + alimentos + bebidas) < capacidadAlacena) {
            bebidas += n;
            return true;
        } else
            return false;
    }

    // consultas
    public int obtenerAlimentos() {
        return alimentos;
    }

    public int obtenerBebidas() {
        return bebidas;
    }

    public int obtenerCamas() {
        return camas;
    }

    public int obtenerCapacidadAlacena() {
        return (capacidadAlacena - alimentos - bebidas);
    }

    public boolean esHabitable() {
        if ((cantidadCamas - camas) > 0)
            return true;
        else
            return false;
    }

    public int disponibilidad() {
        return (cantidadCamas - camas);
    }

}
