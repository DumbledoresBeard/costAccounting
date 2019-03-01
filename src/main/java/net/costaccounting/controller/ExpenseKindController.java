package net.costaccounting.controller;


import net.costaccounting.dto.ExpenseKindDtoRequest;
import net.costaccounting.dto.ExpenseKindDtoResponse;
import net.costaccounting.service.CostAccountingService;
import net.costaccounting.utils.MyBatisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ExpenseKindController {

    @Bean
    ServletWebServerFactory servletWebServerFactory(){
        return new TomcatServletWebServerFactory();
    }

    @Autowired
    CostAccountingService costAccountingService;


    @RequestMapping(value = "/expensekind",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ExpenseKindDtoResponse addExpenseKind(
            @Valid @RequestBody ExpenseKindDtoRequest expenseKindDtoRequest,
            HttpServletResponse response) {

        Cookie cookie = new Cookie("JAVASESSIONID", "Value");
        response.addCookie(cookie);
      /* MyBatisUtils.initSqlSessionFactory();*/
        costAccountingService.addExpenseKind(expenseKindDtoRequest);

        return new ExpenseKindDtoResponse(expenseKindDtoRequest.getExpenseName(), expenseKindDtoRequest.isReqular());

    }


    @RequestMapping(value = "/expensekind",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ExpenseKindDtoResponse deleteExpenseKind(
            @Valid @RequestBody ExpenseKindDtoRequest expenseKindDtoRequest,
            HttpServletResponse response) {

        Cookie cookie = new Cookie("JAVASESSIONID", "Value");
        response.addCookie(cookie);

        return new ExpenseKindDtoResponse(expenseKindDtoRequest.getExpenseName(), expenseKindDtoRequest.isReqular());

    }

    @RequestMapping(value = "/expensekind",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<ExpenseKindDtoResponse> getListExpenseKind(
            @Valid @RequestBody ExpenseKindDtoRequest expenseKindDtoRequest,
            HttpServletResponse response) {

        Cookie cookie = new Cookie("JAVASESSIONID", "Value");
        response.addCookie(cookie);

        return new ArrayList<ExpenseKindDtoResponse>();

    }
}
