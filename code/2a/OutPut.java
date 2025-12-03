/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Emma Hernández Mendoza]
 * Fecha: [2025-06-11]
 * Descripción: Manejador de salida para generar reportes en texto plano.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutPut {
    
    /**
     * Guarda una cadena de texto en un archivo del sistema.
     * @param outFile Nombre del archivo destino.
     * @param outText El contenido a guardar.
     */
    public void writeData(String outFile, String outText) {
        // El bloque try garantiza que el buffer se libere correctamente
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
            bw.write(outText);
        } catch (IOException e) {
            // Captura de errores de escritura
            e.printStackTrace();
        }
    }
}