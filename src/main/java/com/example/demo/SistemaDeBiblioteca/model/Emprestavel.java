package com.example.demo.SistemaDeBiblioteca.model;

public interface Emprestavel {
    public void emprestar();
    public void devolver();
    public void renovar();
    public void cancelar();
    public void notificar();
}
