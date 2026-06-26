package com.sistema.inventario.repository;

import com.sistema.inventario.model.Articulo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
    // Aquí ya tienes heredados métodos como findAll(), findById(), save() y deleteById()
}