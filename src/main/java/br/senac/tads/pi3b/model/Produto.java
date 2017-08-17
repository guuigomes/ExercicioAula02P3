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

    public static void setCategoria(String x) {
        categoria = x;
    }

    public static String getCategoria() {
        return categoria;
    }

    public static void setId() {
        id = Principal.totalProdutos++;
    }

    public static int getId() {
        return id;
    }

    public static void setCompra(double x) {
        compra = x;
    }

    public static double getCompra() {
        return compra;
    }

    public static void setVenda(double x) {
        venda = x;
    }

    public static double getVenda() {
        return venda;
    }

    public static void setDesc(String x) {
        desc = x;
    }

    public static String getDesc() {
        return desc;
    }

    public static void setNome(String x) {
        nome = x;
    }

    public static String getNome() {
        return nome;
    }

}
