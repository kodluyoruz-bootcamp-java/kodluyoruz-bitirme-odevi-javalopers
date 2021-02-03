<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

}
=======
package org.kodluyoruz.warehouseapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
