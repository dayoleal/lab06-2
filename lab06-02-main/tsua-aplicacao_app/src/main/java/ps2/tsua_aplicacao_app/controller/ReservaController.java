package ps2.tsua_aplicacao_app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import ps2.tsua_aplicacao_app.model.Reserva;
import ps2.tsua_aplicacao_app.service.ReservaService;
import java.util.*;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService service;

    @GetMapping
    public List<Reserva> listarTodos() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Reserva> buscarPorId(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Reserva criar(@RequestBody Reserva r) {
        return service.create(r);
    }

    @PutMapping("/{id}")
    public Reserva atualizar(@PathVariable Long id, @RequestBody Reserva r) {
        return service.update(id, r);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }
}
