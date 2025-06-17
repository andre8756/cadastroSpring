package dev.java10x.CadastroDeNinjas.Ninjas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;

// Ele transforma uma classe em uma entidade de banco de dados
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "idade")
    private int idade;

    // cada ninja pode ter apenas uma única missão por vez
    @ManyToOne
    @JoinColumn(name = "missao_id") //chave estrangeira
    @JsonIgnore
    private MissaoModel missao;

    // construtor noArgs
    public NinjaModel() {
    }

    //construtor AllArgs
    public NinjaModel(String nome, String email, int idade, MissaoModel missao) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missao = missao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public MissaoModel getMissoes() {
        return missao;
    }

    public void setMissoes(MissaoModel missao){
        this.missao = missao;
    }

    @Override
    public String toString() {
        return "NinjaModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                ", missao=" + missao +
                '}';
    }
}
