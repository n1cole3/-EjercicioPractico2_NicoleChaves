/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPractico2_NicoleChaves.Hoteles.service;

import EjercicioPractico2_NicoleChaves.Hoteles.domain.Usuario;

public interface UsuarioService {
    Usuario findUserByUsername(String username);
    Usuario saveUser(Usuario usuario);
    void deleteUser(Long id);
}
