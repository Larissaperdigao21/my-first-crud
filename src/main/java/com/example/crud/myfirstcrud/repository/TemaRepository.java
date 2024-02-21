package com.example.crud.myfirstcrud.repository;

import com.example.crud.myfirstcrud.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
}
