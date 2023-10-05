package com.stormdev.organizze.helper;

import android.util.Base64;

import java.nio.charset.StandardCharsets;

public class Base64Custom {
    public static String codificarBase64(String texto){

        return Base64.encodeToString(texto.getBytes(),Base64.DEFAULT).replaceAll("(\\n|\\r)", "");

    }

    public static String decodificarBase64(String textoCodifivado){

        return new String(Base64.decode(textoCodifivado, Base64.DEFAULT));

    }
}
