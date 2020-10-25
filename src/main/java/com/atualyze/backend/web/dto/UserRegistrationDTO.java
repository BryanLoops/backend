package com.atualyze.backend.web.dto;

public class UserRegistrationDTO {
    private String CPF;
    private String nome;
    private String nascimento;
    private String email;
    private String senha;
    private String telefone;
    private String endereco;

    UserRegistrationDTO() {

    }

    public UserRegistrationDTO(String CPF, String nome, String nascimento, String email, String senha, String telefone, String endereco) {
        this.CPF = CPF;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
