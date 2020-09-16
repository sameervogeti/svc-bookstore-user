package com.bookstore.user.output;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ValidUser {
    private boolean isValidUser;
}

