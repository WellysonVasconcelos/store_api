package project.store.api.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
