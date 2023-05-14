package com.example.miPrimerAplicacion.Service;

import com.example.miPrimerAplicacion.Interfaces.IProducto;
import com.example.miPrimerAplicacion.Interfaces.IVenta;
import com.example.miPrimerAplicacion.InterfacesService.IVentaService;
import com.example.miPrimerAplicacion.Model.Producto;
import com.example.miPrimerAplicacion.Model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VentaService implements IVentaService{
    @Autowired
    private IVenta data2;

    @Override
    public List<Venta> listarVentas(){
        return (List<Venta>) data2.findAll();
    }
    @Override
    public Optional<Venta> listarIdVenta(int id){
        return data2.findById(id);
    }
    @Override
    public int saveVenta(Venta v){
        int res = 0;
        Venta venta = data2.save(v);
        if(!venta.equals(null)){
            res = 1;
        }
        return res;
    }
    @Override
    public void deleteVenta(int id){
        data2.deleteById(id);
    }
}
