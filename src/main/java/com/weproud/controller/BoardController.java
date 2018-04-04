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
@Api(tags = {"Board"})
@RestController
@RequestMapping("/boards")
public class BoardController {
    @ApiOperation(value = "게시판", notes = "", response = String.class)
    @GetMapping
    public ResponseEntity getBoards() throws Exception {

        return new ResponseEntity<>("board", HttpStatus.OK);
    }
}
