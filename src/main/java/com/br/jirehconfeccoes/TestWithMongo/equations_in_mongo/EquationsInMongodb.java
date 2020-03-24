package com.br.jirehconfeccoes.TestWithMongo.equations_in_mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Equations")
public class EquationsInMongodb {

    @Id
    private String id;
    private String equation;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "EquationsInMongodb{" +
                "id='" + id + '\'' +
                ", equation='" + equation + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
