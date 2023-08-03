package com.jiezhou.springboottry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@ResponseBody
public class Servlettry   {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Servlettry.class);

    @RequestMapping(value="/com/jiezhou/first",method = RequestMethod.GET )
    public String servletTest(HttpServletRequest httpRequest, HttpServletResponse httpResponse){


         logger.info(httpRequest.getRequestURL().toString());


        return " have a servlet try";
    }
}
