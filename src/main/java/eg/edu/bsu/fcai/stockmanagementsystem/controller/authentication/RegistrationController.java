package eg.edu.bsu.fcai.stockmanagementsystem.controller.authentication;

import eg.edu.bsu.fcai.stockmanagementsystem.assets.UserForm;
import eg.edu.bsu.fcai.stockmanagementsystem.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;

    @GetMapping(value = "/register")
    public String getRegisterPage(Model model, UserForm form) {
        model.addAttribute("form", form);
        return "register";
    }

    @PostMapping(value = "/register")
    public String register(@ModelAttribute UserForm form, Model model) {
        try {
            registrationService.register(form);
            return "redirect:/login";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return getRegisterPage(model, form);
        }
    }
}
