package pl.kuba.game.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "actions")
@Data
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Field userId can not be empty")
    private Long userId;
    @NotNull(message = "Field userId can not be empty")
    private Long gameId;
    @NotBlank(message = "Field action can not be empty")
    @Size(min = 3, max=250, message = "Field action must have min 3 characters and max 250 characters")
    private String action;

}
