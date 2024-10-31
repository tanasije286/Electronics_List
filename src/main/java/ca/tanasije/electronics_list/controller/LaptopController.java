package ca.tanasije.electronics_list.controller;

import ca.tanasije.electronics_list.dto.LaptopDTO;
import ca.tanasije.electronics_list.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/laptops")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping("/")
    public ResponseEntity<List<LaptopDTO>> getAllLaptops() {
        List<LaptopDTO> laptops = laptopService.getAllLaptops();
        return ResponseEntity.ok(laptops);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LaptopDTO> getLaptopById(@PathVariable Long id) {
        LaptopDTO laptop = laptopService.getLaptopById(id);
        return ResponseEntity.ok(laptop);
    }

    @PostMapping("/")
    public ResponseEntity<LaptopDTO> createLaptop(@RequestBody LaptopDTO laptopDTO) {
        LaptopDTO createdLaptop = laptopService.createLaptop(laptopDTO);
        return ResponseEntity.ok(createdLaptop);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LaptopDTO> updateLaptop(@PathVariable Long id, @RequestBody LaptopDTO laptopDTO) {
        LaptopDTO updatedLaptop = laptopService.updateLaptop(id, laptopDTO);
        return ResponseEntity.ok(updatedLaptop);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLaptop(@PathVariable Long id) {
        laptopService.deleteLaptop(id);
        return ResponseEntity.noContent().build();
    }
}
