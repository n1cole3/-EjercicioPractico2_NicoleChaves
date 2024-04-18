/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPractico2_NicoleChaves.Hoteles.service;

import EjercicioPractico2_NicoleChaves.Hoteles.domain.Hotel;
import java.util.List;

public interface HotelService {
    List<Hotel> findAllHotels();
    Hotel findHotelById(Long id);
    Hotel saveHotel(Hotel hotel);
    void deleteHotel(Long id);
}
