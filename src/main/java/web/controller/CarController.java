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
    private List<Car> carList =  new CarServiceImpl().car();
    private List<Car> temp = new ArrayList<>();

    @GetMapping("/cars")
    public String getListCar(@RequestParam(value = "count", required = false) int count, Model model) {

        for (int i = 0; i < count; i++) {
            temp.add(new CarServiceImpl().car().get(i));
        }
        model.addAttribute("result", temp);


        System.out.println(carList.toString());
        return "cars";
    }


}
