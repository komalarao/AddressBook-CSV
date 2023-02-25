package addressBookCsv;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.*;
import java.util.List;
public class JsonOperations {
	File file = new File("C:\\Users\\komalarao\\eclipse-workspace\\addressBookCsv\\src\\addressBookCsv");
    public void writeOnJson(List<Contacts> contacts) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for(Contacts value : contacts) {
            fileWriter.write(new Gson().toJson(value));
        }
        fileWriter.close();
    }
    public void readFromJso() throws FileNotFoundException {
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(file));
        Contacts data = gson.fromJson(reader, Contacts.class);
        System.out.println(data);
    }
}
