package ict.kosovo.growth.kqzpartitepolitike.controllers;

import ict.kosovo.growth.kqzpartitepolitike.models.dtos.LoginModel;
import ict.kosovo.growth.kqzpartitepolitike.services.CookieUtilityService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/auth")
public class AuthenticationController {
    private final CookieUtilityService utilityService;

    public AuthenticationController(CookieUtilityService utilityService) {
        this.utilityService = utilityService;
    }

    //login  -  get
    //login - post

    //register - get
    //register - post

    @GetMapping(value = "/login")
    public String getLoginPage(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {

        if (utilityService.getLoggedIn(request.getCookies())) {
            response.sendRedirect("/partiapolitike");
            return null;
        }


        model.addAttribute("loginModel", new LoginModel());
        model.addAttribute("LoginAction", "/auth/login"); //POST /auth/login
        return "login";
    }

    @PostMapping(value = "/login")
    public String postLogin(@ModelAttribute LoginModel loginModel, Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
        if (!loginModel.getUsername().equals(loginModel.getPassword())) {
            model.addAttribute("error", "Username and password are not the same! ");
            return getLoginPage(model, req, res);
        }
        Cookie cookie = new Cookie("logged_in", "true");
        cookie.setPath("/");
        res.addCookie(cookie);

        res.sendRedirect("/");
        return null;
    }
    @GetMapping(value = "/logout")
    public void logout(HttpServletResponse response) throws IOException {
        Cookie loggedInCookie = new Cookie("logged_in","false");
        loggedInCookie.setMaxAge(0);
        loggedInCookie.setPath("/");
        response.addCookie(loggedInCookie);
        response.sendRedirect("/auth/login");

    }

}