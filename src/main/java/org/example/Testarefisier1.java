package org.example;

public class Testarefisier1 {
    public String mesaj;

    public Testarefisier1(String mesaj) {
        this.mesaj = mesaj;
    }

    public String getMesaj() {
        return mesaj;
    }

    @Override
    public String toString() {
        return "Testarefisier1{" +
                "mesaj='" + mesaj + '\'' +
                '}';
    }
}
