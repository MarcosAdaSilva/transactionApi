package com.marcosDev.Transaction_api.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tb_users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long UUID;

    @Column(name = "nome_usuario")
    private String name;

    @Column(name = "cpf_usuario")
    private String cpf;

    @Column(name = "Telefone_usuario")
    private String foneNumber;

    @Column(name = "numero_cartao_usuario")
    private Long cardNumber;

    @Column(name = "validade_cartao_usuario")
    private Boolean validateCard;

    @Column(name = "codigo_cvv_cartao")
    private String cvv;
}
