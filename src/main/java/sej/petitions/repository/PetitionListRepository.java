package sej.petitions.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sej.petitions.model.Petition;

import java.util.List;

@Repository
public class PetitionListRepository {
    private static final String MAPPER_NAME_SPACE = "sample.mapper.petitionMapper.";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List getPetitionListAll() {
        return sqlSessionTemplate.selectList(MAPPER_NAME_SPACE + "selectPetitionListAll");
    }

    public void registerPetition(Petition petition) {
        sqlSessionTemplate.insert(MAPPER_NAME_SPACE + "insertPetition", petition);
    }
}
