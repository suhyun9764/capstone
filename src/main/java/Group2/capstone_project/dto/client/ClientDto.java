package Group2.capstone_project.dto.client;

import Group2.capstone_project.domain.Client;
import org.springframework.security.crypto.password.PasswordEncoder;

public class ClientDto {

    private final PasswordEncoder passwordEncoder;

    public ClientDto(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    private String id;
    private String name;
    private String age;
    private String studentNumber;
    private String password;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber (String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
