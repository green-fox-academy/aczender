package com.greenfoxacademy.day01;

public class Doubling {
    public Integer received;
    public Integer result;

    public Doubling(Integer received) {
        this.received = received;
        this.result = received * 2;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

}
