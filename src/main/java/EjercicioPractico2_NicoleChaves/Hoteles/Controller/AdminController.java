/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package EjercicioPractico2_NicoleChaves.Hoteles.Controller;

import EjercicioPractico2_NicoleChaves.Hoteles.Service.AdminService;
import EjercicioPractico2_NicoleChaves.Hoteles.domain.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin/reservations")
    public String manageReservations(Model model) {
        model.addAttribute("reservations", adminService.getAllReservations());
        return "admin_reservations";
    }

    @GetMapping("/admin/employees")
    public String manageEmployees(Model model) {
        model.addAttribute("employees", adminService.getAllEmployees());
        return "admin_employees";
    }

    
    @PostMapping("/admin/employees/add")
    public String addEmpleado(Empleado employee, Model model) {
        adminService.addEmployee(employee);
        model.addAttribute("message", "Employee added successfully!");
        return "redirect:/admin/employees";
    }
}
*/