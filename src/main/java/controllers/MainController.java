package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.EmployeeService;


/**
 * Created by rustem on 1/18/18.
 */

@Controller
public class MainController {

    @Autowired
    EmployeeService employeeService;


    public void onCreate() {
        System.out.println("AMA WORKING");
    }

    @RequestMapping("/")
    public Model sayHelloBitch(Model model) {
        model.addAttribute("greeting", "Hello Bitch");
        System.out.println("REQUEST IS HANDLED");
        employeeService.createNewEmployee();
        return model;
    }
}
