package com.example.lista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class ListaApplication {

    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println(lista.estaVazia());
        lista.inserePrimeiro(10);
        lista.inserePrimeiro(20);
        lista.mostrar();
        System.out.println("REMOVI PRIMEIRO O: " + lista.removePrimeiro().getNumeroNo());
    }
}
