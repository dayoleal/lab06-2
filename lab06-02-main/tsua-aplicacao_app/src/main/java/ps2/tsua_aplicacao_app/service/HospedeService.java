package ps2.tsua_aplicacao_app.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import ps2.tsua_aplicacao_app.model.Hospede;
import ps2.tsua_aplicacao_app.repository.HospedeRepository;
import java.util.*;

@Service
public class HospedeService {

    @Autowired
    private HospedeRepository repo;

    public List<Hospede> getAll() {
        return repo.findAll();
    }

    public Optional<Hospede> getById(Long id) {
        return repo.findById(id);
    }

    public Hospede create(Hospede h) {
        return repo.save(h);
    }

    public Hospede update(Long id, Hospede h) {
        if (repo.existsById(id)) {
            h.setId(id);
            return repo.save(h);
        }
        return null;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
