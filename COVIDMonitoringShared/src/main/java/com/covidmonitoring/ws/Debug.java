package com.covidmonitoring.ws;

public class Debug {
    private static boolean enableFlag = true;

    static {
        enableAll(enableFlag);
    }

    public static void enableAll(boolean flag){
        enableFlag = flag;
        enableJaxWSDebug(flag);
    }

    public static void enableJaxWSDebug(boolean flag){
        //This code causes SOAP Request and Response to dump in Text to standard out
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", Boolean.toString(flag));
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", Boolean.toString(flag));
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", Boolean.toString(flag));
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", Boolean.toString(flag));
    }
}
