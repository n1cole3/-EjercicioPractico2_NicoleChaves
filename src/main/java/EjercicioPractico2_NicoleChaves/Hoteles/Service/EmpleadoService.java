/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPractico2_NicoleChaves.Hoteles.service;

import EjercicioPractico2_NicoleChaves.Hoteles.domain.Empleado;
import java.util.List;

public interface EmpleadoService {
    List<Empleado> findAllEmployees();
    Empleado findEmployeeById(Long id);
    Empleado saveEmployee(Empleado empleado);
    void deleteEmployee(Long id);
}
