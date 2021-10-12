package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;


/*
 * FAST : 빠른배송
 * NORMAL : 일반 배송
 * SLOW : 느린 배송
 * */
@Data
@AllArgsConstructor
public class Delivery {

    private String code;
    private String displayName;
}
