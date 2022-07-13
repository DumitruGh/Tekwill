package org.example;

import com.google.gson.Gson;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

       Gson gson = new Gson();
       Author author1 = new Author("Mihai", "Eminescu",1850);
       Author author2 = new Author("Ion", "Creanga",1850);

        Book b1 = new Book("Jurnal",1873, Set.of(author1,author2));

        String json = gson.toJson(b1);
        System.out.println(json);

        String json2 = "{\"id\":1,\"title\":\"Jurnal\",\"yearOfPublish\":1875,\"authors\":[{\"id\":2,\"name\":\"Tudor\",\"surName\":\"Arghezi\",\"birthDate\":1850},{\"id\":1,\"name\":\"Mihai\",\"surName\":\"Eminescu\",\"birthDate\":1850}]}\n";
        Book b2 = gson.fromJson(json2, Book.class);
        System.out.println(b2);


    }
}