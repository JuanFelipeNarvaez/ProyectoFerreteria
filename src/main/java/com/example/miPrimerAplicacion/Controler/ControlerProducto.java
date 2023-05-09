package com.example.miPrimerAplicacion.Controler;

import com.example.miPrimerAplicacion.InterfacesService.IProductoService;
import com.example.miPrimerAplicacion.Model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;
@Controller
@RequestMapping
public class ControlerProducto {
    @Autowired
    private IProductoService service;


    @GetMapping("/listarProducto")
    public String listar(Model model){
        List<Producto>productos= service.listar();
        model.addAttribute("productos", productos);
        return "FormWorker";
    }
    @GetMapping("/newProducto")
    public String agregar(Model model){
        model.addAttribute("producto", new Producto());
        return "FormWorker";
    }

    @PostMapping("/saveProducto")
    public String save(@Validated Producto p){
        service.save(p);
        return "redirect:/listarProducto";
    }

    @GetMapping("/editarProducto/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Producto> producto = service.listarId(id);
        model.addAttribute("producto", producto);
        return "FormWorker";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listarProducto";
    }
}
