package module2.model;

public class BaseEntity {
    private Long id;

    public BaseEntity() {}

    public BaseEntity(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*boolean isNew() {
        return (this.id == null);
    }*/
}
