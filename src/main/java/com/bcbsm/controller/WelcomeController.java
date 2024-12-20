package com.bcbsm.controller;

import com.bcbsm.dto.PersonRequestDTO;
import com.bcbsm.dto.PersonResponseDTO;
import com.bcbsm.service.VoterRegistrationService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @Autowired
    private VoterRegistrationService voterRegistrationService;

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Service is UP and Running ....!";
    }

    @PostMapping("/create-user")
    public PersonResponseDTO createUserDetails(@RequestBody PersonRequestDTO personRequestDTO) {
        return voterRegistrationService.createUserDetails(personRequestDTO);

    }
}
