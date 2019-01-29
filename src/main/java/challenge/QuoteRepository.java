package challenge;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {
    List<Quote> findAllByActor(String name);
}
