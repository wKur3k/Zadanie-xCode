package pl.wkur3k.Zadanie.xCode.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wkur3k.Zadanie.xCode.dto.CurrencyDto;
import pl.wkur3k.Zadanie.xCode.dto.CurrencyOutputDto;
import pl.wkur3k.Zadanie.xCode.service.CurrencyServiceImpl;

@RestController
@RequestMapping("/currencies")
@AllArgsConstructor
public class CurrenciesController {
    private CurrencyServiceImpl currencyService;

    @PostMapping("/get-current-currency-value-command")
    public ResponseEntity<CurrencyOutputDto> getCurrencyValue(@RequestBody CurrencyDto dto){
        return ResponseEntity.ok(currencyService.getCurrency(dto));
    }
}
