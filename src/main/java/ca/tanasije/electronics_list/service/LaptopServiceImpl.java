package ca.tanasije.electronics_list.service;

import ca.tanasije.electronics_list.dto.LaptopDTO;
import ca.tanasije.electronics_list.entity.Laptop;
import ca.tanasije.electronics_list.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LaptopServiceImpl implements LaptopService{

    @Autowired
    private LaptopRepository laptopRepository;

    private LaptopDTO mapLaptopToDTO(Laptop laptop) {
        return new LaptopDTO(laptop.getLaptopId(),
                laptop.getLaptopLabel(),
                laptop.getLaptopBrand(),
                laptop.getLaptopSerialNumber(),
                laptop.getLaptopOwner(),
                laptop.getLaptopLocation(),
                laptop.getLaptopPrimaryUse(),
                laptop.getLaptopOperatingSystem()
        );
    }

    private Laptop mapDTOToLaptop(LaptopDTO laptopDTO) {
        return new Laptop(laptopDTO.getLaptopLabel(),
                laptopDTO.getLaptopBrand(),
                laptopDTO.getLaptopSerialNumber(),
                laptopDTO.getLaptopOwner(),
                laptopDTO.getLaptopLocation(),
                laptopDTO.getLaptopPrimaryUse(),
                laptopDTO.getLaptopOperatingSystem()
        );
    }

    @Override
    public List<LaptopDTO> getAllLaptops() {
        return laptopRepository.findAll().stream()
                .map(this::mapLaptopToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public LaptopDTO getLaptopById(Long id) {
        Laptop laptop = laptopRepository.findById(id).orElseThrow(() -> new RuntimeException("Laptop not found"));
        return mapLaptopToDTO(laptop);
    }

    @Override
    public LaptopDTO createLaptop(LaptopDTO laptopDTO) {
        Laptop laptop = mapDTOToLaptop(laptopDTO);
        Laptop savedLaptop = laptopRepository.save(laptop);
        return mapLaptopToDTO(savedLaptop);
    }

    @Override
    public LaptopDTO updateLaptop(Long id, LaptopDTO laptopDTO) {
        Laptop existingLaptop = laptopRepository.findById(id).orElseThrow(() -> new RuntimeException("Laptop not found"));
        existingLaptop.setLaptopLabel(laptopDTO.getLaptopLabel());
        existingLaptop.setLaptopBrand(laptopDTO.getLaptopBrand());
        existingLaptop.setLaptopSerialNumber(laptopDTO.getLaptopSerialNumber());
        existingLaptop.setLaptopOwner(laptopDTO.getLaptopOwner());
        existingLaptop.setLaptopLocation(laptopDTO.getLaptopLocation());
        existingLaptop.setLaptopPrimaryUse(laptopDTO.getLaptopPrimaryUse());
        existingLaptop.setLaptopOperatingSystem(laptopDTO.getLaptopOperatingSystem());
        Laptop updatedLaptop = laptopRepository.save(existingLaptop);
        return mapLaptopToDTO(updatedLaptop);
    }

    @Override
    public void deleteLaptop(Long id) {
        Laptop laptop = laptopRepository.findById(id).orElseThrow(() -> new RuntimeException("Laptop not found"));
        laptopRepository.delete(laptop);
    }
}
