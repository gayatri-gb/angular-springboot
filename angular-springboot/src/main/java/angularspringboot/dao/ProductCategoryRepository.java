package angularspringboot.dao;

import angularspringboot.Entity.productCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory" , path="product-category")
public interface ProductCategoryRepository extends JpaRepository<productCategory, Long> {
}
