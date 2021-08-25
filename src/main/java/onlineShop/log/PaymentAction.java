package onlineShop.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//@Component
public class PaymentAction {

    //@Autowired
    private Logger logger;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void pay(BigDecimal payValue) {
        logger.log("pay begin, payValue is " + payValue);
        logger.log("pay end");
    }
}
