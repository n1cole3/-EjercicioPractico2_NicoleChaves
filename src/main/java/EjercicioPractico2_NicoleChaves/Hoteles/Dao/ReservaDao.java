/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package EjercicioPractico2_NicoleChaves.Hoteles.Dao;

import EjercicioPractico2_NicoleChaves.Hoteles.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaDao extends JpaRepository<Reserva, Long> {

    public EjercicioPractico2_NicoleChaves.Hoteles.Service.Impl.Reserva save(EjercicioPractico2_NicoleChaves.Hoteles.Service.Impl.Reserva reserva);
    // Métodos específicos para la gestión de reservas pueden ser agregados aquí
}
