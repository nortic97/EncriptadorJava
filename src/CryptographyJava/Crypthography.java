/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CryptographyJava;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * Esta clase usa la funcion MessageDigest para encriptar texto de forma mas
 * facil.
 *
 * @author Default
 * @version 1.0
 *
 */

public class Crypthography {

    /**
     * Encripta una cadena de texto de la forma SHA-256 y retorna el valor
     * codificado.
     *
     * @param input Cadena de texto a codificar.
     * @return Cadena de texto encriptada.
     */
    
    public static String getSHA256(String input) {

        String toReturn = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.reset();
            digest.update(input.getBytes("utf8"));
            toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return toReturn;
    }

    /**
     * Encripta una cadena de texto de la forma SHA-512 y retorna el valor
     * codificado.
     *
     * @param input Cadena de texto a codificar.
     * @return Cadena de texto encriptada.
     */
    
    public static String getSHA512(String input) {

        String toReturn = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            digest.reset();
            digest.update(input.getBytes("utf8"));
            toReturn = String.format("%0128x", new BigInteger(1, digest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return toReturn;
    }

    /**
     * Encripta una cadena de texto de la forma MD5 y retorna el valor
     * codificado.
     *
     * @param input Cadena de texto a codificar.
     * @return Cadena de texto encriptada.
     */
    
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
