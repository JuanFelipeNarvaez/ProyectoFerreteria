package com.example.miPrimerAplicacion.Controler;

import com.example.miPrimerAplicacion.Interfaces.IVenta;

import com.example.miPrimerAplicacion.InterfacesService.IProductoService;
import com.example.miPrimerAplicacion.InterfacesService.IVentaService;
import com.example.miPrimerAplicacion.Model.Producto;
import com.example.miPrimerAplicacion.Model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ControlerVenta {
    @Autowired
    private IVentaService service2;

    @Autowired
    private IProductoService service1;

    @GetMapping("/listarVentas")
    public String listarVentas(Model model){
        List<Venta> ventas = service2.listarVentas();
        model.addAttribute("ventas", ventas);
        return "InfoVentas";
    }
    @GetMapping("/newVenta")
    public String agregarProducto(Model model){
        model.addAttribute("venta", new Venta());
        return "Venta";
    }

}
