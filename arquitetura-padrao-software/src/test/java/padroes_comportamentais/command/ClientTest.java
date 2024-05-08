package padroes_comportamentais.command;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
