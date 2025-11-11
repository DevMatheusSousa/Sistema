package com.example.demo.SistemaDeBiblioteca.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

public class Usuario extends PessoaBase{

    private TipoUsuario tipoUsuario;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToMany(mappedBy = "usuarios", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Livro> livros = new ArrayList<>();

    public Usuario(String nome, String cpf, String email, Long telefone, TipoUsuario tipoUsuario) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEmail(email);
        super.setTelefone(telefone);
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario() {
        super();
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<Livro> getLivros() {
        return livros;
    }
    
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
    

