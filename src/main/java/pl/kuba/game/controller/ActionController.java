package pl.kuba.game.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.kuba.game.dto.model.ActionDTO;
import pl.kuba.game.service.ActionService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/actions")
@RequiredArgsConstructor
public class ActionController {

    private final ActionService actionService;

    @GetMapping
    public List<ActionDTO> findAll(){
        return actionService.findAll();
    }
    @GetMapping("/{id}")
    public ActionDTO findById(@PathVariable Long id){
        return actionService.findById(id);
    }
    @PostMapping
    public ActionDTO create(@Valid @RequestBody ActionDTO boardDTO){
        return actionService.create(boardDTO);
    }

}
