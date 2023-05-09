package com.example.miPrimerAplicacion.Service;

import com.example.miPrimerAplicacion.Interfaces.IEmpleado;
import com.example.miPrimerAplicacion.InterfacesService.IProductoService;
import com.example.miPrimerAplicacion.Interfaces.IProducto;
import com.example.miPrimerAplicacion.Model.Empleado;
import com.example.miPrimerAplicacion.Model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public class ProductoService implements IProductoService{
    @Autowired
    private IProducto data;

    @Override
    public List<Producto> listar() {
        return (List<Producto>) data.findAll();
    }

    @Override
    public Optional<Producto> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Producto p) {
        int res = 0;
        Producto producto = data.save(p);
        if(!producto.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
