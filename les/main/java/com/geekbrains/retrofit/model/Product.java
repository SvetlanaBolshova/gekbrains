package les.main.java.com.geekbrains.retrofit.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {

    private Long id;
    private Integer price;
    private String title;
    private String categoryTitle;

}
