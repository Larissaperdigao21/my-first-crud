package com.example.crud.myfirstcrud.repository;


import com.example.crud.myfirstcrud.model.Questao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestaoRepository extends JpaRepository<Questao, Long> {

}
