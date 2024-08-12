package com.microservices.server.model;

public class ResponseModel {

    private String tittle;
    private String platform;
    private String usedFor;
    private Short serverPort;

    public ResponseModel() {
        super();
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getUsedFor() {
        return usedFor;
    }

    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
    }

    public Short getServerPort() {
        return serverPort;
    }

    public void setServerPort(Short serverPort) {
        this.serverPort = serverPort;
    }
}
