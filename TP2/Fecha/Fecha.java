package TP2.Fecha;

//atributos
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // constructorr
    public Fecha(int d, int m, int a) {
        dia = d;
        mes = m;
        anio = a;
    }

    // comandos
    public void establecerDia(int d) {
        dia = d;
    }

    public void establecerMes(int m) {
        mes = m;
    }

    public void establecerAnio(int a) {
        anio = a;
    }

    // Consultas
    public int obtenerDia() {
        return dia;
    }

    public int obtenerMes() {
        return mes;
    }

    public int obtenerAnio() {
        return anio;
    }

    public boolean esBisiesto() {
        return ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0));
    }

    public boolean esAnterior(Fecha f) {
        if (f != null) {
            if (anio < f.anio)
                return true;
            if (anio > f.anio)
                return false;
            /* Si el año es igual no entra a ningun if */
            if (mes < f.mes)
                return true;
            if (mes > f.mes)
                return true;
            /* Si el mes es igual no entra a ningun if */
            return dia < f.dia;
        } else
            return false;
    }

    public boolean mismoAnio(Fecha f) {
        return f.anio == anio;
    }

    public boolean equals(Fecha f) {
        if (f != null) {
            return (f.dia == dia) && (f.mes == mes) && (f.anio == anio);
        } else
            return false;
    }

    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
