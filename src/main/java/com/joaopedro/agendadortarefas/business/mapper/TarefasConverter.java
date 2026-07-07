package com.joaopedro.agendadortarefas.business.mapper;

import com.joaopedro.agendadortarefas.business.dto.TarefasDTO;
import com.joaopedro.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
