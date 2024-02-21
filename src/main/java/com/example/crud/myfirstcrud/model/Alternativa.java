package com.example.crud.myfirstcrud.model;

import jakarta.persistence.*;

@Entity
@Table
public class Alternativa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String alternativa;

    private boolean isCorreta;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "questao_id")
    private Questao questao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }

    public boolean isCorreta() {
        return isCorreta;
    }

    public void setCorreta(boolean correta) {
        isCorreta = correta;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public Alternativa() {
    }

    public Alternativa(String alternativa, boolean isCorreta, Questao questao) {
        this.alternativa = alternativa;
        this.isCorreta = isCorreta;
        this.questao = questao;
    }
    public Alternativa(Long id, String alternativa, boolean isCorreta, Questao questao) {
        this.id = id;
        this.alternativa = alternativa;
        this.isCorreta = isCorreta;
        this.questao = questao;
    }

    @Override
    public String toString() {
        return "Alternativa{" +
                "id=" + id +
                ", alternativa='" + alternativa + '\'' +
                ", isCorreta=" + isCorreta +
                ", questao=" + questao +
                '}';
    }
}
