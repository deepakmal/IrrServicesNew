package org.cloud.IrrService.service;

import org.cloud.IrrService.Dao.IrrRepo;
import org.cloud.IrrService.model.AccountIrr;
import org.cloud.IrrService.model.CusipIrr;
import org.cloud.IrrService.model.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IrrServices {

    @Autowired
    private IrrRepo irrrepo;
    @Autowired
    private ResponseData responseData;
    private static final String cusipConst = "acctonly1";

    public List<AccountIrr> getaccountIrr(String office, String account) {
        List<AccountIrr> accountIrrs = irrrepo.findAccountIrrByOfficeAndAccount(office, account);
        return accountIrrs;
    }

    public ResponseData finalResponse(String office, String account) {
        List<AccountIrr> acctirrs = getaccountIrr(office, account);
        List<CusipIrr> cusipIrrList = new ArrayList<CusipIrr>();
        for (AccountIrr list : acctirrs) {
            responseData.setAccount(list.getAccount());
            responseData.setOffice(list.getOffice());
            if (list.getCusip().equals(cusipConst)) {
                responseData.setAcctIrr(list.getIrr());
            } else {
                cusipIrrList.add(new CusipIrr(list.getCusip(),list.getIrr()));
                   }
            }
        responseData.setCusipIrrList(cusipIrrList);
        return responseData;
    }

}
