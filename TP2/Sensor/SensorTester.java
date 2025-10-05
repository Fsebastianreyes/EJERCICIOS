
public class SensorTester {
    // Sensores s1,s2,s3
    public static void main(String[] args) {
        Sensor s1 = new Sensor(1.5, 1.6);
        Sensor s2 = s1.clone();
        Sensor s3 = new Sensor(1.5, 1.6);

        // Mostrar valores
        System.out.println("s1: " + s1.obtenerP1() + ", " + s1.obtenerP2());
        System.out.println("s2: " + s2.obtenerP1() + ", " + s2.obtenerP2());
        System.out.println("s3: " + s3.obtenerP1() + ", " + s3.obtenerP2());

        // Comparaciones
        System.out.println("s1==s2? " + (s1 == s2)); // false
        System.out.println("s1.equals(s2)? " + s1.equals(s2)); // true
        System.out.println("s1.equials(s3)? " + s1.equals(s3)); // true

        // modifica s3 copiando s1
        s3.copy(s1);
        System.out.println("Despues de s3.copy(s1):");
        System.out.println("s3: " + s3.obtenerP1() + ", " + s3.obtenerP2());
        System.out.println("s1.equals(s3)? " + s1.equals(s3));

        // Cambiar valores de s1
        s1.establecerP1(2.0);
        s1.establecerP2(1.0);
        System.out.println("Despues de cambiar s1:");
        System.out.println("s1: " + s1.obtenerP1() + ", " + s1.obtenerP2());

        // Consutas riesgo y emergencia
        System.out.println("s1.riesgo()? " + s1.riesgo());
        System.out.println("s1.emergencia()? " + s1.emergencia());
    }
}
