import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
public class UtilClass {
    private Car product;

    public UtilClass() {
    }

    public void adaugaFisier(Car product) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("util.json"), product);
    }

    public void citesteFisier(Car product) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.readValue(Paths.get("util.json").toFile(), Car.class);
    }
}