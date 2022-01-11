package pl.kuba.game.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kuba.game.dto.mapper.ActionMapper;
import pl.kuba.game.dto.model.ActionDTO;
import pl.kuba.game.exception.ControllerException;
import pl.kuba.game.exception.ErrorMessage;
import pl.kuba.game.repository.ActionRepository;
import pl.kuba.game.service.ActionService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActionServiceImpl implements ActionService {

    private final ActionRepository actionRepository;
    private final ActionMapper actionMapper;

    @Override
    public List<ActionDTO> findAll() {
        return actionMapper.toBoardDTOs(actionRepository.findAll());
    }

    @Override
    public ActionDTO findById(Long id) {
        return actionMapper.toBoardDTO(actionRepository.findById(id)
                .orElseThrow(() -> new ControllerException(ErrorMessage.NOT_FOUND)));
    }

    @Override
    public ActionDTO create(ActionDTO boardDTO) {
        return actionMapper.toBoardDTO(actionRepository.save(actionMapper.toBoard(boardDTO)));
    }
}
