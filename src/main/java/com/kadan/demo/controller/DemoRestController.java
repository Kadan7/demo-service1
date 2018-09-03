package com.kadan.demo.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/svc1")
public class DemoRestController {


    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public ResponseEntity<String> getBookmarks() {
        return ResponseEntity.status(HttpStatus.OK).body("you are visiting demo service 1 ...");
    }

}
