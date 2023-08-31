package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = getProductsFromJson("src/main/resources/productsInfo.json");
        System.out.println(productList);
    }

    public static List<Product> getProductsFromJson(String filePath) {
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