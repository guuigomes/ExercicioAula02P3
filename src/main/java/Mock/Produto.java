/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import br.senac.tdas.pi3b.exaula02.principal.Principal;

/**
 *
 * @author Gabriel
 */
public class Produto {

    public static void adicionarProduto(String nome, double venda, double compra, String desc) {
        Modelo.Produto produto = new Modelo.Produto();
        produto.setNome(nome);
        produto.setVenda(venda);
        produto.setCompra(compra);
        produto.setDesc(desc);
        produto.setId();
        Principal.listaDeProdutos.add(produto);
    }
}
