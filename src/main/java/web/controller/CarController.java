package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String firstPAge (@RequestParam (value = "count") int count, Model model) {
        List<Car> cars = count == 0 ? carService.getListCar() : carService.getCertainAmountCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
