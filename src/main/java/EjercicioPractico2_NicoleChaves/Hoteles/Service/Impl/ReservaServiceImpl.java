/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico2_NicoleChaves.Hoteles.Service.Impl;

import EjercicioPractico2_NicoleChaves.Hoteles.Dao.ReservaDao;
import EjercicioPractico2_NicoleChaves.Hoteles.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *
 * @author nicom
 */
@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaDao reservaDao;

    @Override
    public List<EjercicioPractico2_NicoleChaves.Hoteles.domain.Reserva> findAllReservations() {
        return reservaDao.findAll();
    }

    @Override
    public EjercicioPractico2_NicoleChaves.Hoteles.domain.Reserva findReservationById(Long id) {
        return reservaDao.findById(id).orElse(null);
    }

    public Reserva saveReservation(Reserva reserva) {
        return reservaDao.save(reserva);
    }

    @Override
    public void deleteReservation(Long id) {
        reservaDao.deleteById(id);
    }

    @Override
    public EjercicioPractico2_NicoleChaves.Hoteles.domain.Reserva saveReservation(EjercicioPractico2_NicoleChaves.Hoteles.domain.Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
