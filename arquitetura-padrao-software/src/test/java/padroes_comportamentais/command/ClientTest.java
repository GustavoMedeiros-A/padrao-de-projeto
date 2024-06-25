package padroes_comportamentais.command;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClientTest {

    Streaming stream;
    Client client;
    SignStreaming signStreaming;

    @BeforeEach
    void setUp() {
        stream = new Streaming("Netflix", 45);
        client = new Client();
        signStreaming = new SignStreaming(stream, "Sign");
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

    @Test
    void shouldNotRemoveFromEmptySubList() {
        client.removeLastSub();
        // No exception should be thrown and nothing should happen
        assertTrue(client.subs.isEmpty());
    }

    @Test
    void shouldAddMultipleSubscriptions() {
        Subscription signStreaming1 = new SignStreaming(stream, "Sign");
        Subscription signStreaming2 = new SignStreaming(stream, "Sign");
        client.addSubs(signStreaming1);
        client.addSubs(signStreaming2);

        assertEquals(2, client.subs.size());
    }

    @Test
    void shouldRemoveOnlyLastSubscription() {
        Streaming stream2 = new Streaming("Hulu", 30);
        Subscription signStreaming1 = new SignStreaming(stream, "Sign");
        Subscription signStreaming2 = new SignStreaming(stream2, "Sign");
        client.addSubs(signStreaming1);
        client.addSubs(signStreaming2);

        client.removeLastSub();

        assertEquals(1, client.subs.size());
        assertEquals("Sign Streaming", stream.getStatus());
        assertEquals("Cancel Streaming", stream2.getStatus());
    }

    @Test
    void shouldSignStreamStream() {
        signStreaming.sign();
        assertEquals("Sign Streaming", stream.getStatus());
    }

    @Test
    void shouldCancelStreamStream() {
        signStreaming.cancel();
        assertEquals("Cancel Streaming", stream.getStatus());
    }

    @Test
    void shouldSetStatus() {
        signStreaming.setStatus("Active");
        assertEquals("Active", signStreaming.getStatus());
    }

    @Test
    void shouldGetStatus() {
        signStreaming.setStatus("Inactive");
        assertEquals("Inactive", signStreaming.getStatus());
    }

    @Test
    void shouldLogSign() {
        signStreaming.logs("Sign");
        assertEquals("Sign", signStreaming.getStatus());
    }

    @Test
    void shouldLogCancel() {
        signStreaming.logs("Cancel");
        assertEquals("Cancel", signStreaming.getStatus());
    }

    @Test
    void shouldReturnName() {
        assertEquals("Netflix", stream.getName());
    }

    @Test
    void shouldSignStreaming() {
        stream.signStreaming();
        assertEquals("Sign Streaming", stream.getStatus());
    }

    @Test
    void shouldCancelStreaming() {
        stream.cancelStreaming();
        assertEquals("Cancel Streaming", stream.getStatus());
    }

}
