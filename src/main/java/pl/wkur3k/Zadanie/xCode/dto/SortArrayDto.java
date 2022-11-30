package pl.wkur3k.Zadanie.xCode.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;
import pl.wkur3k.Zadanie.xCode.model.SortOrder;

@Getter
@Setter
public class SortArrayDto {
    @Nullable
    private Integer[] numbers;
    private SortOrder order;
}
