package com.weproud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Logan. 81k
 */
@Slf4j
@Api(tags = {"Auth"})
@RestController
@RequestMapping("/auth")
public class AuthController {
    @ApiOperation(value = "인증", notes = "", response = String.class)
    @GetMapping
    public ResponseEntity getAuth() throws Exception {

        return new ResponseEntity<>("auth", HttpStatus.OK);
    }
}
