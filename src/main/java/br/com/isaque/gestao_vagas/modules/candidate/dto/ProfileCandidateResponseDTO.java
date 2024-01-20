package br.com.isaque.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileCandidateResponseDTO {
    
    @Schema(example = "Dev Java")
    private String description;

    @Schema(example = "Maria_Silva")
    private String username;

    @Schema(example = "maria@gmail.com")
    private String email;

    @Schema(example = "Maria de Souza")
    private String name;
    
    private UUID id;
}
