package sej.petitions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sej.petitions.model.Petition;
import sej.petitions.repository.PetitionListRepository;

import javax.servlet.http.HttpSession;

//Todo 트위터 로그인 기능 만들기
//Todo 부트스트랩 적용


@Controller
public class RegisterPetitionController {
    @Autowired
    PetitionListRepository petitionListRepository;

    @RequestMapping("/petition/form")
    public String petitionForm(Model model, HttpSession session) {
        //로그인 여부 확인하는 로직 넣기
        Petition petition = new Petition();
        String writer = "test2";
        session.setAttribute("writer", writer);
        //petition.setWriter("sej");
        model.addAttribute("writer", writer);
        model.addAttribute("petition", petition);
        return "petition/form";
    }

    @PostMapping("/petition/submitted")
    public String petitionComplete(Model model, Petition petition, HttpSession session) {
        model.addAttribute("platform", petition.getPlatform());
        model.addAttribute("title", petition.getTitle());
        String writer = (String)session.getAttribute("writer");
        model.addAttribute("writer", writer);
        petition.setWriter(writer);
        petition.setCount(1);
        System.out.println("writer: " + petition.getWriter());
        petitionListRepository.registerPetition(petition);
        return "petition/complete";
    }
}
