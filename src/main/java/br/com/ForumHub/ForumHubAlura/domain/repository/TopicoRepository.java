package br.com.ForumHub.ForumHubAlura.domain.repository;

import br.com.ForumHub.ForumHubAlura.domain.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    Optional<Topico> findByTituloAndNomeAutor(String titulo, String nomeAutor);
}
