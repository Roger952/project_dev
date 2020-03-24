package com.br.jirehconfeccoes.TestWithMongo.test_document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Document")
public class TestDocument {

    @Id
    private String id;
    private String nameDocument;
    private byte[] document;
    private String descriptionDocument;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameDocument() {
        return nameDocument;
    }

    public void setNameDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }

    public String getDescriptionDocument() {
        return descriptionDocument;
    }

    public void setDescriptionDocument(String descriptionDocument) {
        this.descriptionDocument = descriptionDocument;
    }

    @Override
    public String toString() {
        return "TestDocument{" +
                "id='" + id + '\'' +
                ", nameDocument='" + nameDocument + '\'' +
                ", document=" + document +
                ", descriptionDocument='" + descriptionDocument + '\'' +
                '}';
    }
}
