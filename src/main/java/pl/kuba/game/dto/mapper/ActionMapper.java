package pl.kuba.game.dto.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import pl.kuba.game.dto.model.ActionDTO;
import pl.kuba.game.entity.Action;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ActionMapper {

    ActionDTO toBoardDTO(Action board);

    List<ActionDTO> toBoardDTOs(List<Action> board);

    @InheritInverseConfiguration
    Action toBoard(ActionDTO boardDTO);

    @InheritInverseConfiguration
    List<Action> toBoards(List<ActionDTO> boardDTOs);
    
}
