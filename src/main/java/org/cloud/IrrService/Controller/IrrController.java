package org.cloud.IrrService.Controller;

import org.cloud.IrrService.model.ResponseData;
import org.cloud.IrrService.service.IrrServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IrrController {

    @Autowired
    private IrrServices irrServices;

    @GetMapping("/irr/{office}/{account}")
    public ResponseData fResponse(@PathVariable(name="office")String office,
                                           @PathVariable(name="account")String account) {
        return irrServices.finalResponse(office, account);

    }

}
