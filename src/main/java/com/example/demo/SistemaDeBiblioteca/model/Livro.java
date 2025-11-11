package com.example.demo.SistemaDeBiblioteca.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro extends EntidadeBase implements Emprestavel, Reservavel{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String titulo;
    private String editora;

    @OneToMany(mappedBy = "livro")
    private List<Usuario> usuarios = new ArrayList<>();


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Autor autor;
    
    public Livro(String titulo, Autor autor, String editora) {
        super();
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public Livro() {
        super();
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public void cancelar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void devolver() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void emprestar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void notificar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void renovar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cancelarReserva() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void reservar(Usuario usuario) {
        // TODO Auto-generated method stub
        
    }
    
}
