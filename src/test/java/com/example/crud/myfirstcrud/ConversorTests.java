package com.example.crud.myfirstcrud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class ConversorTests {

    @Test
    public void testsConversor(){

        //CONVERTENDO DATA E HORA
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String dataAtual = dateFormat.format(date);
        System.out.println("A data e hora atual do sistema e: " + dataAtual);

        //CONVERTENDO DOLAR EM REAL
        BigDecimal real = new BigDecimal("160");
        BigDecimal dolar = new BigDecimal("4.93");
        BigDecimal result = real.multiply(dolar);
        System.out.println("R$160 ,00 convertido em dolar: " + result);
    }

}
