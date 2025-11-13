/**
 * 
 */
public class Data {

    /**
     * Default constructor
     */
    public Data() {
    }

    /**
     * 
     */
     public String[] saveData(String data) {
        // CORREGIDO: Dividir el contenido real del archivo por líneas
        return data.split("\n");
    }
}