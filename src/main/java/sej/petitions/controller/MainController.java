package sej.petitions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sej.petitions.model.Petition;
import sej.petitions.repository.PetitionListRepository;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

// jsp 는 언제 만들어야 되지??
// html과 차이점은 ??

@Controller
public class MainController {
    @Autowired
    PetitionListRepository petitionListRepository;

    @RequestMapping("/")
    public String petitionsList(Model model){
        model.addAttribute("pet_list", petitionListRepository.getPetitionListAll());
        return "petition/list";
    }


}
