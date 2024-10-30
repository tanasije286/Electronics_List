package ca.tanasije.electronics_list.service;

import ca.tanasije.electronics_list.entity.Laptop;
import ca.tanasije.electronics_list.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService{

    @Autowired
    private LaptopRepository laptopRepository;

    @Override
    public Laptop saveLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @Override
    public List<Laptop> fetchLaptopList() {
        return laptopRepository.findAll();
    }

    @Override
    public Laptop fetchLaptop(Long laptopId) {
        return laptopRepository.findById(laptopId).get();
    }

    @Override
    public Laptop updateLaptop(Laptop laptop, Long laptopId) {
        Laptop dbLaptop = laptopRepository.findById(laptopId).get();
        //List to update
        dbLaptop.setLaptopOperatingSystem(laptop.getLaptopOperatingSystem());

        if (Objects.nonNull(laptop.getLaptopLabel()) && !"".equalsIgnoreCase(laptop.getLaptopLabel())) {
            dbLaptop.setLaptopLabel(laptop.getLaptopLabel());
        }
        if (Objects.nonNull(laptop.getLaptopBrand()) && !"".equalsIgnoreCase(laptop.getLaptopBrand())) {
            dbLaptop.setLaptopBrand(laptop.getLaptopBrand());
        }
        if (Objects.nonNull(laptop.getLaptopSerialNumber()) && !"".equalsIgnoreCase(String.valueOf(laptop.getLaptopSerialNumber()))) {
            dbLaptop.setLaptopSerialNumber(laptop.getLaptopSerialNumber());
        }
        if (Objects.nonNull(laptop.getLaptopOwner()) && !"".equalsIgnoreCase(laptop.getLaptopOwner())) {
            dbLaptop.setLaptopOwner(laptop.getLaptopOwner());
        }
        if (Objects.nonNull(laptop.getLaptopLocation()) && !"".equalsIgnoreCase(String.valueOf(laptop.getLaptopLocation()))) {
            dbLaptop.setLaptopLocation(laptop.getLaptopLocation());
        }
        if (Objects.nonNull(laptop.getLaptopPrimaryUse()) && !"".equalsIgnoreCase(String.valueOf(laptop.getLaptopPrimaryUse()))) {
            dbLaptop.setLaptopPrimaryUse(laptop.getLaptopPrimaryUse());
        }
        if (Objects.nonNull(laptop.getLaptopOperatingSystem()) && !"".equalsIgnoreCase(String.valueOf(laptop.getLaptopOperatingSystem()))) {
            dbLaptop.setLaptopOperatingSystem(laptop.getLaptopOperatingSystem());
        }

        return laptopRepository.save(dbLaptop);
    }

    @Override
    public void deleteLaptopById(Long laptopId) {
        laptopRepository.deleteById(laptopId);
    }
}
