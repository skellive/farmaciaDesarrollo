/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.dao.PruebasDecimales;

import com.farmacia.dao.CRUD;
import java.math.BigDecimal;
import java.math.BigInteger;

/*BigDecimal a = new BigDecimal("5");
BigDecimal b = new BigDecimal("7");

//Equivalent to result = a + b
BigDecimal result = a.add(b);
System.out.println(result);
 */
public class MAIN {

    CRUD c = new CRUD();

    public static void main(String[] args) {
//        BigDecimal b1 = new BigDecimal("1400000000000000000000000000000000000000000000000000000000");
//        BigDecimal b2 = new BigDecimal("400000000000000000000000000000000000000000000000000000000");
//        BigDecimal r = new BigDecimal("0.0");
//        BigDecimal xd = new BigDecimal("5.0");
//        BigDecimal yd = new BigDecimal("1.68");
//        
//        r = b1.add(b2);
//        System.out.println("Dato b1 " + b1);
//        System.out.println("Dato b2 " + b2);
//        System.out.println("");
//
//        System.out.println("Suma " + r);
//        System.out.println("");
//
//        r = b1.subtract(b2);
//        System.out.println("Resta " + r);
//        System.out.println("");
//
//        r = b1.multiply(b2);
//        System.out.println("Multi " + r);
//        System.out.println("");
//
//        r = b1.divide(b2);
//        System.out.println("Divi " + r);
//        System.out.println("");
//        
//        r=xd.multiply(yd);
//        System.out.println("toral "+r);
//        Double x= 5.23;
//        BigDecimal e=new BigDecimal(x);
//        System.out.println("ed "+e);
//        
        
        int in = 35;
        BigDecimal cant = new BigDecimal(in);
        BigDecimal precio = new BigDecimal("0.64");
        BigDecimal iva = new BigDecimal("2.68");
        BigDecimal descento = new BigDecimal("2.24");
        BigDecimal bono = new BigDecimal("0");
        BigDecimal total = new BigDecimal("0.0");
        BigDecimal totalx = new BigDecimal("0.0");
        BigDecimal ivax = new BigDecimal("0.12");
        BigDecimal descx = new BigDecimal("0.10");
       
        
        
        total=precio.multiply(cant);
        System.out.println("precio subtotal"+total);
//        total = total.setScale(2, BigDecimal.ROUND_HALF_UP);
//        System.out.println("precio redondeado "+total);
        ivax = total.multiply(ivax);
        System.out.println("el iva es "+ivax);
        
        descx= total.multiply(descx);
        System.out.println("resta "+descx);
        
        total = total.add(ivax).subtract(descx);
        System.out.println("total sin redondeo "+total);
        total= total.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println("total redondeado "+total);
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int in1 = 30;
        BigDecimal cant1 = new BigDecimal(in);
        BigDecimal precio1 = new BigDecimal("0.75");
        BigDecimal iva1 = new BigDecimal("2.68");
        BigDecimal descento1 = new BigDecimal("2.24");
        BigDecimal bono1 = new BigDecimal("0");
        BigDecimal total1 = new BigDecimal("0.0");
        BigDecimal totalx1 = new BigDecimal("0.0");
        BigDecimal ivax1 = new BigDecimal("0.12");
        BigDecimal descx1 = new BigDecimal("0.10");
       
        
        
        total1=precio1.multiply(cant1);
        System.out.println("precio subtotal"+total1);
//        total = total.setScale(2, BigDecimal.ROUND_HALF_UP);
//        System.out.println("precio redondeado "+total);
        ivax1 = total1.multiply(ivax1);
        System.out.println("el iva es "+ivax1);
        
        descx1= total1.multiply(descx1);
        System.out.println("resta "+descx1);
        
        total1 = total1.add(ivax1).subtract(descx1);
        System.out.println("total sin redondeo "+total1);
        total1= total1.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println("total redondeado "+total1);
//        totalx= cant.multiply(precio).add(total);
//        System.out.println("total total "+totalx);
//        totalx= totalx.setScale(2,BigDecimal.ROUND_HALF_UP);
//        System.out.println("total redondeado "+totalx);
        
        
//        Prueba p = new Prueba();
//        p.setCantidad(Integer.SIZE);
//        p.setPrecio(e);
//        p.setIva(e);
//        p.setDecuento(e);
//        p.setTotal(e);
    }
    
    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
        resultado = Math.round(resultado);
        resultado = (resultado / Math.pow(10, numeroDecimales)) + parteEntera;
        return resultado;
    }
//    int itemCost;
//    int totalCost = 0;
//
//    public BigDecimal calcular(int itemQuantity, BigDecimal itemPrice) {
//        itemCost = itemPrice.multiply(itemQuantity);
//        totalCost = totalCost + itemCost;
//        return totalCost;
}
