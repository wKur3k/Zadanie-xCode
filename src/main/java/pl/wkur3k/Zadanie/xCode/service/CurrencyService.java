package pl.wkur3k.Zadanie.xCode.service;

import org.springframework.stereotype.Service;
import pl.wkur3k.Zadanie.xCode.dto.CurrencyDto;
import pl.wkur3k.Zadanie.xCode.dto.CurrencyOutputDto;

public interface CurrencyService {
    CurrencyOutputDto getCurrency(CurrencyDto dto);
}
