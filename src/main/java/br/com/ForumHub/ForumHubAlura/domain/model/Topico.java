package br.com.ForumHub.ForumHubAlura.domain.model;


import br.com.ForumHub.ForumHubAlura.domain.dto.DadosAtualizacaoTopico;
import br.com.ForumHub.ForumHubAlura.domain.dto.DadosTopico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "conteudo")
    private String mensagem;

    @Column(name = "data")
    private LocalDate dataDeCriacao = LocalDate.now();

    @Column(name = "boolean")
    private String estadoDoTopico;

    @Column(name = "nome")
    private String nomeAutor;

    @Column(name = "email")
    private String emailAutor;

    @Column(name = "curso" )
    private String curso;


    public Topico(DadosTopico dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.dataDeCriacao = (dados.data_criacao() != null) ? dados.data_criacao() : LocalDate.now();
        this.estadoDoTopico = dados.estadoDoTopico();
        this.nomeAutor = dados.nome_autor();
        this.emailAutor = dados.email_autor();
        this.curso = dados.curso();
    }


    public void atualizarInformacoes(DadosAtualizacaoTopico dados) {

        if (dados.emailAutor() != null) {
            this.emailAutor = dados.emailAutor();
        }
        if (dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }
        if (dados.curso() != null) {
            this.curso = dados.curso();
        }

    }
}
