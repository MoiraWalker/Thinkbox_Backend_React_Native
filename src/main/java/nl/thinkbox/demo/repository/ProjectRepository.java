package nl.thinkbox.demo.repository;

import nl.thinkbox.demo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * De JpaRepositories die jullie al kennen. Hier wordt gebruik gemaakt van Query Creation. Op basis van de methode naam
 * weten Spring en JPA welke query op de database uitgevoerd moet worden.
 * Hier kan meer informatie over gevonden worden:
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
 */
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
