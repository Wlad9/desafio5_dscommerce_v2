package devSuperio.dscommerce.services;

import devSuperio.dscommerce.dto.ProductDTO;
import devSuperio.dscommerce.entities.Product;
import devSuperio.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDTO productDTO = new ProductDTO(product);
        return productDTO;
    }
}
