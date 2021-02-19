package br.com.spring.blog.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity // Tabela no banco de dados.
@Table(name="TB_POST") // Anotação para mudar o nome da tabela.
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Gera os IDs automaticamente.
    private Long id;

    private String titulo;

    private String autor;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy") // Padrão de data que será salvo.
    private LocalDate data;

    @Lob // Para o banco aceitar valores grandes e melhorar a performace.
    private String texto;

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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
