package kz.bitlab.springboot.techboot.controller;

import kz.bitlab.springboot.techboot.db.DBManager;
import kz.bitlab.springboot.techboot.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String indexPage(Model model){
        ArrayList<Student> arr = DBManager.getStudents();
        model.addAttribute("studentter", arr);
        return "index";
    }
    @GetMapping   (value = {"/AddStudent"})
    public String addStudent(Student student, Model model){
        return "AddStudent";
    }

    @PostMapping(value = {"/AddStudent"})
    public String addStudent(Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }
    //

}
