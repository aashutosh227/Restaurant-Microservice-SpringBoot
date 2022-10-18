package com.aashutosh.restaurantcatalogservice.resources;

import com.aashutosh.restaurantcatalogservice.models.CatalogItem;
import com.aashutosh.restaurantcatalogservice.models.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogResources {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("")
    public List<CatalogItem> getAllCatalog(){
        return Collections.singletonList(new CatalogItem("Legacy","Mumbai",
//                    Collections.singletonList(new Dish("Masala Dosa","South Indian","Breakfast"))));
//                Collections.singletonList(restTemplate.getForObject("http://localhost:8081/dishes/2",Dish.class))));
                Collections.singletonList(webClientBuilder.build()
                        .get()
                        .uri("http://localhost:8081/dishes/2")
                        .retrieve()
                        .bodyToMono(Dish.class)
                        .block())));
    }
}
