package com.br.jirehconfeccoes.TestWithMongo.test_document_sql;

import com.br.jirehconfeccoes.utils.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "test_document_sql")
public class TestDocumentSql extends AbstractEntity {

    @Column(name = "note1")
    private Double valorA;
    @Column(name = "note2")
    private Double valorB;
    @Column(name = "note3")
    private Double valorC;
    @Column(name = "resultado_final")
    private Integer result;

    public Double getValorA() {
        return valorA;
    }

    public void setValorA(Double valorA) {
        this.valorA = valorA;
    }

    public Double getValorB() {
        return valorB;
    }

    public void setValorB(Double valorB) {
        this.valorB = valorB;
    }

    public Double getValorC() {
        return valorC;
    }

    public void setValorC(Double valorC) {
        this.valorC = valorC;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "TestDocumentSql{" +
                "note1=" + valorA +
                ", note2=" + valorB +
                ", note3=" + valorC +
                ", result=" + result +
                '}';
    }
}
