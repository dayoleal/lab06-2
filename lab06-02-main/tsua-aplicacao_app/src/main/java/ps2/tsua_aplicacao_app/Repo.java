package ps2.tsua_aplicacao_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repo {

    public static class Registro {
        private String id;
        private String dados;

        public Registro(String id, String dados) {
            this.id = id;
            this.dados = dados;
        }

        public String getId() {
            return id;
        }

        public String getDados() {
            return dados;
        }

        public void setDados(String dados) {
            this.dados = dados;
        }

        @Override
        public String toString() {
            return "ID: " + id + " | Dados: " + dados;
        }
    }

    private final List<Registro> registros = new ArrayList<>();
    private int contadorId = 1;

    // Listar todos
    public void listarTodos() {
        if (registros.isEmpty()) {
            System.out.println("Nenhum registro encontrado.");
        } else {
            registros.forEach(System.out::println);
        }
    }

    // Buscar por dado ou ID
    public void buscar(String dado) {
        boolean encontrado = false;
        for (Registro r : registros) {
            if (r.getId().equals(dado) || r.getDados().contains(dado)) {
                System.out.println(r);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum registro encontrado.");
        }
    }

    // Criar novo registro
    public void criar(String dados) {
        String id = String.valueOf(contadorId++);
        registros.add(new Registro(id, dados));
        System.out.println("Registro criado com ID: " + id);
    }

    // Alterar registro
    public void alterar(String id, String novosDados) {
        Optional<Registro> registroOpt = registros.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst();

        if (registroOpt.isPresent()) {
            registroOpt.get().setDados(novosDados);
            System.out.println("Registro alterado com sucesso!");
        } else {
            System.out.println("Registro não encontrado.");
        }
    }

    // Apagar registro
    public void apagar(String id) {
        boolean removed = registros.removeIf(r -> r.getId().equals(id));
        if (removed) {
            System.out.println("Registro removido com sucesso!");
        } else {
            System.out.println("Registro não encontrado.");
        }
    }
}
