package com.ldj.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ldj
 * @since 2022-06-28
 */
public class T1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private String a;

    private String b;

    private String c;

    private String d;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "T1{" +
            "a=" + a +
            ", b=" + b +
            ", c=" + c +
            ", d=" + d +
        "}";
    }
}
