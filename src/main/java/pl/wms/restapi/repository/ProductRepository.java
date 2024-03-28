package pl.wms.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wms.restapi.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
