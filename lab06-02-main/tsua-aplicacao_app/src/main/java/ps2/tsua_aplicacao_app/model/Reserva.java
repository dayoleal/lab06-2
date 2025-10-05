package ps2.tsua_aplicacao_app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hospede_id")
    private Long hospedeId;

    private String dataCheckIn;

    public Reserva() {}

    public Reserva(Long id, Long hospedeId, String dataCheckIn) {
        this.id = id;
        this.hospedeId = hospedeId;
        this.dataCheckIn = dataCheckIn;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getHospedeId() { return hospedeId; }
    public void setHospedeId(Long hospedeId) { this.hospedeId = hospedeId; }

    public String getDataCheckIn() { return dataCheckIn; }
    public void setDataCheckIn(String dataCheckIn) { this.dataCheckIn = dataCheckIn; }
}
