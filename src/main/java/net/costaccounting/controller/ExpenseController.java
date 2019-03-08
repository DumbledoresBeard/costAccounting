package net.costaccounting.controller;


import net.costaccounting.dto.ExpenseDtoRequest;
import net.costaccounting.dto.ExpenseDtoResponse;
import net.costaccounting.dto.ExpenseKindDtoRequest;
import net.costaccounting.dto.ExpenseKindDtoResponse;
import net.costaccounting.model.Expense;
import net.costaccounting.service.CostAccountingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
public class ExpenseController {

    @Bean
    ServletWebServerFactory servletWebServerFactory(){
        return new TomcatServletWebServerFactory();
    }

    @Autowired
    CostAccountingService costAccountingService;


    @RequestMapping(value = "/expense",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ExpenseDtoResponse addExpense(
            @Valid @RequestBody ExpenseDtoRequest expenseDtoRequest,
            HttpServletResponse response) {

        Cookie cookie = new Cookie("JAVASESSIONID", "Value");
        response.addCookie(cookie);

        Expense expense = costAccountingService.addExpense(expenseDtoRequest);

        return new ExpenseDtoResponse(expense.getExpense(), expense.getExpenseKind().getExpenseName(),
                expense.getLocalDate());

    }
}
