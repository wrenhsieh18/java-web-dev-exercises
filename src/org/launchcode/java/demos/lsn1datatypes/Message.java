package org.launchcode.java.demos.lsn1datatypes;

public class Message {
    public static String getMessage(String lang) {
        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("cn")) {
            return "您好，世界！";
        } else {
            return "Hello, World!";
        }
    }
}

