import java.util.Scanner;
/**
 *  @author - Ibai Monleón Elía
 *  
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class AppDemoBucles
{
    
    /**
     *  Punto de entrada a la aplicación. Dentro del main:
     *  - define y crea el teclado  
     *  - define e instancia un objeto DemoBucles
     *  - pide la cantidad tope  máxima de aleatorios a generar
     *  - valida que ese tope esté entre 10 y 15
     *  - muestra los números generados como suma de potencias de 2
     *  
     *  - haz una pausa y borra la pantalla 
     *  
     *  - muestra la figura para 6 escalones de alto = 4 y ancho = 12
     *  
     *  
     */
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        DemoBucles demoBucles = new DemoBucles();
        System.out.println("Teclee tope de aleatorios a generar [10, 15]: ");
        int cantidadAleatorios = teclado.nextInt();
        while (cantidadAleatorios < 10 || cantidadAleatorios > 15) {
           System.out.println("Error, Teclee tope de aleatorios a generar [10, 15]: ");
           cantidadAleatorios = teclado.nextInt();
        }
        System.out.println("Nºs aleatorios como suma de potencias de 2");
        demoBucles.generarAleatorios(cantidadAleatorios);
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        demoBucles.mostrarEscalera(6, 4, 12);
   }
    
}

