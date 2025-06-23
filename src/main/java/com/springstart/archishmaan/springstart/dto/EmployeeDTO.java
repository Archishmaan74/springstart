package com.springstart.archishmaan.springstart.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;
    private String name;
    private LocalDate doj;
    @JsonProperty("isLoggedIn")
    private boolean isLoggedIn;
}
