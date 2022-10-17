package com.sim.app.mvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class JspController {

    @GetMapping("/temp/jsp")
    public String tempJsp(Model model){
        log.info("jsp 컨트롤러 call");
        model.addAttribute("msg","abcfile");
        return "test";
    }

}
