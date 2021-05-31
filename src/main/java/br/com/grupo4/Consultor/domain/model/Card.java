package br.com.grupo4.Consultor.domain.model;

import com.sun.jdi.PrimitiveValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Card {

    @Id
    private String secao;
    private String projeto;
    private String status;
    private String dataInicio;
    private String dataEncerramento;
    private String horasApontadas;

}
