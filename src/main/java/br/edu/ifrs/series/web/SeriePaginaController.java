package br.edu.ifrs.series.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.ifrs.series.dao.SerieDAO;

@Controller
public class SeriePaginaController {
    private final SerieDAO dao;
    public SeriePaginaController(SerieDAO dao){ 
        this.dao = dao;
    }
    @GetMapping("/paginas/series")
    public String listar(Model model) {
        model.addAttribute("series", dao.listarTodas());
        return "series/lista";
    }
}
