package com.pxq.cost.example;

public class JavaBean {

    public String message;

    private int code;

    private void setCode(int code){
        this.code = code;
    }

    public JavaBean(String message, int code) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String toString() {
        return "JavaBean{" +
                "message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
