package net.costaccounting.controller;

import net.costaccounting.dto.BudgetDtoRequest;
import net.costaccounting.dto.BudgetDtoResponse;
import net.costaccounting.dto.ExpenseDtoRequest;
import net.costaccounting.dto.ExpenseDtoResponse;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
public class BudgetController {
    @RequestMapping(value = "/budget",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public BudgetDtoResponse addBudget(
            @Valid @RequestBody BudgetDtoRequest budgetDtoRequest,
            HttpServletResponse response) {

        Cookie cookie = new Cookie("JAVASESSIONID", "Value");
        response.addCookie(cookie);

        return new BudgetDtoResponse(budgetDtoRequest.getBudget(), budgetDtoRequest.getStartDate(), budgetDtoRequest.getEndDate());
    }
}
