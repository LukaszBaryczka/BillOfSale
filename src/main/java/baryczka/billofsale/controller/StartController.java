package baryczka.billofsale.controller;

import baryczka.billofsale.config.security.IAuthenticationFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {

    @Autowired
    private IAuthenticationFacade authenticationFacade;

    @GetMapping("/start")
    public String hello(Model model) {
        String currentPrincipalName = authenticationFacade.getAuthentication().getName();

        model.addAttribute("name", currentPrincipalName);

        return "start";
    }
}
