package org.learning.bestoftheyear.model;

public class Movies {
    private int id;
    private String titolo;

    public Movies(int id, String titolo) {
        this.id = id;
        this.titolo = titolo;
    }

    public Movies(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
