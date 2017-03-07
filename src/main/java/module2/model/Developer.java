package module2.model;

import java.util.Set;

public class Developer extends BaseEntity {
    private String firstName;
    private String surname;
    private Set<Skill> skills;
    private int salary;

    public Developer(Long id, String firstName, String surname, Set<Skill> skills, int salary) {
        super(id);
        this.firstName = firstName;
        this.surname = surname;
        this.skills = skills;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", skills=" + skills +
                ", salary=" + salary +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
