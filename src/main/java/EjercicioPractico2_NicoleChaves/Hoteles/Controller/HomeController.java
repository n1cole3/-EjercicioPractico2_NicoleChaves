/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico2_NicoleChaves.Hoteles.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import EjercicioPractico2_NicoleChaves.Hoteles.service.HotelService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("hotels", hotelService.findAllHotels());
        return "home";
    }
}



@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservations")
    public String showReservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation_form";
    }

    @PostMapping("/reservations")
    public String submitReservation(Reservation reservation, Model model) {
        reservationService.createReservation(reservation);
        model.addAttribute("message", "Reservation successful!");
        return "reservation_confirmation";
    }
}
