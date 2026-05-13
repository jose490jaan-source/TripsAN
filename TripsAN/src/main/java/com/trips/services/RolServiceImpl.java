package com.trips.services;

import org.springframework.stereotype.Service;

import com.trips.models.Rol;

@Service
public class RolServiceImpl implements IRolService {
	List<Rol> lista = null;
	public RolServiceImpl() {
		Simple Date
	}

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> buscarTodos() {
        return lista;
    }
    public Rol buscarPorId(Integer idRol) {
        return rolRepository.findById(id).orElse(null);
    }
}
