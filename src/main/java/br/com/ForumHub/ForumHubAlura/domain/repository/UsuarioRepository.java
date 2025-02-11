package br.com.ForumHub.ForumHubAlura.domain.repository;

import br.com.ForumHub.ForumHubAlura.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByLogin(String login);
}
