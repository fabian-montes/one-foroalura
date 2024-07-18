package com.aluracursos.aluraforo.modelos;

import com.aluracursos.aluraforo.validacion.TopicoDato;
import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "topicos")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensaje;

    @CreationTimestamp
    private Timestamp fechaCreacion;

    private String estado;
    private String autor;
    private String curso;

    public Topico() {}

    public Topico(TopicoDato topico) {
        titulo = topico.titulo();
        mensaje = topico.mensaje();
        autor = topico.autor();
        curso = topico.curso();
        estado = "disponible";
    }

    @Override
    public String toString() {
        return "Topico [id=" + id + ", titulo=" + titulo + ", mensaje=" + mensaje + ", fechaCreacion=" + fechaCreacion
                + ", estado=" + estado + ", autor=" + autor + ", curso=" + curso + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
           return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
