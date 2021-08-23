package exercise;

public class Student {
    private Integer id;
    private String name;
    private  Integer age;
    private String classes;
    private Double source;

    public Student(Integer id, String name, Integer age, String classes, Double source) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
        this.source = source;
    }

    public Student() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Double getSource() {
        return source;
    }

    public void setSource(Double source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                ", source=" + source +
                '}';
    }
}
