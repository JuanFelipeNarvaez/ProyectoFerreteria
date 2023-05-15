package com.example.miPrimerAplicacion.Interfaces;

import com.example.miPrimerAplicacion.Model.Venta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVenta extends CrudRepository<Venta, Integer> {
}
