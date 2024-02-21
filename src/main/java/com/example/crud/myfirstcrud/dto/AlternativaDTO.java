package com.example.crud.myfirstcrud.dto;
import com.example.crud.myfirstcrud.model.Questao;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlternativaDTO {

    private Long id;
    private String alternativa;
    private boolean isCorreta;
    private Questao questao;


    public AlternativaDTO(String alternativa, boolean isCorreta, Questao questao) {
        this.alternativa = alternativa;
        this.isCorreta = isCorreta;
        this.questao = questao;
    }
}
