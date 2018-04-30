package com.wyrzel.carrent.service.CarService;

import com.wyrzel.carrent.model.Car;

import java.util.List;

public interface CarService {

   void addCar(Car car);

   List<Car> getAllCars();

   Car getCar(Long id);

   void deleteCar(Long id);

   void updateCar(Long id, Car car);
}
