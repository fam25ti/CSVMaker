import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.reflect.Field;

public class CSVGenerator {
    public void toCSV(ArrayList<Object> objs, String path) throws IOException, IllegalAccessException {
        Field[] fields = objs.get(0).getClass().getDeclaredFields();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        for(Field field: fields){
            writer.append(field.getName()+", ");
        }
        writer.append("\n");//to create first row(headers)
        for(Object obj: objs){
            for(Field field: fields){
                writer.append(field.get(obj)+", ");
            }
            writer.append("\n");
        }
        System.out.println("CSV file generated Successfully in given path("+path+")");
        writer.close();
    }
}
