package padroes_comportamentais.mediador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    void shouldComplimentEmployee() {
        var client = new Client();

        assertEquals(
                "Support thanks for the message. The employee's thanks. Client message is The employee thanks  Ótimo atendimento",
                client.compliment("Ótimo atendimento"));
    }

    @Test
    void shouldComplianEmployee() {
        var client = new Client();

        assertEquals(
                "Support thanks for the message. The employee's will improve The employee will improve. Client message is The employee will improve you workPéssimo atendimento",
                client.complian("Péssimo atendimento"));
    }

    @Test
    void shouldRequestEmployee() {
        var client = new Client();

        assertEquals(
                "Support thanks for the message. The employee's will make this. Client message is The employee will make the request Faça isso",
                client.request("Faça isso"));
    }
}
