package com.UserService.User.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class UserEntity {

    @Id
    public String id;
    public String name;
    public String email;
    public String about;

    @Transient
    public List<Rating> ratings = new ArrayList<>();
}
