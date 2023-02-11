package designpatterns.behavioral.chainOfResponsiblility;

import designpatterns.behavioral.chainOfResponsiblility.model.Numbers;

public interface Chain {
    public void setNextChain(Chain chain);
    public void calculate(Numbers numbers);
}
