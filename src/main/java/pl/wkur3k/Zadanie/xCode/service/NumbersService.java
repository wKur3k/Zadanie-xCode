package pl.wkur3k.Zadanie.xCode.service;

import pl.wkur3k.Zadanie.xCode.dto.ArrayOutputDto;
import pl.wkur3k.Zadanie.xCode.dto.SortArrayDto;

public interface NumbersService {
    ArrayOutputDto sortArray(SortArrayDto dto);
}
