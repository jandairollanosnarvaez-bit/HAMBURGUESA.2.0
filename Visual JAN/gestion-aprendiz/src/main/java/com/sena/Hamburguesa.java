package com.sena;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa {

    // ATRIBUTOS
    private String tipoCarne;
    private String tipoPan;
    private boolean queso;
    private boolean salsas;
    private List<String> extras;

    // CONSTRUCTOR VACÍO
    public Hamburguesa() {
        this.extras = new ArrayList<>();
    }

    // CONSTRUCTOR COMPLETO
    public Hamburguesa(String tipoCarne, String tipoPan, boolean queso, boolean salsas) {
        this();
        setTipoCarne(tipoCarne);
        setTipoPan(tipoPan);
        this.queso = queso;
        this.salsas = salsas;
    }

    // GETTERS
    public String getTipoCarne() {
        return tipoCarne;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public boolean isQueso() {
        return queso;
    }

    public boolean isSalsas() {
        return salsas;
    }

    public List<String> getExtras() {
        return extras;
    }

    // SETTERS
    public void setTipoCarne(String tipoCarne) {
        if (tipoCarne == null || tipoCarne.isEmpty()) {
            throw new IllegalArgumentException("Debe especificar un tipo de carne.");
        }
        this.tipoCarne = tipoCarne;
    }

    public void setTipoPan(String tipoPan) {
        if (tipoPan == null || tipoPan.isEmpty()) {
            throw new IllegalArgumentException("Debe especificar un tipo de pan.");
        }
        this.tipoPan = tipoPan;
    }

    public void setQueso(boolean queso) {
        this.queso = queso;
    }

    public void setSalsas(boolean salsas) {
        this.salsas = salsas;
    }

    // MÉTODO PARA AGREGAR EXTRAS
    public void agregarExtra(String extra) {
        if (extra != null && !extra.isEmpty()) {
            extras.add(extra);
        }
    }

    // MÉTODO PARA DESCRIBIR LA HAMBURGUESA
    public String describirHamburguesa() {
        return "Hamburguesa {" +
                "Carne='" + tipoCarne + '\'' +
                ", Pan='" + tipoPan + '\'' +
                ", Queso=" + (queso ? "Sí" : "No") +
                ", Salsas=" + (salsas ? "Sí" : "No") +
                ", Extras=" + extras +
                '}';
    }
}