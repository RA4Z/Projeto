package br.com.grupo4.Consultor.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Consultor {

    @Id
    private long idConsultor;
    private String nome;
    private String email;
    private String telefone;
    private String skill;
    private String valorHora;

}
