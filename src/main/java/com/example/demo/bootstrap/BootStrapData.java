package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        if(partRepository.count() < 5 || productRepository.count() < 5){
            InhousePart newPart = new InhousePart();
            newPart.setName("Wrench");
            newPart.setInv(4);
            newPart.setPrice(4.5);
            newPart.setMin(3);
            newPart.setMax(7);
            partRepository.save(newPart);
            InhousePart newPart2 = new InhousePart();
            newPart2.setName("Jewelers set");
            newPart2.setInv(4);
            newPart2.setPrice(2.0);
            newPart2.setMin(3);
            newPart2.setMax(8);
            partRepository.save(newPart2);
            InhousePart newPart3 = new InhousePart();
            newPart3.setName("CPU");
            newPart3.setInv(5);
            newPart3.setPrice(5.5);
            newPart3.setMin(3);
            newPart3.setMax(9);
            partRepository.save(newPart3);
            InhousePart newPart4 = new InhousePart();
            newPart4.setName("Motherboard");
            newPart4.setInv(7);
            newPart4.setPrice(6.5);
            newPart4.setMin(3);
            newPart4.setMax(10);
            partRepository.save(newPart4);
            InhousePart newPart5 = new InhousePart();
            newPart5.setName("PSU");
            newPart5.setInv(6);
            newPart5.setPrice(6.5);
            newPart5.setMin(3);
            newPart5.setMax(11);
            partRepository.save(newPart5);
            Product newProduct = new Product();
            newProduct.setName("Fan Cleaning Kit");
            newProduct.setInv(3);
            newProduct.setPrice(4.5);
            productRepository.save(newProduct);
            Product newProduct2 = new Product();
            newProduct2.setName("Cpu Motherboard Combo");
            newProduct2.setInv(2);
            newProduct2.setPrice(2.0);
            productRepository.save(newProduct2);
            Product newProduct3 = new Product();
            newProduct3.setName("Modular Power Supply Parts");
            newProduct3.setInv(1);
            newProduct3.setPrice(5.5);
            productRepository.save(newProduct3);
            Product newProduct4 = new Product();
            newProduct4.setName("Bench Testing");
            newProduct4.setInv(7);
            newProduct4.setPrice(6.5);
            productRepository.save(newProduct4);
            Product newProduct5 = new Product();
            newProduct5.setName("Diagnostics");
            newProduct5.setInv(6);
            newProduct5.setPrice(6.5);
            productRepository.save(newProduct5);
        }


        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
