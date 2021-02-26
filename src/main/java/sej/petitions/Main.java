package sej.petitions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sej.petitions.model.Petition;
import sej.petitions.repository.PetitionListRepository;

import java.util.Date;

@SpringBootApplication
public class Main{
    public static void main(String args[]) {
        SpringApplication.run(Main.class, args);

    }

/*
    @Autowired
    PetitionListRepository petitionListRepository;

    @Override
    public void run(String... args) throws  Exception{
        System.out.println("petitions run");
        Petition pet1 = new Petition();

        pet1.setPlatform("넷플릭스");
        pet1.setGenre("스릴러");
        pet1.setTitle("소사이어티 시즌2");
        pet1.setContent("이대로 끝내는 건 말이 안됨");
        pet1.setWriter("스미스");
        pet1.setRegDate(new Date());

        petitionListRepository.registerPetition(pet1);
    }

     */
}
