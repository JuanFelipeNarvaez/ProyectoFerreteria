package com.example.miPrimerAplicacion.Service;

import com.example.miPrimerAplicacion.Interfaces.IProducto;
import com.example.miPrimerAplicacion.InterfacesService.IProductoService;
import com.example.miPrimerAplicacion.Model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    private IProducto data1;

    @Override
    public List<Producto> listarProductos(){
        return (List<Producto>)  data1.findAll();
    }
    @Override
    public Optional<Producto> listarProductosId(int id){
        return data1.findById(id);
    }
    @Override
    public int saveProducto(Producto p){
        int res = 0;
        p.setTotal(p.getPrecio() * p.getCantidad());
        Producto producto = data1.save(p);
        if(!producto.equals(null)){
            res = 1;
        }
        return res;
    }
    @Override
    public void deleteProducto(int id){
        data1.deleteById(id);
    }
}
