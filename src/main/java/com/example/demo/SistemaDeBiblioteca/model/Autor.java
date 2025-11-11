package com.example.demo.SistemaDeBiblioteca.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.OneToMany;

public class Autor extends PessoaBase {

    private String biografia;

    @OneToMany(mappedBy = "autor")
    private List<Livro> livros = new ArrayList<>();

    public Autor(String nome, String cpf, String email, Long telefone, String biografia) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEmail(email);
        super.setTelefone(telefone);
        this.biografia = biografia;
    }
    
    
}
