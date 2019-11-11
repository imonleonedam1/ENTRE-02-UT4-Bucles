import java.util.Random;
/**
 *    @author - Ibai Monleón Elía
 */
public class DemoBucles
{
    private final char ASTERISCO = '*';
    private final char ESPACIO = ' ';
    private Random generador;
    /**
     * Constructor  
     */
    public DemoBucles()
    {
        generador = new Random();
    }

    /**
     * Calcular la mayor potencia de 2 que es menor o igual a numero
     * Asumimos numero > 0
     * 
     * Si numero = 7 devuelve 4             numero = 8 devuelve 8
     *    numero = 19 devuelve 16           numero = 32 devuelve 32
     *    numero = 74 devuelve 64           numero = 1 devuelve 1
     *    numero = 190 devuelve 128
     *    
     *  Usa bucles while
     */
    public int mayorPotencia2(int numero) {
        int potencia = 1;
        while (potencia * 2 <= numero) {
            potencia *= 2;
        }
        return potencia;
    }

    /**
     * Escribir numero como suma de potencias de 2 
     * tal como indica el enunciado (Se asume numero > 0)
     * 
     * Todos los valores se muestran en pantalla fomateados a 6 posiciones 
     * y ajustados a la derecha
     * 
     * Hay que usar el método anterior - 
     * Utiliza bucles while
     * 
     *  77 =    64     8     4     1
     * 215 =   128    64    16     4     2     1
     *  18 =    16     2
     *  64 =    64
     */
    public void escribirSumaPotencias(int numero) {
        System.out.println();
        String cadena = String.format("%6d =%6d", numero, 
                mayorPotencia2(numero));
        while (numero != mayorPotencia2(numero)) {
            numero = numero - mayorPotencia2(numero);
            cadena = cadena + String.format("%6d", mayorPotencia2(numero));
        }
        System.out.println(cadena);
    }

    /**
     * Generar aleatorios entre 0 y 255
     * y escribir cada aleatorio como suma de potencias de 2
     * Parar al salir el 255 o despues de generar n aleatorios
     * (ver enunciado)
     * 
     * Hay que usar el método anterior
     * 
     * Utiliza bucles while
     * 
     */
    public void generarAleatorios(int n) {
        int aleatorio = generador.nextInt(256);
        int i = 1;
        while (aleatorio != 0 && i <= n) {
            escribirSumaPotencias(aleatorio);
            i++;
            aleatorio = generador.nextInt(256);
        }
        if (aleatorio == 0) {
            System.out.println("El bucle ha terminado porque salió el 0");
        } else{
            System.out.println("El bucle ha terminado porque se " +
                "generaron " + n + " números aleatorios");
        }   
    }

    /**
     *  Escribe en pantalla caracter n veces en la misma línes
     *  
     *  Usa bucles for
     */
    public void escribirCaracter(int n, char caracter)
    {
        for (int i = 1; i <= n; i++) {
            System.out.print(caracter);
        }
    }

    /**
     *  Genera la figura tal como muestra el enunciado 
     *  con ayuda del método anterior
     *  
     *   Usa bucles for
     */
    public  void mostrarEscalera(int escalones, int alto, int ancho) {
        System.out.println();
        for (int e = 1; e <= escalones; e++) {
            for (int c = 1; c <= alto; c++) {
                for (int i = 1; i < e; i++) {
                    if (e > 1) {
                        for (int j = 1; j <= ancho; j++) {
                            System.out.print(ESPACIO);
                        }
                    }
                }
                for (int f = 1; f <= ancho; f++) {
                    System.out.print(ASTERISCO);
                }
                System.out.println();
            }
        }
    }
}
