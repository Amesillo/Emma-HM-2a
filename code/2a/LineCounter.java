/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Emma Hernández Mendoza]
 * Fecha: [2025-06-11]
 * Descripción: Lógica para el conteo de líneas de código efectivas (L.O.C.).
 */

public class LineCounter {

    /**
     * Calcula las líneas válidas ignorando comentarios y espacios vacíos.
     * @param artData Array con las líneas del código fuente.
     * @return Cantidad de líneas que contienen código real.
     */
    public int count(String[] artData) {
        int count = 0;
        
        // Evaluamos cada línea individualmente
        for (String line : artData) {
            // Eliminamos espacios sobrantes de los extremos
            String trimmedLine = line.trim();
            
            // Aplicamos filtros para descartar lo que no es código
            if (trimmedLine.isEmpty() ||               // Ignorar líneas en blanco
                trimmedLine.startsWith("//") ||        // Ignorar comentarios simples
                trimmedLine.equals("{") ||             // Ignorar llaves de apertura aisladas
                trimmedLine.equals("}") ||             // Ignorar llaves de cierre aisladas
                trimmedLine.startsWith("*") ||         // Ignorar cuerpo de Javadoc
                trimmedLine.startsWith("/*") ||        // Ignorar inicio de bloque de comentario
                trimmedLine.endsWith("*/")) {          // Ignorar fin de bloque de comentario
                // Si cumple alguna condición de exclusión, pasamos a la siguiente
                continue;
            }
            
            // Si pasa los filtros, cuenta como línea de código
            count++;
        }
        
        return count;
    }
}