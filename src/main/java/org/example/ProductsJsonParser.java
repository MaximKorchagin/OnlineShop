package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
// S from SOLID
public class ProductsJsonParser {
    public List<Product> getProductsFromJson(String filePath) {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = jsonParser.parse(reader);
            JSONArray products = (JSONArray) obj;
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Product>>() {}.getType();
            return gson.fromJson(products.toString(), listType);
        } catch (ParseException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
