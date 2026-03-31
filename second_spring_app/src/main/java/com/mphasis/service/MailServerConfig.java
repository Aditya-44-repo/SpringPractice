package com.mphasis.service;


//@Component("mailServerConfig")  //bean id. Here Component is used because it is not dependent on other Clasees but other classes is dependent on this one
public class MailServerConfig {

    private String ip="192.23.25";
    private String login="tom";
    private String token="XRT!@234";

    public MailServerConfig() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
