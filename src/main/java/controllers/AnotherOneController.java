package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by rustem on 01.02.18.
 */

@Controller
public class AnotherOneController {

    @RequestMapping(value = "bitch")
    public String addSomeShit(HttpSession session) {
        System.out.println("shit added");
        session.setAttribute("param", "value");
        return "shit added";
    }
}
