package ca.tanasije.electronics_list.service;

import ca.tanasije.electronics_list.entity.Laptop;

import java.util.List;

public interface LaptopService {

    Laptop saveLaptop(Laptop laptop);

    List<Laptop> fetchLaptopList();

    Laptop fetchLaptop(Long laptopId);

    Laptop updateLaptop(Laptop laptop, Long laptopId);

    void deleteLaptopById(Long laptopId);
}
