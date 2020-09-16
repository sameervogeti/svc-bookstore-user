package com.bookstore.user.model;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@NamedQueries(
        {
                @NamedQuery(
                        name = "User.finduserByEmail",
                        query = "from users e where e.email = :email"
                ),
                @NamedQuery(
                        name = "User.finduserByEmailandPassword",
                        query = "from users e where e.email = :email and e.password=:password"
                )

        }
)
@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Integer user_id;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "full_name", nullable = false)
    private String fullName;



}
