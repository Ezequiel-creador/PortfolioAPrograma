
package com.portfoliofinal.app.security.service;

import com.portfoliofinal.app.security.entity.Usuario;
import com.portfoliofinal.app.security.entity.UsuarioMain;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
  @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByUsuario(nombreUsuario).get();
        return UsuarioMain.build(usuario);
    }
}  