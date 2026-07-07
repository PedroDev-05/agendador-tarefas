package com.joaopedro.agendadortarefas.infrastructure.entity;

import com.joaopedro.agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("tarefa")
public class TarefasEntity {

    @Id
    private String id;
    private String nomeTarefa;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataEvento;
    private String emailUsuario;
    private LocalDateTime dataAlteracao;
    private StatusNotificacaoEnum statusNotificacaoEnum;
}
