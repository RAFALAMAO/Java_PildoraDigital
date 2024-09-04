/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafalamao
 */
public class EstructurasPrincipales {
  public static void main(String args[]) {
    //  _______                    __         __     __
    // /_  __(_)__  ___  ___   ___/ /__   ___/ /__ _/ /____  ___
    //  / / / / _ \/ _ \(_-<  / _  / -_) / _  / _ `/ __/ _ \(_-<
    // /_/ /_/ .__/\___/___/  \_,_/\__/  \_,_/\_,_/\__/\___/___/
    //      /_/
    // -- Enteros
    // Int -> 4 bytes desde -2,147,483,648 hasta 2,147,483,647
    int intTest1 = 2000000000;
    System.out.println(intTest1);
    // Short -> 2 bytes desde -32,768 hasta 32,767
    short shortTest1 = 32000;
    System.out.println(shortTest1);
    // Long -> 8 bytes desde -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807
    long longTest1 = 2000000000000000000L;
    System.out.println(longTest1);
    // Byte -> 1 byte desde -128 hasta 127
    byte byteTest1 = 127;
    System.out.println(byteTest1);

    // -- Flotantes
    // Float -> 4 bytes desde -3.4028235E38 hasta 3.4028235E38
    float floatTest1 = 3.1415F;
    System.out.println(floatTest1);
    // Double -> 8 bytes desde -1.7976931348623157E308 hasta 1.7976931348623157E308
    double doubleTest1 = 3.1415878987799787897878797D;
    System.out.println(doubleTest1);

    // -- Char
    // Char -> 2 bytes
    char charTest1 = 'a';
    System.out.println(charTest1);

    // -- Boolean
    // Boolean -> 1 byte
    boolean booleanTest1 = true;
    System.out.println(booleanTest1);

    //  _   __         _      __   __
    // | | / /__ _____(_)__ _/ /  / /__ ___
    // | |/ / _ `/ __/ / _ `/ _ \/ / -_|_-<
    // |___/\_,_/_/ /_/\_,_/_.__/_/\__/___/
    // Siempre deben ser inicializadas
    int salario;
    salario = 1000;
    int salarioConValor = 3;
    long numero = 1L; // ! Está mal porque ocupa mas memoria
    System.out.println(salario);
    System.out.println(salarioConValor);
    System.out.println(numero);

    // Comodines
    // int, double, char y boolean
  }
}
