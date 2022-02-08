package com.frwk.salesforce.integrator.repository;

import com.frwk.salesforce.integrator.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Long> {
    public boolean existsBrandByBrandId(Long brandId);
}
