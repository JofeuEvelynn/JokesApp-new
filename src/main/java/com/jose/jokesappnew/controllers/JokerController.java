package com.jose.jokesappnew.controllers;

import com.jose.jokesappnew.services.JokerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Josephvp
 * @version 1.0
 * @date 16-05-2021 08:13 AM
 */
@Controller
public class JokerController {
    private final JokerService jokerService;


    public JokerController(JokerService jokerService) {
        this.jokerService = jokerService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokerService.getJoke());
        return "index";
    }
}
