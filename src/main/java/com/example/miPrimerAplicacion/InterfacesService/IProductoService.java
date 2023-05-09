package com.example.miPrimerAplicacion.InterfacesService;

import com.example.miPrimerAplicacion.Model.Producto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.miPrimerAplicacion"})
public interface IProductoService {
    public List<Producto>listar();
    public Optional<Producto>listarId(int id);
    public int save (Producto p);
    public void delete(int id);
}
