package com.aluracursos.aluraforo.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluracursos.aluraforo.modelos.Topico;
import com.aluracursos.aluraforo.repositorio.Repositorio;
import com.aluracursos.aluraforo.validacion.TopicoDato;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/topicos")
public class TopicoControlador {
    @Autowired
    private Repositorio repositorio;

    @PostMapping
    private void requestTopicos(@RequestBody @Valid TopicoDato topico) {
        repositorio.save(new Topico(topico));
        System.out.println(topico);
    }

    @GetMapping
    private String listarTopicos() {
        List<Topico> topico = repositorio.findAll();
        topico.stream().forEach(x -> System.out.println(x.toString()) );
        return "Listo";
    }
}
