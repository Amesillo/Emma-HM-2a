/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Emma Hernández Mendoza]
 * Fecha: [2025-06-11]
 * Descripción: Controlador central que orquesta la lectura, conteo y reporte.
 */

import java.util.Scanner;

public class Logic {
    
    /**
     * Ejecuta el flujo completo de la asignación.
     */
    public void logic2a() {
        // Inicializamos Scanner para interactuar con el usuario
        Scanner scanner = new Scanner(System.in);
        
        // Petición de datos al usuario
        System.out.print("Ingrese el nombre del archivo a analizar: ");
        String fileName = scanner.nextLine();
        
        // Instanciación de componentes necesarios (Helpers)
        Input myInput = new Input();
        Data myData = new Data();
        LineCounter myLineCounter = new LineCounter();
        MethodCounter myMethodCounter = new MethodCounter();
        OutPut output = new OutPut();
        
        // Obtención del contenido crudo del archivo
        String fileContent = myInput.readData(fileName);
        
        // Validación básica: si no hay contenido, abortamos
        if (fileContent.isEmpty()) {
            System.out.println("Error: No se pudo leer el archivo " + fileName);
            scanner.close();
            return;
        }
        
        // Procesamiento: conversión a array de líneas
        String[] linesArray = myData.saveData(fileContent);
        
        // Ejecución de los algoritmos de conteo
        int lineCount = myLineCounter.count(linesArray);
        int methodCount = myMethodCounter.count(linesArray);
        
        // Construcción del reporte final
        String result = "Archivo analizado: " + fileName + 
                       "\nLíneas de código contadas: " + lineCount + 
                       "\nMétodos contados: " + methodCount;
        
        // Persistencia (guardar en disco) y visualización en pantalla
        output.writeData("Out2.txt", result);
        System.out.println(result);
        
        // Limpieza de recursos
        scanner.close();
    }
}