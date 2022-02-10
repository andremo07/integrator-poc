package com.frwk.salesforce.integrator.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Brand {

    @Id
    private String id;
    private Integer brandId;

    public static Brand prototype(Integer brandId){
        Brand brand = new Brand();
        brand.setBrandId(brandId);
        return brand;
    }
}
