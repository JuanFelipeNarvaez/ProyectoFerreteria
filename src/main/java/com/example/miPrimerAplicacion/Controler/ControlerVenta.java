package com.example.miPrimerAplicacion.Controler;

import com.example.miPrimerAplicacion.Interfaces.IVenta;
import com.example.miPrimerAplicacion.InterfacesService.IVentaService;
import com.example.miPrimerAplicacion.Model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ControlerVenta {
    @Autowired
    private IVentaService service2;

    @GetMapping("/listarVentas")
    public String listarVentas(Model model){
        List<Venta>ventas = service2.listarVentas();
        model.addAttribute("ventas", ventas);
        return "InfoVentas";
    }
    @GetMapping("/newVenta")
    public String agregarVenta(Model model){
        model.addAttribute("venta", new Venta());
        return "Venta";
    }
    @PostMapping("/saveVenta")
    public String saveVenta(@Validated Venta v){
        service2.saveVenta(v);
        return "redirect:/listarVentas";
    }
    @GetMapping("/editarVenta/{id}")
    public String editarVenta(@PathVariable int id, Model model){
        Optional<Venta> venta = service2.listarVentasId(id);
        model.addAttribute("venta", venta);
        return "Venta";
    }
    @GetMapping("/eliminarVenta/{id}")
    public String deleteVenta(@PathVariable int id){
        service2.deleteVenta(id);
        return "redirect:/listarVenta";
    }
}
