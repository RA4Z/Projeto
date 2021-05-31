package br.com.grupo4.Consultor.api.controller;

import br.com.grupo4.Consultor.domain.model.Consultor;
import br.com.grupo4.Consultor.domain.repository.ConsultorRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/consultor")
public class ConsultorController {

    @Autowired
    private ConsultorRepository consultorRepository;

    @GetMapping()
    public List<Consultor> listar() {
    return consultorRepository.findAll();
    }

}
