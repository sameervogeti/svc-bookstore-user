package com.bookstore.user.input;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserDetails {
    private String emailId;
    private String password;
}
