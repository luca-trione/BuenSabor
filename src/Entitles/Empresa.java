package Entitles;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private int cuil;
    private ArrayList<Sucursal> sucursales;

    public Empresa(String nombre, String razonSocial, int cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
        this.sucursales = new ArrayList<>();
    }


}
