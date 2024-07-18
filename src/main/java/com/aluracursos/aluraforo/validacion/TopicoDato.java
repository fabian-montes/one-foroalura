package com.aluracursos.aluraforo.validacion;

import jakarta.validation.constraints.NotBlank;

public record TopicoDato (
    @NotBlank
    String titulo,
    @NotBlank
    String mensaje,
    @NotBlank
    String autor,
    @NotBlank
    String curso
) {}
