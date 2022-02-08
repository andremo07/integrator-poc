package com.frwk.salesforce.integrator.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="supplier_id")
    private Long supplierId;
}
