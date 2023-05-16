package com.example.miPrimerAplicacion.InterfacesService;

import com.example.miPrimerAplicacion.Model.Venta;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@SpringBootApplication(scanBasePackages = {"com.example.miPrimerAplicacion"})
public interface IVentaService {
    public List<Venta> listarVentas();
    public Optional<Venta> listarVentasId(int id);
    public int saveVenta(Venta v);
    public void deleteVenta(int id);
}
