package order.domain;

import java.util.*;
import lombok.*;
import order.domain.*;
import order.infra.AbstractEvent;

@Data
@ToString
public class SoldOut extends AbstractEvent {

    private Long id;
    private String productname;
    private Integer stock;
}
