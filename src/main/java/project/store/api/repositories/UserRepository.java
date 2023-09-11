package project.store.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import project.store.api.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

    UserDetails findByLogin(String login);
}
