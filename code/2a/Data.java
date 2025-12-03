/**
 * Asignación de Programa: PSP 2A
 * Nombre: [Emma Hernández Mendoza]
 * Fecha: [2025-06-11]
 * Descripción: Utilidad para la manipulación y estructuración de los datos brutos.
 */

public class Data {

    /**
     * Constructor base de la clase.
     */
    public Data() {
        // No se requieren acciones de inicialización
    }

    /**
     * Transforma el texto completo en un array manejable por líneas.
     * @param data El texto completo del archivo fuente.
     * @return Array de Strings donde cada elemento es una línea.
     */
    public String[] saveData(String data) {
        // Se fragmenta el texto utilizando el salto de línea como delimitador
        return data.split("\n");
    }
}