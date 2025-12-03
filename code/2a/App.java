/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Emma Hernández Mendoza]
 * Fecha: [2025-06-11]
 * Descripción: Clase driver encargada de arrancar la herramienta de conteo.
 */

public class App {

    /**
     * Punto de entrada principal de la ejecución.
     * @param args Parámetros de consola (sin uso actual).
     */
    public static void main(String[] args) {
        // Inicializamos la lógica principal del programa
        Logic logicProcessor = new Logic();
        // Ejecutamos el flujo de trabajo de análisis
        logicProcessor.logic2a();
    }
}