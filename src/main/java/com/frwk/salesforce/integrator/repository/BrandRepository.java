package com.frwk.salesforce.integrator.repository;

import com.frwk.salesforce.integrator.model.Brand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends MongoRepository<Brand, String> {
    public boolean existsBrandByBrandId(Integer brandId);
}
