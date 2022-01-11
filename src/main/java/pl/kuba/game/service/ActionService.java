package pl.kuba.game.service;

import pl.kuba.game.dto.model.ActionDTO;

import java.util.List;

public interface ActionService {

    List<ActionDTO> findAll();

    ActionDTO findById(Long id);

    ActionDTO create(ActionDTO boardDTO);

}
