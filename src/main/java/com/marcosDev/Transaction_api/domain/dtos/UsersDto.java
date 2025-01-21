package com.marcosDev.Transaction_api.domain.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public class UsersDto {
         String name;
         String cpf;
         String foneNumber;
         Long cardNumber;
         Boolean validateCard;
         String cvv;


}
