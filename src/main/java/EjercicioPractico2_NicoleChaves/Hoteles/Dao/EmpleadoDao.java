/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPractico2_NicoleChaves.Hoteles.Dao;

import EjercicioPractico2_NicoleChaves.Hoteles.domain.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoDao extends JpaRepository<Empleado, Long> {
    // Métodos para la gestión de empleados pueden ser implementados aquí
}
