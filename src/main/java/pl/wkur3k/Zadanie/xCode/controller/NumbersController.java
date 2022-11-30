package pl.wkur3k.Zadanie.xCode.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wkur3k.Zadanie.xCode.dto.ArrayOutputDto;
import pl.wkur3k.Zadanie.xCode.dto.SortArrayDto;
import pl.wkur3k.Zadanie.xCode.service.NumbersServiceImpl;

@RestController
@RequestMapping("/numbers")
@AllArgsConstructor
public class NumbersController {

    private NumbersServiceImpl numbersService;

    @PostMapping("/sort-command")
    public ResponseEntity<ArrayOutputDto> sortArray(@RequestBody SortArrayDto dto){
        return ResponseEntity.ok(numbersService.sortArray(dto));
    }
}
