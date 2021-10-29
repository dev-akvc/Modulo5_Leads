package br.com.zup.Leads.dto;

import java.util.List;

public class LeadDTO {
    private String email;
    private String nome;
    private String telefone;
    private List<ProdutoDTO> listaDeProdutos;

    public LeadDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<ProdutoDTO> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<ProdutoDTO> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
}
