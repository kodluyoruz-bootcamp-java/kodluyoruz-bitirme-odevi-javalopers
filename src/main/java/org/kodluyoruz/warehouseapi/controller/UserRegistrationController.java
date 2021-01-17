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

    /*private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserRepository userCRUDRepository;

    @PostMapping("/register")
    public String addUser(@RequestBody UserEntity userEntity){
        String password = userEntity.getPassword();
        String encryptedPassword = bCryptPasswordEncoder.encode(password);
        userEntity.setPassword(encryptedPassword);
        userCRUDRepository.save(userEntity);
        return "User added succesfully";
    }

    @PostMapping("/login")
    public WarehouseAPIResponseHolder<?> login(@RequestBody UserEntity userEntity){
        return null;
    }*/
}
