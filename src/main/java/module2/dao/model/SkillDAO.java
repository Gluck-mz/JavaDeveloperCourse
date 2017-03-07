package module2.dao.model;

import module2.model.Skill;

import java.util.Collection;

public interface SkillDAO extends GenericDAO<Skill, Long, String> {
    void save(Skill entity);

    void update(Skill entity, String newParam);

    void delete(Skill entity);

    Collection<Skill> getAll();

    Skill getById(Long aLong);
}
