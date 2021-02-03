<<<<<<< HEAD
package org.kodluyoruz.warehouseapi.controller;

import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.kodluyoruz.warehouseapi.model.dto.UserDTO;
import org.kodluyoruz.warehouseapi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@SwaggerClient
@RequestMapping("/registration")
public class UserRegistrationController {

    private final UserService userService;

    @ModelAttribute("user")
    public UserDTO userDTO() {
        return new UserDTO();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserDTO userDTO) {
        userService.save(userDTO);
        return "redirect:/registration?success";
    }

}
=======
package org.kodluyoruz.warehouseapi.controller;

import lombok.RequiredArgsConstructor;
import org.kodluyoruz.warehouseapi.config.SwaggerClient;
import org.kodluyoruz.warehouseapi.model.dto.UserDTO;
import org.kodluyoruz.warehouseapi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@SwaggerClient
@RequestMapping("/registration")
public class UserRegistrationController {

    private final UserService userService;

    @ModelAttribute("user")
    public UserDTO userDTO() {
        return new UserDTO();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserDTO userDTO) {
        userService.save(userDTO);
        return "redirect:/registration?success";
    }

}
>>>>>>> 5893d28733a254c8c0b7a4540aaa7efad79499b2
