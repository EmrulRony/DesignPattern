package topics.behavioral.chainOfResponsiblility;

import topics.behavioral.chainOfResponsiblility.ChainImpls.AddNumber;
import topics.behavioral.chainOfResponsiblility.ChainImpls.MultNumber;
import topics.behavioral.chainOfResponsiblility.ChainImpls.SubNumber;
import topics.behavioral.chainOfResponsiblility.model.Numbers;

public class Main {
    public static void main(String[] args) {
        Numbers request = new Numbers(20,10, "mult");

        Chain add = new AddNumber();
        Chain sub = new SubNumber();
        Chain mult = new MultNumber();

        add.setNextChain(sub);
        sub.setNextChain(mult);

        add.calculate(request);

    }
}
