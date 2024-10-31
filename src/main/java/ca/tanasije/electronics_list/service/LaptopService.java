package ca.tanasije.electronics_list.service;

import ca.tanasije.electronics_list.dto.LaptopDTO;

import java.util.List;

public interface LaptopService {

    List<LaptopDTO> getAllLaptops();

    LaptopDTO getLaptopById(Long laptopId);

    LaptopDTO createLaptop(LaptopDTO laptopDTO);

    LaptopDTO updateLaptop(Long id, LaptopDTO laptopDTO);

    void deleteLaptop(Long laptopId);
}
