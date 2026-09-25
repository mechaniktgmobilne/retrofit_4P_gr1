package com.example.retrofit_4p_gr1;

import com.google.gson.annotations.SerializedName;

public class Pytanie {
    @SerializedName("tresc")
    private String trescPytania;
    @SerializedName("odp_a")
    private String odpA;
    @SerializedName("odp_b")
    private String odpB;
    @SerializedName("odp_c")
    private String odpC;
    private int poprawna;

    public Pytanie(String trescPytania, String odpA, String odpB, String odpC, int poprawna) {
        this.trescPytania = trescPytania;
        this.odpA = odpA;
        this.odpB = odpB;
        this.odpC = odpC;
        this.poprawna = poprawna;
    }

    public String getTrescPytania() {
        return trescPytania;
    }

    public int getPoprawna() {
        return poprawna;
    }

    public String getOdpB() {
        return odpB;
    }

    public String getOdpC() {
        return odpC;
    }

    public String getOdpA() {
        return odpA;
    }
}
