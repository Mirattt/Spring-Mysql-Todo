package ict.kosovo.growth.kqzpartitepolitike.controllers;

import ict.kosovo.growth.kqzpartitepolitike.models.entities.PartiaPolitike;
import ict.kosovo.growth.kqzpartitepolitike.services.CookieUtilityService;
import ict.kosovo.growth.kqzpartitepolitike.services.PartiaPolitikeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/partiapolitike")
public class PartiaPolitikeController {
    private final PartiaPolitikeService service;
    private final CookieUtilityService utilityService;

    public PartiaPolitikeController(PartiaPolitikeService service, CookieUtilityService utilityService) {
        this.service = service;
        this.utilityService = utilityService;
    }

    @GetMapping(value = "")
    public String getPartitePolitikePage(Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
        if (!utilityService.getLoggedIn(req.getCookies())) {
            res.sendRedirect("/auth/login");
            return null;
        }

        List<PartiaPolitike> partitePolitike = service.getAll();
        model.addAttribute("partite",partitePolitike);
        return "partiapolitike";
    }
}

