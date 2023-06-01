package com.example.demoanimalbot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
/**
 * Класс для объектов, которые берут
 * из приюта собак
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class UserDog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private long chatId;
    private String email;
    private String phoneNumber;

    public UserDog(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
