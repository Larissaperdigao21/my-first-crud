package com.example.crud.myfirstcrud.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

    private Long id;
    private String name;
    private String fullName;
    private Integer age;

    public UsuarioDTO(String name, String fullName, Integer age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }
}
