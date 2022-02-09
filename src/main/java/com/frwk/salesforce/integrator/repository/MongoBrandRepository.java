package com.frwk.salesforce.integrator.repository;

import com.frwk.salesforce.integrator.model.Brand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoBrandRepository extends MongoRepository<Brand, Long> {
    public boolean existsBrandByBrandId(Long brandId);
}
