package com.example.lista;

import javax.swing.*;
import java.util.*;
import java.util.ArrayList;

public class Lista {
    No primeiroNo;
    No ultimoNo;
    No novoNo;

    public Lista() {
        primeiroNo = null;
    } 

    public No getPrimeiroNo() {
        return primeiroNo;
    }

    public boolean estaVazia(){
        return primeiroNo==null;
        /*if (primeiroNo==null){
            return true;
        }else{
            return false;
        }*/
    }

    public void setPrimeiroNo(No primeiroNo) {
        this.primeiroNo = primeiroNo;
    }
    public No getUltimoNo() {
        return ultimoNo;
    }
    public void setUltimoNo(No ultimoNo) {
        this.ultimoNo = ultimoNo;
    }
    public No getNovoNo() {
        return novoNo;
    }
    public void setNovoNo(No novoNo) {
        this.novoNo = novoNo;
    }

    /*public void adicionarNo(int novo){
        No novoNo = new No(novo);
        if (primeiroNo == null){
            primeiroNo = novoNo;
        } else {
            ultimoNo = novoNo;
        }
    }*/
    public void inserirPrimeiro(int valor){
        No no1 = new No(Valor);
        n1.setProximo(primeiroNo);
        primeiroNo = no1;
    } 

    public void insereUltimo(int valor) {
        if (estaVazia()) {
            inserePrimeiro(valor);
        } else {
            No cursor = primeiroNo;
            while (cursor.getProximo() != null) {
                cursor = cursor.getProximo();
         }
         No no1 = new No(valor);
            cursor.setProximo(no1);
        }
    }


    public void imprimirLista() {
        /*No atual = primeiroNo;
        while (atual != null) {
            System.out.println(atual.getNumeroNo());
            atual.getProximo().setProximo(atual);
            break;
        }*/
        if (estaVazia){
            system.out.println("Lista está vazia");
        } else {
            No atual = primerio;
            while (atual != null) {
                System.out.println(atual.getNumeroNo());
                atual = atual.getProximo();
                break;
            }
        }
    }

    public No removePrimeiro() {
        if (estaVazia()) {
            System.out.println("ESTA VAZIA, NÃO TEM NADA PRA REMOVER.");
            return null;
        } else {
            No cursor = primeiroNo;
            primeiroNo = primeiroNo.getProximo();
            return cursor;
        }
    }
    public void removeDepois(No no){
        if (estaVazia()){
            System.out.println("ESTA VAZIA");
        }else{
            No anterior = null;
            No cursor = primeiroNo;
            while(cursor.getProximo() != null){
                anterior = cursor;
                cursor = cursor.getProximo();
                if (cursor.equals(no)){
                    System.out.println("Nó encontrado com sucesso "+cursor.getNumeroNo());
                    anterior.setProximo(cursor.getProximo());
                }
            }
        }
    }
    
}
