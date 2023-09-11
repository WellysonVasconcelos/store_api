package project.store.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.store.api.domain.product.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}