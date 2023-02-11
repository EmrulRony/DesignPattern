package designpatterns.behavioral.chainOfResponsiblility;

import designpatterns.behavioral.chainOfResponsiblility.ChainImpls.AddNumber;
import designpatterns.behavioral.chainOfResponsiblility.ChainImpls.MultNumber;
import designpatterns.behavioral.chainOfResponsiblility.ChainImpls.SubNumber;
import designpatterns.behavioral.chainOfResponsiblility.model.Numbers;

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
