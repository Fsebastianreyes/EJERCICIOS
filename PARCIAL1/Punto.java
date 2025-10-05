package PARCIAL1;

public class Punto {
    // atributos de instancia
    private int x;
    private int y;

    // constructores
    public Punto(int coord, int ord) {
        this.x = coord;
        this.y = ord;
    }

    // comandos
    public void establecerX(int coord) {
        x = coord;
    }

    public void establecerY(int ord) {
        y = ord;
    }

    public void copy(Punto p) {
        if (p != null) {
            this.x = p.x;
            this.y = p.y;
        }
    }

    // consultas
    public int obtenerX() {
        return this.x;
    }

    public int obtenerY() {
        return this.y;
    }

    public Punto clone() {
        return new Punto(this.x, this.y);
    }

    public boolean equals(Punto p) {
        if (p == null)
            return false;
        return this.x == p.x && this.y == p.y;
    }

    public double distancia(Punto p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
