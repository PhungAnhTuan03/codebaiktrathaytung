package com.example.ktra.RequestEntities;

import com.example.ktra.Entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestUpdateUser  {
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
}
