package ps2.tsua_aplicacao_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ps2.tsua_aplicacao_app.model.Hospede;

@Repository
public interface HospedeRepository extends JpaRepository<Hospede, Long> {
}
