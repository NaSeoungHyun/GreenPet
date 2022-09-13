package hello.hellospring.domain.searchMyGreenPet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QstndLevelController {
    private Logger logger = LoggerFactory.getLogger(NamingController.class);
    private String name ;
    // naming 페이지에서 name 값 받음
    @PostMapping("qstndlevel1")
    public String namingAction(@RequestParam("name") String name, Model model){

        model.addAttribute("name",name);
        logger.info("[LOG] name -> " + name);
        return "qstndlevel1";
    }
}
