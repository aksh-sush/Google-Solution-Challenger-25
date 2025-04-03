package com.onesignal.core.internal.http.impl;

import db.l;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class d extends SSLSocketFactory {
    private SSLSocketFactory sslSocketFactory;

    public d(SSLSocketFactory sSLSocketFactory) {
        l.e(sSLSocketFactory, "sslSocketFactory");
        this.sslSocketFactory = sSLSocketFactory;
    }

    private final Socket enableTLS(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }

    public Socket createSocket() {
        Socket createSocket = this.sslSocketFactory.createSocket();
        l.d(createSocket, "sslSocketFactory.createSocket()");
        return enableTLS(createSocket);
    }

    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.sslSocketFactory.getDefaultCipherSuites();
        l.d(defaultCipherSuites, "sslSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.sslSocketFactory.getSupportedCipherSuites();
        l.d(supportedCipherSuites, "sslSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    public final void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        l.e(sSLSocketFactory, "<set-?>");
        this.sslSocketFactory = sSLSocketFactory;
    }

    public Socket createSocket(String str, int i10) {
        l.e(str, "host");
        Socket createSocket = this.sslSocketFactory.createSocket(str, i10);
        l.d(createSocket, "sslSocketFactory.createSocket(host, port)");
        return enableTLS(createSocket);
    }

    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        l.e(str, "host");
        l.e(inetAddress, "localHost");
        Socket createSocket = this.sslSocketFactory.createSocket(str, i10, inetAddress, i11);
        l.d(createSocket, "sslSocketFactory.createS…rt, localHost, localPort)");
        return enableTLS(createSocket);
    }

    public Socket createSocket(InetAddress inetAddress, int i10) {
        l.e(inetAddress, "host");
        Socket createSocket = this.sslSocketFactory.createSocket(inetAddress, i10);
        l.d(createSocket, "sslSocketFactory.createSocket(host, port)");
        return enableTLS(createSocket);
    }

    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        l.e(inetAddress, "address");
        l.e(inetAddress2, "localAddress");
        Socket createSocket = this.sslSocketFactory.createSocket(inetAddress, i10, inetAddress2, i11);
        l.d(createSocket, "sslSocketFactory.createS… localAddress, localPort)");
        return enableTLS(createSocket);
    }

    public Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        l.e(socket, "s");
        l.e(str, "host");
        Socket createSocket = this.sslSocketFactory.createSocket(socket, str, i10, z10);
        l.d(createSocket, "sslSocketFactory.createS…s, host, port, autoClose)");
        return enableTLS(createSocket);
    }
}
