package topics.behavioral.chainOfResponsiblility.ChainImpls;

import topics.behavioral.chainOfResponsiblility.Chain;
import topics.behavioral.chainOfResponsiblility.model.Numbers;

public class AddNumber implements Chain {
    private Chain nextChain;
    @Override
    public void setNextChain(Chain chain) {
        this.nextChain = chain;
    }

    @Override
    public void calculate(Numbers numbers) {
        if (numbers.getCalculationMethod() == "add"){
            System.out.println(
                    numbers.getNumber_1() + " + " + numbers.getNumber_2()
                            + " = " + (numbers.getNumber_1() + numbers.getNumber_2())
            );
        } else {
            nextChain.calculate(numbers);
        }
    }
}
