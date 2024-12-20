package com.bcbsm.dto;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PersonResponseDTO {
    private Long personId;
    private String personName;
    private int age;
    private String address;
    private int picCode;

    private String statusCode;
    private String statusMessage;
}
