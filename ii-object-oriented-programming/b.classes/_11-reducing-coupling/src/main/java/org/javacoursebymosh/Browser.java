package org.javacoursebymosh;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    // make the 2 methods below private because they're
    // implementation details
    // they must be invisible to the interface of this
    // class -> browser.
    private String sendHttpRequest(String ip) {
        return "Some HTML content";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}
