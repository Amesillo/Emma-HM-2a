import java.util.*;

/**
 * Class MethodCounter
 */
public class MethodCounter {

  //
  // Fields
  //

  private int totalMethods;
  private String[] artData;


public int count(String[] artData)
{
    int count = 0;
    for (String line : artData) {
        String trimmedLine = line.trim();
        
        // Contar métodos públicos que no sean constructores vacíos
        if (trimmedLine.startsWith("public") && 
            trimmedLine.contains("(") && 
            trimmedLine.contains(")") && 
            !trimmedLine.contains("class") &&
            !trimmedLine.startsWith("//") &&
            !trimmedLine.endsWith("{}") && 
            !trimmedLine.endsWith(");")) { 
            count++;
        }
    }
    return count;
}
}