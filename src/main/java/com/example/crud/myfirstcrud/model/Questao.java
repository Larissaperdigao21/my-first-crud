package com.example.crud.myfirstcrud.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Questao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String pergunta;

    private String resposta;

    @OneToMany(mappedBy = "questao", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Alternativa> alternativaList = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "id_tema")
    private Tema tema;

    public Questao() {

    }

    public Questao(Long id, String pergunta, String resposta, List<Alternativa> alternativaList, Tema tema) {
        this.id = id;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.alternativaList = alternativaList;
        this.tema = tema;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public List<Alternativa> getAlternativaList() {
        return alternativaList;
    }

    public void setAlternativaList(List<Alternativa> alternativaList) {
        this.alternativaList = alternativaList;
    }

    public Tema getTemaDentroDaQuestao() {
        return tema;
    }

    public void setTemaDentroDaQuestao(Tema tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Questao{" +
                "id=" + id +
                ", pergunta='" + pergunta + '\'' +
                ", resposta='" + resposta + '\'' +
                ", alternativaList=" + alternativaList +
                ", tema=" + tema +
                '}';
    }


    public static final class Builder {
        private Questao questao;

        private Builder() {
            questao = new Questao();
        }

        public static Builder aQuestao() {
            return new Builder();
        }

        public Builder id(Long id) {
            questao.setId(id);
            return this;
        }

        public Builder pergunta(String pergunta) {
            questao.setPergunta(pergunta);
            return this;
        }

        public Builder resposta(String resposta) {
            questao.setResposta(resposta);
            return this;
        }

        public Builder alternativaList(List<Alternativa> alternativaList) {
            questao.setAlternativaList(alternativaList);
            return this;
        }

        public Builder tema(Tema tema) {
            questao.setTemaDentroDaQuestao(tema);
            return this;
        }

        public Questao build() {
            return questao;
        }
    }
}
