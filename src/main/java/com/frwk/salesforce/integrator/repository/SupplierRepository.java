package com.frwk.salesforce.integrator.repository;

import com.frwk.salesforce.integrator.model.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Long> {
}
