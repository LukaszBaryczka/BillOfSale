package baryczka.billofsale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewBillController {

    @GetMapping("/newBill")
    public String hello(Model model) {
        return "newBill";
    }
}
