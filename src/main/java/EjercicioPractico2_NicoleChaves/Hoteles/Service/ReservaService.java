/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPractico2_NicoleChaves.Hoteles.service;

import EjercicioPractico2_NicoleChaves.Hoteles.domain.Reserva;
import java.util.List;

public interface ReservaService {
    List<Reserva> findAllReservations();
    Reserva findReservationById(Long id);
    Reserva saveReservation(Reserva reserva);
    void deleteReservation(Long id);
}
