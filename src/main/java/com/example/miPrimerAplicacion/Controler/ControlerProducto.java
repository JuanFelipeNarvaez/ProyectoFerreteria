package com.example.miPrimerAplicacion.Controler;

import com.example.miPrimerAplicacion.InterfacesService.IProductoService;
import com.example.miPrimerAplicacion.InterfacesService.IVentaService;
import com.example.miPrimerAplicacion.Model.Empleado;
import com.example.miPrimerAplicacion.Model.Producto;
import com.example.miPrimerAplicacion.Model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ControlerProducto {
    @Autowired
    private IProductoService service1;

    @Autowired
    private IVentaService service2;


    @GetMapping("/listarProductos")
    public String listarProductos(Model model){
        List<Producto>productos = service1.listarProductos();
        model.addAttribute("productos", productos);
        return "InfoProductos";
    }
    @GetMapping("/newProducto")
    public String agregarProducto(Model model){
        model.addAttribute("producto", new Producto());
        return "Producto";
    }
    @PostMapping("/saveProducto")
    public String saveProducto(@Validated Producto p){
        service1.saveProducto(p);
        return "redirect:/listarProductos";
    }
    @GetMapping("/editarProducto/{id}")
    public String editarProducto(@PathVariable int id, Model model){
        Optional<Producto> producto = service1.listarProductosId(id);
        model.addAttribute("producto", producto);
        return "Producto";
    }
    @GetMapping("/eliminarProducto/{id}")
    public String deleteProducto(@PathVariable int id){
        service1.deleteProducto(id);
        return "redirect:/listarProductos";
    }
    @GetMapping("/agregarVenta/{id}")
    public String addVenta(@PathVariable int id, Model model, Model model1){
        Optional<Producto> producto = service1.listarProductosId(id);
        model.addAttribute("producto", producto);
        return "producto";
    }

}
