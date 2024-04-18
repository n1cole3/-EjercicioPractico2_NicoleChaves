/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico2_NicoleChaves.Hoteles.Service.Impl;

import EjercicioPractico2_NicoleChaves.Hoteles.Dao.UsuarioDao;
import EjercicioPractico2_NicoleChaves.Hoteles.service.UsuarioService;
import EjercicioPractico2_NicoleChaves.Hoteles.domain.Usuario;
import EjercicioPractico2_NicoleChaves.Hoteles.dao.usuarios.UsuarioDao;
import EjercicioPractico2_NicoleChaves.Hoteles.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicom
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public Usuario findUserByUsername(String username) {
        return usuarioDao.findByUsername(username).orElse(null);
   
   

