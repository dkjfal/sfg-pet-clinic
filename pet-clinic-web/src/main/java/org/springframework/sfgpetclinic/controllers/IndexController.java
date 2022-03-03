package org.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Polik on 2/12/2022
 */
@Controller
public class IndexController {

    @RequestMapping({"/", ""})
    public String index() {

        return "index";
    }

    @RequestMapping({"/oups"})
    public String ooops() {
        return "notimplemented";
    }
}
