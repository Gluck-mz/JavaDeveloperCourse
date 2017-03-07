package module2.model;

public class NamedEntity extends BaseEntity{
    private String name;

    public NamedEntity() {}

    public NamedEntity(Long id, String name) {
        super(id);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
