package com.oracle.crm.ondemand;

import java.io.IOException;
import java.net.*;
import java.util.*;

/**
 * Classe 'skeleton' de exemplo na documentação da oracle.
 * @author Oracle on-demand
 * @author Paulo Patto
 */
public class CRMOD {
    public String logon(String local, String usuario, String senha) throws MalformedURLException, IOException{
        String stringSessao = "Fail";
        URL url = new URL(local + "?command=login");

        /**
         * Se você estiver em uma rede protegido por um proxy, seu programa deve configuarar um proxy
         * de rede para a saída de intenet conforme o exemplo:
         * <code>
         *  HttpURLConnection connection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new java.net.InetSocketAdress("192.168.100.1", 8181)));
         * </code>
         *
         * @see http://java.sun.com/javase/6/docs/api/
         * <a href='http://java.sun.com/javase/6/docs/api/java/net/Proxy.html' target='_blank' >Proxy</a>
         * <a href='http://java.sun.com/javase/6/docs/api/java/net/InetSocketAddress.html' target='_blank' >InetSocktAdress<a>:
         *
         */
        HttpURLConnection connection = ( HttpURLConnection ) url.openConnection();
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        connection.setRequestProperty("UserName", usuario);
        connection.setRequestProperty("Password", senha);
        connection.setRequestMethod("GET");
        if(connection.getResponseCode() == HttpURLConnection.HTTP_OK){
            stringSessao = getCookieFromHeaders(connection);
        }
        return stringSessao;
    }
    
    public void logoff(String local, String cookie) throws MalformedURLException, IOException{
        URL url = new URL(local + "?command=logoff");
        HttpURLConnection connection = ( HttpURLConnection ) url.openConnection();
        connection.setUseCaches(false);
        connection.setRequestProperty("Cookie", cookie);
        connection.setRequestMethod("GET");
        if(connection.getResponseCode() == HttpURLConnection.HTTP_OK){
            // showResponseHttpHeaders(connection);
        }
    }

    private String getCookieFromHeaders(HttpURLConnection connection) {
        String key, value;
        for (int i = 0 ; ; i++){
            key = connection.getHeaderFieldKey(i);
            if(key != null && key.equals("Set-Cookie")){
                value = connection.getHeaderField(i); break;
            }
        }
        return value;
    }

    
}
