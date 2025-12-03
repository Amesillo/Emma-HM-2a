/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Emma Hernández Mendoza]
 * Fecha: [2025-06-11]
 * Descripción: Algoritmo para identificar y contar métodos públicos.
 */

public class MethodCounter {

    /**
     * Escanea el código buscando firmas de métodos válidos.
     * @param artData Las líneas del archivo fuente.
     * @return Cantidad de métodos detectados.
     */
    public int count(String[] artData) {
        int count = 0;
        
        for (String line : artData) {
            String trimmedLine = line.trim();
            
            // Criterios heurísticos para identificar una firma de método
            boolean esPublico = trimmedLine.startsWith("public");
            boolean tieneParentesis = trimmedLine.contains("(") && trimmedLine.contains(")");
            boolean esClase = trimmedLine.contains("class");
            boolean esComentario = trimmedLine.startsWith("//");
            // Evitamos contar interfaces o métodos abstractos sin cuerpo
            boolean esDeclaracionVacia = trimmedLine.endsWith(");"); 
            boolean esMetodoVacio = trimmedLine.endsWith("{}");

            if (esPublico && 
                tieneParentesis && 
                !esClase && 
                !esComentario && 
                !esMetodoVacio && 
                !esDeclaracionVacia) {
                
                // Se encontró una coincidencia válida
                count++;
            }
        }
        
        return count;
    }
}