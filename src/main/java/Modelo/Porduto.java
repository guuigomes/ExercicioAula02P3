/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Gabriel
 */
public class Porduto {

    static int id;
    static double compra;
    static double venda;
    static String nome;
    static String desc;

    public static void setId(int x) {
        id = x;
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

}
