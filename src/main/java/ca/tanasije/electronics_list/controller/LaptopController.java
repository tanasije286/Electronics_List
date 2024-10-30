package ca.tanasije.electronics_list.controller;

import ca.tanasije.electronics_list.entity.Laptop;
import ca.tanasije.electronics_list.service.LaptopService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @PostMapping("/laptops")
    public Laptop saveLaptop(@Valid @RequestBody Laptop laptop) {
        return laptopService.saveLaptop(laptop);
    }

    @GetMapping("/laptops")
    public List<Laptop> fetchLaptopList() {
        return laptopService.fetchLaptopList();
    }

    @GetMapping("/laptops/{id}")
    public Laptop fetchLaptop(@PathVariable("id") Long laptopId) {
        return laptopService.fetchLaptop(laptopId);
    }

    @PutMapping("/laptops/{id}")
    public Laptop updateLaptop(@RequestBody Laptop laptop, @PathVariable("id") Long laptopId) {
        return laptopService.updateLaptop(laptop, laptopId);
    }

    @DeleteMapping("/laptops/{id}")
    public String deleteLaptopById(@PathVariable("id") Long laptopId) {
        laptopService.deleteLaptopById(laptopId);
        return "Deleted Laptop Successfully";
    }
}
