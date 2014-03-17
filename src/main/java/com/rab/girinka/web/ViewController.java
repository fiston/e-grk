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
@RequestMapping(value="/admin", method = RequestMethod.GET)
public class ViewController {

    @Autowired
    private SourceService sourceService;

    @RequestMapping(value="/index", method = RequestMethod.GET)
    protected String viewIndex(){
        return "hello";
    }

    @RequestMapping(value="/source/add", method = RequestMethod.POST)
    protected String addSource(@ModelAttribute("source")
                                   Source source, BindingResult result)
            throws Exception {
        sourceService.saveSource(source);
        return "source";
    }

    @RequestMapping(value="/source/list", method = RequestMethod.GET)
    protected String viewSource(Map<String, Object> map){
        map.put("source", new Source());
        map.put("sourceList", sourceService.listSources());
        System.out.print(sourceService.listSources().size());

        return "source";
    }
}
