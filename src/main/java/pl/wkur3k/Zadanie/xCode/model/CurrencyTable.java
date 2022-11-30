package pl.wkur3k.Zadanie.xCode.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CurrencyTable {
    private String table;
    private String no;
    private String effectiveDate;
    private Currency[] rates;
}
