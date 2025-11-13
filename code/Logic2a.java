import java.io.File;
import java.util.*;

/**
 * Class Logic2a
 */
public class Logic2a {
public void logic2a()
{
    Input myInput = new Input();
    Data myData = new Data();
    LineCounter myLineCounter = new LineCounter();
    MethodCounter myMethodCounter = new MethodCounter();
    OutPut output = new OutPut();

    // Analizar cada archivo individualmente
    String[] files = {"App.java", "Logic2a.java", "LineCounter.java", 
                     "MethodCounter.java", "Input.java", "OutPut.java", "Data.java"};
    
    int totalLines = 0;
    int totalMethods = 0;
    
    for (String file : files) {
        String data = myInput.readData(file);
        String[] arrData = myData.saveData(data);
        
        int lines = myLineCounter.count(arrData);
        int methods = myMethodCounter.count(arrData);
        
        totalLines += lines;
        totalMethods += methods;
        
        System.out.println(file + ": " + lines + " líneas, " + methods + " métodos");
    }

    String result = "Líneas de código contadas: " + totalLines + 
                   "\nMétodos contados: " + totalMethods;

    output.writeData("Out2.txt", result);
    System.out.println(result);
}
}
