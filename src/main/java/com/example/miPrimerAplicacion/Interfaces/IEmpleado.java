package com.example.miPrimerAplicacion.Interfaces;
import com.example.miPrimerAplicacion.Model.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, Integer>{

}
