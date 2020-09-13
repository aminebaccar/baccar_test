package default_package;

import java.util.logging.Logger;

public class MainClazz {

    public Integer multiply(Integer a, Integer b){
        return a * b;
    }

    public Integer add(Integer a, Integer b){
        return a +b;
    }

    public Integer substract(Integer a, Integer b){
        return a - b ;
    }

    public Integer divide(Integer a, Integer b){
        return a / b ;
    }

    public static void main (String[] args){
        Logger logger = Logger.getLogger("");
        logger.info("Hello World!");
//        logger.info(multiply(10,5)+"");
    }
}
