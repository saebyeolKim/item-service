package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter //@Data 는 주요할 필요가 있다.
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity; // null 이 들어 갈 수 있으므로

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
