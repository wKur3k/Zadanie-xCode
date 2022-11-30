package pl.wkur3k.Zadanie.xCode.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wkur3k.Zadanie.xCode.service.StatusServiceImpl;

@RestController
@RequestMapping("/status")
@AllArgsConstructor
public class StatusController {

    private StatusServiceImpl statusServiceImpl;

    @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        return ResponseEntity.ok(statusServiceImpl.pong());
    }
}
