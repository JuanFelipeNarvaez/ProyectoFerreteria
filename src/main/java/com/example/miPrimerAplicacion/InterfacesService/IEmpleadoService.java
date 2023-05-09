package com.example.miPrimerAplicacion.InterfacesService;

import com.example.miPrimerAplicacion.Model.Empleado;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.miPrimerAplicacion"})
public interface IEmpleadoService {
    public List<Empleado>listar();
    public Optional<Empleado>listarId(int id);
    public int save (Empleado p);
    public void delete(int id);

}
