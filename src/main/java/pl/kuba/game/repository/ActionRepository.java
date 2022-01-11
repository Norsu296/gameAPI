package pl.kuba.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kuba.game.entity.Action;

public interface ActionRepository extends JpaRepository<Action, Long> {
}
