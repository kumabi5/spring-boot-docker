package com.bcbsm.dto;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PersonRequestDTO {
    private String personName;
    private int age;
    private String address;
    private int picCode;
}
