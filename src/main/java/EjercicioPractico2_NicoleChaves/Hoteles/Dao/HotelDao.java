/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package EjercicioPractico2_NicoleChaves.Hoteles.Dao;

import EjercicioPractico2_NicoleChaves.Hoteles.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelDao extends JpaRepository<Hotel, Long> {

    /**
     *
     * @param hotel
     * @return
     */
    public EjercicioPractico2_NicoleChaves.Hoteles.Service.Impl.Hotel save(EjercicioPractico2_NicoleChaves.Hoteles.Service.Impl.Hotel hotel);
    // Métodos específicos para la gestión de hoteles pueden ser agregados aquí
}
