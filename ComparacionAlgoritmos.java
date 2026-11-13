/**
 * Actividad Sesión No. 2 - ¿Cuál algoritmo escala mejor?
 * Estructura de Datos I - Análisis de algoritmos y notación Big O
 *
 * Compara experimentalmente un algoritmo lineal O(n) contra uno
 * cuadrático O(n²) midiendo el tiempo de ejecución con System.nanoTime().
 */
public class ComparacionAlgoritmos {

    public static void main(String[] args) {

        // Tamaños de entrada que se van a probar
        int[] tamanos = {100, 1_000, 5_000, 10_000};

        System.out.println("n\tO(n) ns\tO(n²) ns");

        for (int n : tamanos) {

            // Medición del algoritmo lineal
            long inicioLineal = System.nanoTime();
            algoritmoLineal(n);
            long finLineal = System.nanoTime();
            long tiempoLineal = finLineal - inicioLineal;

            // Medición del algoritmo cuadrático
            long inicioCuadratico = System.nanoTime();
            algoritmoCuadratico(n);
            long finCuadratico = System.nanoTime();
            long tiempoCuadratico = finCuadratico - inicioCuadratico;

            System.out.println(
                n + "\t" + tiempoLineal + "\t" + tiempoCuadratico
            );
        }
    }

    /** Algoritmo A - O(n): un solo ciclo que se repite n veces. */
    public static long algoritmoLineal(int n) {
        long contador = 0;
        for (int i = 0; i < n; i++) {
            contador++;
        }
        return contador;
    }

    /** Algoritmo B - O(n²): dos ciclos anidados, n × n repeticiones. */
    public static long algoritmoCuadratico(int n) {
        long contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                contador++;
            }
        }
        return contador;
    }
}
