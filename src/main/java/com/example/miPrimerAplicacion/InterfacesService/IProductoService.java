package com.example.miPrimerAplicacion.InterfacesService;

import com.example.miPrimerAplicacion.Model.Producto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.miPrimerAplicacion"})
public interface IProductoService {
    public List<Producto>listarProductos();
    public Optional<Producto>listarProductosId(int id);
    public int saveProducto(Producto p);
    public void deleteProducto(int id);

}
