package org.cloud.IrrService.model;

import org.springframework.stereotype.Component;

@Component
public class AccountIrrOnly {
    private String office;
    private String account;
    private String accountIrr;

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

    public String getAccountIrr() {
        return accountIrr;
    }

    public void setAccountIrr(String accountIrr) {
        this.accountIrr = accountIrr;
    }

    @Override
    public String toString() {
        return "AccountIrrOnly{" +
                "office='" + office + '\'' +
                ", account='" + account + '\'' +
                ", accountIrr='" + accountIrr + '\'' +
                '}';
    }
}
