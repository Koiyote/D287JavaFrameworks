package com.example.demo;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private InhousePartRepository repo;
	@Autowired
	private ProductRepository productrepo;
	@Test
	void contextLoads() {
	}

	@Test
	void isInhouse(){
		InhousePart part = new InhousePart();

		part.setInv(5);
		part.setName("Jeffrey");
		part.setMax(10);
		part.setInv(7);
		part.setPrice(10.50);
		part.setPartId(235333);

		repo.save(part);

		Optional<InhousePart> testPart = repo.findById(part.getId());
		if(testPart.get().getName() == "Jeffrey"){
			System.out.println("Assertion is equal to Jeffrey");
		} else{
			System.out.println("Assertion is NOT equal to Jeffrey");
		}

	}

	@Test
	void isProduct(){
		Product aProduct = new Product();
		aProduct.setInv(10);
		aProduct.setPrice(10.50);
		aProduct.setName("Tinkerer's Set");

		productrepo.save(aProduct);

		Optional<Product> testProduct = productrepo.findById(aProduct.getId());

		if(testProduct.get().getName() == "Tinkerer's Set"){
			System.out.println("Product Assert worked successfully");
		}
		else{
			System.out.println("Product Assert failed");
		}


	}

}