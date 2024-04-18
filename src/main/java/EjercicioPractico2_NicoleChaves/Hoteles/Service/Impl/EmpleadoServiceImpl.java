/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico2_NicoleChaves.Hoteles.Service.Impl;

import EjercicioPractico2_NicoleChaves.Hoteles.servicio.EmpleadoService;
import EjercicioPractico2_NicoleChaves.Hoteles.dominio.Empleado;
import EjercicioPractico2_NicoleChaves.Hoteles.dao.empleados.EmpleadoDao;
import EjercicioPractico2_NicoleChaves.Hoteles.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public abstract class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoDao empleadoDao;

    @Override
    public List<Object> findAllEmployees() {
        return empleadoDao.findAll();
    }

    @Override
    public Object findEmployeeById(Long id) {
        return empleadoDao.findById(id).orElse(null);
    }

    @Override
    public Empleado saveEmployee(Empleado empleado) {
        return empleadoDao.save(empleado);
    }

    @Override
    public void deleteEmployee(Long id) {
        empleadoDao.deleteById(id);
    }

    @Override
    public EjercicioPractico2_NicoleChaves.Hoteles.domain.Empleado saveEmployee(EjercicioPractico2_NicoleChaves.Hoteles.domain.Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
