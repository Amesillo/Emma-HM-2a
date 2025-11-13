import java.io.*;

/**
 * data : string
 * data : string
 */
public class Input {

    /**
     * Default constructor
     */
    public Input() {
    }

    /**
     * 
     */
    private String data;

    /**
     * 
     */
    private BufferedReader br = null;

    /**
     * 
     */
     public String readData(String inFile) {
        StringBuilder data = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "";  // CORREGIDO: retornar string vacío en caso de error
        }
        return data.toString();
    }
}