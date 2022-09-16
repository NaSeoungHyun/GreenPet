package hello.hellospring.domain.searchMyGreenPet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NamingController {
    private Logger logger = LoggerFactory.getLogger(NamingController.class);
    private String name ;

    // 단순 naming페이지 호출용
   @RequestMapping("/naming")
   public String naming(){
       return "naming";
   }

    // naming 페이지에서 name 값 받음
    @RequestMapping("/qstndlevel1")
    public String moveQstndlevel1(@RequestParam("name") String name, Model model){

        model.addAttribute("name",name);
        logger.info("[LOG] qstndlevel1 : name -> " + name);
        return "qstndlevel1";
    }


}
