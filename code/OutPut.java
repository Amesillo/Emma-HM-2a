import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class OutPut {

    /**
     * Default constructor
     */
    public OutPut() {
    }


    /**
     * 
     */
   public void writeData(String outFile, String outText) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
            bw.write(outText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}