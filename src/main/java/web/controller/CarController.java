package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getListCar(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, Model model) {

        List<Car> temp = new ArrayList<>();

        if (count > 5 || count == null) {
            count = 5;
        }

        for (int i = 0; i < count; i++) {
            temp.add(new CarServiceImpl().car().get(i));
        }

        model.addAttribute("result", temp);

        return "cars";
    }


}
