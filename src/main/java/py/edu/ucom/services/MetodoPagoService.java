package py.edu.ucom.services;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import py.edu.ucom.config.IDAO;
import py.edu.ucom.entities.MetodoPago;
import py.edu.ucom.repositories.MetodoPagoRepository;

@ApplicationScoped
public class MetodoPagoService implements IDAO<MetodoPago,Integer> {
    @Inject
    private MetodoPagoRepository repository;

    @Override
    public MetodoPago obtener(Integer param) {
        // TODO Auto-generated method stub
        return this.repository.findById(param).orElse(null);
    }

    @Override
    public MetodoPago agregar(MetodoPago param) {
        // TODO Auto-generated method stub
        return this.repository.save(param);
    }

    @Override
    public MetodoPago modificar(MetodoPago param) {
        // TODO Auto-generated method stub
        return this.repository.save(param);
    }

    @Override
    public void eliminar(Integer param) {
        // TODO Auto-generated method stub

        this.repository.deleteById(param);
    }

    @Override
    public List<MetodoPago> listar() {
        return this.repository.findAll();
    }
    
}
