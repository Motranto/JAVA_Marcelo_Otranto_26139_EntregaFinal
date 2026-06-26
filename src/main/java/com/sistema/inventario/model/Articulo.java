package com.sistema.inventario.model;

import jakarta.persistence.*;

@Entity
@Table(name = "articulos")

public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Secuencial automático (Auto-increment)
    private Long id;

    @Column(length = 13, unique = true, nullable = false)
    private String ean; // Usamos String para conservar ceros a la izquierda si los hubiera

    @Column(nullable = false)
    private String nombre;

    private String descripcion;

    @Column(nullable = false) 
    private Double precio;

    private String urlImagen;


    // cosntructor vacío (obligatorio)
    public Articulo() {}

    // constructor
    public Articulo(Long id, String ean, String nombre, String descripcion, Double precio, String urlImagen) {
        this.id = id;
        this.ean = ean;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.urlImagen = urlImagen;
    }

    // getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getEan() {return ean; }
    public void setEan(String ean) {this.ean = ean; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion;}
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
    public String getUrlImagen() { return urlImagen; }
    public void setUrlImagen(String urlImagen) { this.urlImagen = urlImagen;}
}
