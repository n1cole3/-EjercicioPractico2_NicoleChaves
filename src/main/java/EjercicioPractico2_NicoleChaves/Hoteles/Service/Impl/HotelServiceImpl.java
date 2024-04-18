/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico2_NicoleChaves.Hoteles.Service.Impl;

import EjercicioPractico2_NicoleChaves.Hoteles.Dao.HotelDao;
import EjercicioPractico2_NicoleChaves.Hoteles.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *
 * @author nicom
 */
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelDao hotelDao;

    @Override
    public List<EjercicioPractico2_NicoleChaves.Hoteles.domain.Hotel> findAllHotels() {
        return hotelDao.findAll();
    }

    @Override
    public EjercicioPractico2_NicoleChaves.Hoteles.domain.Hotel findHotelById(Long id) {
        return hotelDao.findById(id).orElse(null);
    }

    public Hotel saveHotel(Hotel hotel) {
        return hotelDao.save(hotel);
    }

    @Override
    public void deleteHotel(Long id) {
        hotelDao.deleteById(id);
    }

    @Override
    public EjercicioPractico2_NicoleChaves.Hoteles.domain.Hotel saveHotel(EjercicioPractico2_NicoleChaves.Hoteles.domain.Hotel hotel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
