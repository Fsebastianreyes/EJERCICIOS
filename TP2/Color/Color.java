package TP2.Color;

public class Color {
    private int rojo;
    private int verde;
    private int azul;

    // Atributos
    public Color() {
        rojo = 255;
        verde = 255;
        azul = 255;
    }

    public Color(int r, int v, int a) {
        rojo = r;
        verde = v;
        azul = a;
    }

    // Comandos
    public void variar(int val) {
        rojo += val;
        verde += val;
        azul += val;
        if (rojo > 255)
            rojo = 255;
        else if (rojo < 0)
            rojo = 0;

        if (verde > 255)
            verde = 255;
        else if (verde < 0)
            verde = 0;

        if (azul > 255)
            azul = 255;
        else if (azul < 0)
            azul = 0;
    }

    public void variarRojo(int val) {
        rojo += val;
        if (rojo > 255)
            rojo = 255;
    }

    public void variarAzul(int val) {
        azul += val;
        if (azul > 255)
            azul = 255;
    }

    public void variarVerde(int val) {
        verde += val;
        if (verde > 255)
            verde = 255;
    }

    public void establecerRojo(int val) {
        rojo = val;
    }

    public void establecerAzul(int val) {
        azul = val;
    }

    public void establecerVerde(int val) {
        verde = val;
    }

    public void copy(Color c) {
        if (c != null) {
            rojo = c.obtenerRojo();
            verde = c.obtenerVerde();
            azul = c.obtenerAzul();
        }
    }

    // consultas
    public int obtenerRojo() {
        return rojo;
    }

    public int obtenerVerde() {
        return verde;
    }

    public int obtenerAzul() {
        return azul;
    }

    public boolean esRojo() {
        return azul == 0 && verde == 0 && rojo == 255;
    }

    public boolean esGris() {
        return azul == rojo && rojo == verde;
    }

    public boolean esNegro() {
        return azul == 0 && verde == 0 && azul == 0;
    }

    public Color complemento() {
        return new Color(255 - rojo, 255 - verde, 255 - azul);
    }

    public boolean equals(Color c) {
        if (c != null) {
            return c.obtenerAzul() == azul && c.obtenerRojo() == rojo && c.obtenerVerde() == verde;
        } else
            return false;
    }

    public Color clone() {
        return new Color(rojo, verde, azul);
    }

    public String toString() {
        return "Azul: " + azul + " - Verde: " + verde + " - Rojo: " + rojo;
    }
}
