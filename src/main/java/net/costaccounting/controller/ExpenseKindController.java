package net.costaccounting.controller;


import net.costaccounting.dto.ExpenseKindDtoRequest;
import net.costaccounting.dto.ExpenseKindDtoResponse;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
public class ExpenseKindController {

    @Bean
    ServletWebServerFactory servletWebServerFactory(){
        return new TomcatServletWebServerFactory();
    }


    @RequestMapping(value = "/expensekind",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ExpenseKindDtoResponse registerTeacher(
            @Valid @RequestBody ExpenseKindDtoRequest expenseKindDtoRequest,
            HttpServletResponse response) {

        Cookie cookie = new Cookie("JAVASESSIONID", "Value");
        response.addCookie(cookie);

        return new ExpenseKindDtoResponse(expenseKindDtoRequest.getExpenseName());
    }
}
