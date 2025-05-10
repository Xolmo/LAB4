package com.example.lab4.Controller;

import com.example.lab4.Entity.Clinicas;
import com.example.lab4.Repository.ClinicasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/clinicas")
public class ClinicController {
    @Autowired
    ClinicasRepository clinicasRepository;

    @GetMapping(value = {"", "/"})
    public String listaClinicas(Model model) {
        List<Clinicas> clinicas = clinicasRepository.findAll();
        model.addAttribute("clinicas", clinicas);
        return "/clinicas/list";
    }

    @GetMapping("/new")
    public String newClinica(@ModelAttribute("clinic") Clinicas clinicas, Model model) {
        return "/clinicas/editForm";
    }

    @GetMapping("/edit")
    public String editClinica(@ModelAttribute("clinic") Clinicas clinicas, Model model, @RequestParam("id") int id) {
        Optional<Clinicas> optclinica = clinicasRepository.findById(id);
        if (optclinica.isPresent()) {
            Clinicas clinica = optclinica.get();
            model.addAttribute("clinic", clinica);
            return "/clinicas/editForm";
        }
        return "redirect:/clinicas";
    }

    @GetMapping("/save")
    public String saveClinica(@ModelAttribute("clinic") Clinicas clinicas, RedirectAttributes attr) {
        clinicasRepository.save(clinicas);
        return "redirect:/clinicas";
    }
}
