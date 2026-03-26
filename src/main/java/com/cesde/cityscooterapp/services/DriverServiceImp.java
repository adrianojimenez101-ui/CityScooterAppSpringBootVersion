package com.cesde.cityscooterapp.services;

import com.cesde.cityscooterapp.domain.Driver;
import com.cesde.cityscooterapp.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DriverServiceImp implements DriverService {

    @Autowired
    private  DriverRepository driverRepository;



    @Override
    public Driver createrDriver(Driver driver) {

        return driverRepository.save(driver);
    }

    @Override
    public Driver updateDriver(Driver driver) {
        return null;
    }

    @Override
    public Optional<Driver> getDriverById(int id) {

        Driver driver = driverRepository.drivers.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);


        return Optional.ofNullable(driver);
    }
}
