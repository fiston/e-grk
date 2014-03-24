package com.rab.girinka.web;

import com.rab.girinka.models.Source;
import com.rab.girinka.service.SourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping(value="/", method = RequestMethod.GET)
public class ViewWelcomeController {

    @Autowired
    private SourceService sourceService;

    @RequestMapping(value="index.do", method = RequestMethod.GET)
    protected String viewWelcome(){
        return "welcome";
    }
    @RequestMapping(value="/", method = RequestMethod.GET)
     protected String viewIndex(){
        return "welcome";
    }
}
