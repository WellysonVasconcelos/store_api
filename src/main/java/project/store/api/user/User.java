package project.store.api.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@Table(name = "user")
@Entity(name = "User")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    public User(userData data) {
        this.name = data.name();
        this.email = data.email();
        this.password = data.password();
    }

    public void setPassword(String password, PasswordEncoder passwordEncoder) {

        this.password = passwordEncoder.encode(password);
    }

}
