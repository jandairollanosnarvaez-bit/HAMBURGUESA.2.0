package com.sena;

import java.util.ArrayList;

public class Clientes {

    public static void main(String[] args) {

        
        Hamburguesa cliente1 = new Hamburguesa("Res", "Normal", true, true);
        cliente1.agregarExtra("Tocineta");
        cliente1.agregarExtra("Tomate");

        Hamburguesa cliente2 = new Hamburguesa("Pollo", "Integral", true, false);
        cliente2.agregarExtra("Lechuga");

        
        Hamburguesa cliente3 = new Hamburguesa();
        cliente3.setTipoCarne("Cerdo");
        cliente3.setTipoPan("Avena");
        cliente3.setQueso(true);
        cliente3.setSalsas(true);
        cliente3.agregarExtra("Pepinillos");
        cliente3.agregarExtra("Cebolla");

        
        ArrayList<Hamburguesa> hamburguesas = new ArrayList<>();

        hamburguesas.add(cliente1);
        hamburguesas.add(cliente2);
        hamburguesas.add(cliente3);

        
        for (Hamburguesa cliente : hamburguesas) {

            System.out.println(cliente.describirHamburguesa());

            System.out.println("Carne: " + cliente.getTipoCarne());
            System.out.println("Pan: " + cliente.getTipoPan());
            System.out.println("Queso: " + (cliente.isQueso() ? "Sí" : "No"));
            System.out.println("Salsas: " + (cliente.isSalsas() ? "Sí" : "No"));
            System.out.println("Extras: " + cliente.getExtras());

            System.out.println("-----------------------------");
        }
    }
}