package com.example.miPrimerAplicacion.Interfaces;

import com.example.miPrimerAplicacion.Model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer>{
}
