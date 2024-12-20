package com.bcbsm.service;

import com.bcbsm.dto.PersonRequestDTO;
import com.bcbsm.dto.PersonResponseDTO;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class VoterRegistrationService {

    public PersonResponseDTO createUserDetails(PersonRequestDTO personRequestDTO) {
        PersonResponseDTO personResponseDTO = new PersonResponseDTO();
        if (Objects.nonNull(personRequestDTO)) {
            personResponseDTO.setPersonId(System.currentTimeMillis());
            personResponseDTO.setPersonName(personRequestDTO.getPersonName());
            personResponseDTO.setAge(personRequestDTO.getAge());
            personResponseDTO.setPicCode(personRequestDTO.getAge());
            personResponseDTO.setAddress(personRequestDTO.getAddress());
            personResponseDTO.setStatusCode("001");
            personResponseDTO.setStatusMessage("Success");
        }
        return personResponseDTO;
    }
}
