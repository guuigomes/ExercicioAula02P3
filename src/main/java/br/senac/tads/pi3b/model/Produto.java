/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3b.model;

import br.senac.tdas.pi3b.exaula02.principal.Principal;

/**
 *
 * @author Gabriel
 */
public class Produto {

    static int id;
    static double compra;
    static double venda;
    static String nome;
    static String desc;
    static String categoria;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Produto.id = id;
    }

    public static double getCompra() {
        return compra;
    }

    public static void setCompra(double compra) {
        Produto.compra = compra;
    }

    public static double getVenda() {
        return venda;
    }

    public static void setVenda(double venda) {
        Produto.venda = venda;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Produto.nome = nome;
    }

    public static String getDesc() {
        return desc;
    }

    public static void setDesc(String desc) {
        Produto.desc = desc;
    }

    public static String getCategoria() {
        return categoria;
    }

    public static void setCategoria(String categoria) {
        Produto.categoria = categoria;
    }

}
