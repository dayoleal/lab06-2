package ps2.tsua_aplicacao_app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import ps2.tsua_aplicacao_app.model.Hospede;
import ps2.tsua_aplicacao_app.service.HospedeService;
import java.util.*;

@RestController
@RequestMapping("/api/hospedes")
public class HospedeController {

    @Autowired
    private HospedeService service;

    @GetMapping
    public List<Hospede> listarTodos() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Hospede> buscarPorId(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Hospede criar(@RequestBody Hospede h) {
        return service.create(h);
    }

    @PutMapping("/{id}")
    public Hospede atualizar(@PathVariable Long id, @RequestBody Hospede h) {
        return service.update(id, h);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }
}
