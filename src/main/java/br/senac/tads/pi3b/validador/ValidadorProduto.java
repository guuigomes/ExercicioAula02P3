/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3b.validador;

/**
 *
 * @author Gabriel
 */
public class ValidadorProduto {

    public static String validar(String nome, double venda, double compra, String desc, String categoria) {
        String erro = "";
        if (nome.equals("") || nome.equals(" ")) {
            erro += "Produto sem nome\n";
        }
        if (venda <= 0) {
            erro += "Preço de venda incorreto\n";
        }
        if (compra <= 0) {
            erro += "Preço de compra incorreto\n";
        }
        if (categoria.equals("Selecione")) {
            erro += "Categoria não selecionada\n";
        }
        return erro;
    }

}
