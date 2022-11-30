package pl.wkur3k.Zadanie.xCode.service;

import org.springframework.stereotype.Service;
import pl.wkur3k.Zadanie.xCode.dto.ArrayOutputDto;
import pl.wkur3k.Zadanie.xCode.dto.SortArrayDto;
import pl.wkur3k.Zadanie.xCode.exception.NullPointerInArrayException;

import java.util.Arrays;
import java.util.Collections;

@Service
public class NumbersServiceImpl implements NumbersService {

    @Override
    public ArrayOutputDto sortArray(SortArrayDto dto){
        if(dto.getNumbers() == null){
            return new ArrayOutputDto(dto.getNumbers());
        }
        try{
            switch(dto.getOrder()){
                case ASC:
                    Arrays.sort(dto.getNumbers());
                    break;
                case DESC:
                    Arrays.sort(dto.getNumbers(), Collections.reverseOrder());
                    break;
                default:
                    break;
            }
            return new ArrayOutputDto(dto.getNumbers());
        }
        catch(NullPointerException e){
            throw new NullPointerInArrayException();
        }
    }
}
