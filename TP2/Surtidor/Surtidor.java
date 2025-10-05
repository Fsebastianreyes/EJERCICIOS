package TP2.Surtidor;

public class Surtidor {
    // atributo de clase
    private static final int maximaCarga = 0;
    // atributo de instancia
    private int cantGasoil;
    private int cantSuper;
    private int cantPremium;

    // constructores
    public Surtidor() {
        cantGasoil = 0;
        cantSuper = 0;
        cantPremium = 0;
    };

    // comandos
    public void llenarDepositoGasoil() {
        cantGasoil = maximaCarga;
    }

    public void llenarDepositoSuper() {
        cantSuper = maximaCarga;
    }

    public void llenarDepositoPremium() {
        cantPremium = maximaCarga;
    }

    public void extraerGasoil(int litros) {
        if (litros > 0 && (cantGasoil > litros)) {
            cantGasoil -= litros;
        } else {
            cantGasoil = 0;
        }
    }

    public void extraerPremium(int litros) {
        if (litros > 0 && (cantPremium > litros)) {
            cantPremium -= litros;
        } else {
            cantPremium = 0;
        }
    }

    public void extraerSuper(int litros) {
        if (litros > 0 && (cantSuper > litros)) {
            cantSuper -= litros;
        } else {
            cantSuper = 0;
        }
    }

    // consultas
    public int obtenerLitrosGasoil() {
        return cantGasoil;
    }

    public int obtenerLitrosPremium() {
        return cantPremium;
    }

    public int obtenerLitrosSuper() {
        return cantSuper;
    }

    public int obtenerMaximaCarga() {
        return maximaCarga;
    }

    public boolean depositosLlenos() {
        return (cantGasoil == maximaCarga && cantPremium == maximaCarga && cantSuper == maximaCarga);
    }
}