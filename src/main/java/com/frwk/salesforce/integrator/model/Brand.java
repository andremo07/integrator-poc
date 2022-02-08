package com.frwk.salesforce.integrator.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="brand",  schema = "public")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="brand_id")
    private Long brandId;

    public static Brand prototype(Long brandId){
        Brand brand = new Brand();
        brand.setBrandId(brandId);
        return brand;
    }
}
