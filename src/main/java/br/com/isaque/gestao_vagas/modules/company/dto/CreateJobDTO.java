package br.com.isaque.gestao_vagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateJobDTO {
    
    @Schema(example = "Vaga p/ pessoa desenvolvedora júnior", requiredMode = RequiredMode.REQUIRED)
    private String description;
    @Schema(example = "Plano de Saúde, Odontológico, GymPass, EducaDev", requiredMode = RequiredMode.REQUIRED)
    private String benefits;
    @Schema(example = "Júnior", requiredMode = RequiredMode.REQUIRED)
    private String level;
}
