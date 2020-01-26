package org.cloud.IrrService.model;

import org.springframework.stereotype.Component;

public class CusipIrr {

    private String cusip;
    private String cusipirr;

    public CusipIrr(String cusip, String irr) {
        this.cusip = cusip;
        this.cusipirr = irr;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getCusipirr() {
        return cusipirr;
    }

    public void setCusipirr(String cusipirr) {
        this.cusipirr = cusipirr;
    }

    @Override
    public String toString() {
        return "CusipIrr{" +
                "cusip='" + cusip + '\'' +
                ", cusipirr='" + cusipirr + '\'' +
                '}';
    }
}
