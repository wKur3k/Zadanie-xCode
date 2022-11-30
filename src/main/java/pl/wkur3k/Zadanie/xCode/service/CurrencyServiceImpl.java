package pl.wkur3k.Zadanie.xCode.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.wkur3k.Zadanie.xCode.dto.CurrencyDto;
import pl.wkur3k.Zadanie.xCode.dto.CurrencyOutputDto;
import pl.wkur3k.Zadanie.xCode.exception.WrongCurrencyException;
import pl.wkur3k.Zadanie.xCode.model.Currency;
import pl.wkur3k.Zadanie.xCode.model.CurrencyTable;

import java.net.URI;
import java.util.Arrays;
import java.util.Optional;

@Service
public class CurrencyServiceImpl implements CurrencyService{
    private static final URI apiUrl = URI.create("http://api.nbp.pl/api/exchangerates/tables/A?format=json");
    private static final RestTemplate restTemplate = new RestTemplate();
    @Override
    public CurrencyOutputDto getCurrency(CurrencyDto dto){
        Optional<Currency> apiOutput = getApiResponse(dto.getCurrency());
        if(apiOutput.isPresent()){
            return new CurrencyOutputDto(apiOutput.get().getMid());
        }
        else{
            throw new WrongCurrencyException(String.format("Currency with name like: %s was not found.", dto.getCurrency()));
        }
    }
    public Optional<pl.wkur3k.Zadanie.xCode.model.Currency> getApiResponse(String currency){
        CurrencyTable[] table = restTemplate.getForObject(apiUrl, CurrencyTable[].class);
        return Arrays.stream(table[0].getRates()).filter(o -> o.getCode().equals(currency)).findFirst();
    }
}
