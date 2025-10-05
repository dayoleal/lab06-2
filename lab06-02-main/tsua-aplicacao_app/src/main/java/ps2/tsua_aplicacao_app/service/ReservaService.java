package ps2.tsua_aplicacao_app.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import ps2.tsua_aplicacao_app.model.Reserva;
import ps2.tsua_aplicacao_app.repository.ReservaRepository;
import java.util.*;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repo;

    public List<Reserva> getAll() {
        return repo.findAll();
    }

    public Optional<Reserva> getById(Long id) {
        return repo.findById(id);
    }

    public Reserva create(Reserva r) {
        return repo.save(r);
    }

    public Reserva update(Long id, Reserva r) {
        if (repo.existsById(id)) {
            r.setId(id);
            return repo.save(r);
        }
        return null;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
