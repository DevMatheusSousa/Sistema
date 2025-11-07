package com.example.demo.SistemaDeBiblioteca.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass // essa anotacao e usada para indicar que a classe PessoaBase é uma classe base
                  // para outras classes
public abstract class PessoaBase extends EntidadeBase {
    private String nome;
    private String cpf;
    private String email;
    private Long telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.isEmpty() || cpf.isBlank()) {
            throw new IllegalArgumentException("CPF nao pode ser vazio ou nulo");
        }
        if (!cpf.matches("^[0-9]{11}$")) {
            throw new IllegalArgumentException("CPF invalido");
        }
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.isEmpty() || email.isBlank()) {
            throw new IllegalArgumentException("Email nao pode ser vazio ou nulo");
        }
        // usando regex para verificar se o email e valido
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email invalido");
        }
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        if (telefone == null) {
            throw new IllegalArgumentException("Telefone nao pode ser nulo");
        }
        if (telefone.toString().isEmpty() || telefone.toString().isBlank()) {
            throw new IllegalArgumentException("Telefone nao pode ser vazio ou nulo");
        }
        if (!telefone.toString().matches("^[0-9]{11}$")) {
            throw new IllegalArgumentException("Telefone invalido");
        }
        this.telefone = telefone;
    }

}
