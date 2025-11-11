package com.example.demo.SistemaDeBiblioteca.model;

public interface Reservavel {
    public void reservar(Usuario usuario);
    public void cancelarReserva();
    public void notificar();
}
