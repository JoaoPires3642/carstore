package br.com.carstore.controller;

import br.com.carstore.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {

        return "Hello, world!";
    }
    @GetMapping("/car")
    public ResponseEntity <Car> home () {
        Car car = new Car();
        car.setName("fusca");
        car.setColor("Amarelo");

        return ResponseEntity.ok(car);
    }
}