package com.example.crud.myfirstcrud.model;


import jakarta.persistence.*;

@Entity
@Table
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String name;

    private String apelido;

    @Column(name = "nome_completo")
    private String fullName;

    @Column(name = "idade")
    private Integer age;

    private String email;

    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }


    public static final class Builder {
        private Usuario usuario;

        private Builder() {
            usuario = new Usuario();
        }

        public static Builder anUsuario() {
            return new Builder();
        }

        public Builder id(Long id) {
            usuario.setId(id);
            return this;
        }

        public Builder name(String name) {
            usuario.setName(name);
            return this;
        }

        public Builder fullName(String fullName) {
            usuario.setFullName(fullName);
            return this;
        }

        public Builder age(Integer age) {
            usuario.setAge(age);
            return this;
        }

        public Builder email(String email) {
            usuario.setEmail(email);
            return this;
        }

        public Builder senha(String senha) {
            usuario.setSenha(senha);
            return this;
        }

        public Usuario build() {
            return usuario;
        }
    }
}
