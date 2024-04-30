package padroes_comportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public List<Subscription> subs = new ArrayList<Subscription>();

    public void addSubs(Subscription aSub) {
        this.subs.add(aSub);
        aSub.sign();
    }

    public void removeLastSub() {
        if (this.subs.size() != 0) {
            var lastSub = this.subs.get(this.subs.size() - 1);
            lastSub.cancel();
            this.subs.remove(lastSub);
        }
    }

}
