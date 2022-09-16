package hello.hellospring.domain.searchMyGreenPet.controller;

import hello.hellospring.domain.searchMyGreenPet.dto.GreenPickRequeestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class QstndLevelController {
    private Logger logger = LoggerFactory.getLogger(NamingController.class);
    private String name ;

    // naming 페이지에서 name 값 받음
    @PostMapping("qstndlevel2")
    public String moveQstndlevel2(Model model ,HttpServletRequest request){

        String name = request.getParameter("name");
        String qstndlevel1 = request.getParameter("qstndlevel1");

        model.addAttribute("name", name);
        model.addAttribute("qstndlevel1", qstndlevel1);

        logger.info("[LOG] qlevelstnd2 : qstndlevel1 -> " + qstndlevel1);

        return "qstndlevel2";
    }


    @PostMapping("qstndlevel3")
    public String moveQstndlevel3(Model model ,HttpServletRequest request){

        String name = request.getParameter("name");
        String qstndlevel1 = request.getParameter("qstndlevel1");
        String qstndlevel2 = request.getParameter("qstndlevel2");

        model.addAttribute("name", name);
        model.addAttribute("qstndlevel1", qstndlevel1);
        model.addAttribute("qstndlevel2", qstndlevel2);

        logger.info("[LOG] qlevelstnd3 : qstndlevel2 -> " + qstndlevel2);
        return "qstndlevel3";
    }


    @PostMapping("qstndlevel4")
    public String moveQstndlevel4(Model model ,HttpServletRequest request){

        String name = request.getParameter("name");
        String qstndlevel1 = request.getParameter("qstndlevel1");
        String qstndlevel2 = request.getParameter("qstndlevel2");
        String qstndlevel3 = request.getParameter("qstndlevel3");

        model.addAttribute("name", name);
        model.addAttribute("qstndlevel1", qstndlevel1);
        model.addAttribute("qstndlevel2", qstndlevel2);
        model.addAttribute("qstndlevel3", qstndlevel3);

        logger.info("[LOG] qlevelstnd4 : qstndlevel3 -> " + qstndlevel3);

        return "qstndlevel4";
    }


    @PostMapping("qbridge")
    public String moveQbridge(Model model ,HttpServletRequest request){

        String name = request.getParameter("name");
        String qstndlevel1 = request.getParameter("qstndlevel1");
        String qstndlevel2 = request.getParameter("qstndlevel2");
        String qstndlevel3 = request.getParameter("qstndlevel3");
        String qstndlevel4 = request.getParameter("qstndlevel4");

        model.addAttribute("name", name);
        model.addAttribute("qstndlevel1", qstndlevel1);
        model.addAttribute("qstndlevel2", qstndlevel2);
        model.addAttribute("qstndlevel3", qstndlevel3);
        model.addAttribute("qstndlevel4", qstndlevel4);

        logger.info("[LOG] qbridge : qstndlevel4 -> " + qstndlevel4);

        return "qbridge";
    }


    @PostMapping("qoptlevel")
    public String moveQOptlevel(Model model ,HttpServletRequest request){

        String name = request.getParameter("name");
        String qstndlevel1 = request.getParameter("qstndlevel1");
        String qstndlevel2 = request.getParameter("qstndlevel2");
        String qstndlevel3 = request.getParameter("qstndlevel3");
        String qstndlevel4 = request.getParameter("qstndlevel4");

        model.addAttribute("name", name);
        model.addAttribute("qstndlevel1", qstndlevel1);
        model.addAttribute("qstndlevel2", qstndlevel2);
        model.addAttribute("qstndlevel3", qstndlevel3);
        model.addAttribute("qstndlevel4", qstndlevel4);

        logger.info("[LOG] STAND LEVEL CHECK: model -> " + model.toString());

        return "qoptlevel";
    }



    @PostMapping("result")
    public String pickGreenPet(Model model ,HttpServletRequest request){

        String name = request.getParameter("name");
        String qstndlevel1 = request.getParameter("qstndlevel1");
        String qstndlevel2 = request.getParameter("qstndlevel2");
        String qstndlevel3 = request.getParameter("qstndlevel3");
        String qstndlevel4 = request.getParameter("qstndlevel4");

        model.addAttribute("name", name);
        model.addAttribute("qstndlevel1", qstndlevel1);
        model.addAttribute("qstndlevel2", qstndlevel2);
        model.addAttribute("qstndlevel3", qstndlevel3);
        model.addAttribute("qstndlevel4", qstndlevel4);

        logger.info("[LOG] OPTIONA LEVEL CHECK : model -> " + request.toString());

        return "qoptlevel";
    }

}
