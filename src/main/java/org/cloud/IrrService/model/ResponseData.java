package org.cloud.IrrService.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResponseData {

    private String office;
    private String account;
    private String acctIrr;
    List<CusipIrr> cusipIrrList;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAcctIrr() {
        return acctIrr;
    }

    public void setAcctIrr(String acctIrr) {
        this.acctIrr = acctIrr;
    }

    public List<CusipIrr> getCusipIrrList() {
        return cusipIrrList;
    }

    public void setCusipIrrList(List<CusipIrr> cusipIrrList) {
        this.cusipIrrList = cusipIrrList;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "office='" + office + '\'' +
                ", account='" + account + '\'' +
                ", acctIrr='" + acctIrr + '\'' +
                ", cusipIrrList=" + cusipIrrList +
                '}';
    }
}
