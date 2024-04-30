package padroes_comportamentais;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import padroes_comportamentais.command.Client;
import padroes_comportamentais.command.SignStreaming;
import padroes_comportamentais.command.Streaming;
import padroes_comportamentais.command.Subscription;

public class ClientTest {

    Streaming stream;
    Client client;

    @BeforeEach
    void setUp() {
        stream = new Streaming("Netflix", 45);
        client = new Client();
    }

    @Test
    void shouldSignStream() {
        Subscription openStreaming = new SignStreaming(stream, "Sign");
        client.addSubs(openStreaming);

        assertEquals("Sign Streaming", stream.getStatus());
    }

    @Test
    void shouldCancelStream() {
        Subscription openStreaming = new SignStreaming(stream, "Cancel");
        client.addSubs(openStreaming);
        client.removeLastSub();

        assertEquals("Cancel Streaming", stream.getStatus());
    }

}
