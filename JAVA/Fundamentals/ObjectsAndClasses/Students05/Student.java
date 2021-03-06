package ObjectsAndClasses.Students05;

public class Student {

    private String firstName;
    private String secondName;
    private Integer age;
    private String city;

    public Student(String firstName, String secondName, Integer age, String homeTown) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.city = homeTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
