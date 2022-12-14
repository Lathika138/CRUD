package net.codejava;
 
import java.util.*;
 
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
public class ProductController {
 
    @Autowired
    private ProductService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/products")
    public List<Product> list() {
        return service.listAll();
    }
     
    // RESTful API method for Create operation
     
    // RESTful API method for Update operation
     
    // RESTful API method for Delete operation
}
