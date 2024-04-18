/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico2_NicoleChaves.Hoteles.Service.Impl;

import EjercicioPractico2_NicoleChaves.Hoteles.Dao.EmpleadoDao;
import EjercicioPractico2_NicoleChaves.Hoteles.domain.Empleado;
import EjercicioPractico2_NicoleChaves.Hoteles.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public abstract class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoDao empleadoDao;

    @Override
    public List<Empleado> findAllEmployees() {
        return empleadoDao.findAll();
    }

    
   
   

    @Override
    public Empleado saveEmployee(Empleado empleado) {
        return empleadoDao.save(empleado);
    }

    @Override
    public void deleteEmployee(Long id) {
        empleadoDao.deleteById(id);
    }
    }