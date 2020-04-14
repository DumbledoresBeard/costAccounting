package net.costaccounting.controller;


import net.costaccounting.dto.ExpenseDtoRequest;
import net.costaccounting.dto.ExpenseDtoResponse;
import net.costaccounting.dto.SavingsFundsDtoRequest;
import net.costaccounting.dto.SavingsFundsDtoResponse;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
public class SavingsFundsController {

    @RequestMapping(value = "/savingsfunds",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SavingsFundsDtoResponse addSavingsFunds(
            @Valid @RequestBody SavingsFundsDtoRequest savingsFundsDtoRequest,
            HttpServletResponse response) {

        Cookie cookie = new Cookie("JAVASESSIONID", "Value");
        response.addCookie(cookie);

        return new SavingsFundsDtoResponse(savingsFundsDtoRequest.getMoney(), savingsFundsDtoRequest.getDate());
    }
}
