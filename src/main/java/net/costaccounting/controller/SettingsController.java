package net.costaccounting.controller;

import net.costaccounting.dto.SavingsFundsDtoRequest;
import net.costaccounting.dto.SavingsFundsDtoResponse;
import net.costaccounting.dto.SettingsDtoRequest;
import net.costaccounting.dto.SettingsDtoResponse;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
public class SettingsController {


    @RequestMapping(value = "/settings",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SettingsDtoResponse addSavingsFunds(
            @Valid @RequestBody SettingsDtoRequest settingsDtoRequest,
            HttpServletResponse response) {

        Cookie cookie = new Cookie("JAVASESSIONID", "Value");
        response.addCookie(cookie);

        return new SettingsDtoResponse(settingsDtoRequest.getStartDate(), settingsDtoRequest.getAutoCounting());
    }
}
