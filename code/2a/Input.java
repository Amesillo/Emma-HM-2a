/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Emma Hernández Mendoza]
 * Fecha: [2025-06-11]
 * Descripción: Módulo encargado de la lectura física de archivos en disco.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input {

    /**
     * Extrae el texto de un archivo especificado.
     * @param inFile Ruta o nombre del archivo objetivo.
     * @return El texto completo del archivo o cadena vacía si falla.
     */
    public String readData(String inFile) {
        // Utilizamos StringBuilder por rendimiento al concatenar múltiples líneas
        StringBuilder data = new StringBuilder();
        
        // Bloque try-with-resources para garantizar el cierre del flujo de datos
        try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
            String line;
            
            // Recorremos el archivo hasta que no queden líneas (retorna null)
            while ((line = br.readLine()) != null) {
                // Anexamos la línea actual y restauramos el salto de línea
                data.append(line).append("\n");
            }
        } catch (IOException e) {
            // En caso de error de lectura, mostramos la traza y retornamos vacío
            e.printStackTrace();
            return "";
        }
        
        // Retornamos el contenido acumulado como un solo String
        return data.toString();
    }
}