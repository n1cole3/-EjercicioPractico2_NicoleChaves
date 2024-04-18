package EjercicioPractico2_NicoleChaves.Hoteles.service.impl;

import EjercicioPractico2_NicoleChaves.Hoteles.domain.Usuario;
import EjercicioPractico2_NicoleChaves.Hoteles.Dao.UsuarioDao;
import EjercicioPractico2_NicoleChaves.Hoteles.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioRepository;

    /**
     * Busca un usuario por nombre de usuario.
     *
     * @param username el nombre de usuario a buscar
     * @return el usuario si existe o null si no se encuentra
     */
    @Transactional(readOnly = true)
    @Override
    public Usuario findUserByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    @Transactional
    public Usuario saveUser(Usuario usuario) {
        Usuario existingUser = usuarioRepository.findByUsername(usuario.getUsername());
        if (existingUser != null) {
            throw new RuntimeException("El usuario ya existe con el username: " + usuario.getUsername());
        }
        return usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        usuarioRepository.deleteById(id);
    }
}
