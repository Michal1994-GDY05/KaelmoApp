package pl.jakusz.kaelmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jakusz.kaelmo.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
