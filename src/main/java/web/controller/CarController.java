package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carDAO.printCars(count));
        return "cars";
    }
}