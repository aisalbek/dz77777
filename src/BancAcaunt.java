import java.util.InputMismatchException;

public class BancAcaunt {
    private int balans;

    public Integer snyat(int a) {
        try {
            if (balans <0||a>balans){
            throw new ArithmeticException();
            }else {
                try {
                    if (a > 20000||a < 0) {
                        throw new ArithmeticException();
                    } else {
                        System.out.println("---------------------------------------------");
                        System.out.println("успешно сняли  сума :" + a);
                        System.out.println("---------------------------------------------");
                        return balans -= a;

                    }
                } catch (ArithmeticException e) {
                    System.out.println("---------------------------------------------");
                    System.out.println("лимить 20000 вы задали другое  число :" + a);
                    System.out.println("---------------------------------------------");
                }
//                try {
//                    if () {
//                        throw new ArithmeticException();
//                    } else {
//                        System.out.println("---------------------------------------------");
//                        System.out.println("успешно сняли сума :" + a);
//                        System.out.println("---------------------------------------------");
//                        return balans -= a;
//                    }
//                } catch (ArithmeticException e) {
//                    System.out.println("---------------------------------------------");
//                    System.out.println("вы задали число менше 0 ваша число" + a);
//                    System.out.println("---------------------------------------------");
//                }
            }
        } catch (ArithmeticException e) {
            System.out.println("---------------------------------------------");
            System.out.println("не недостаточно средства ваш баланс :"+balans);
            System.out.println("---------------------------------------------");
        }
        return null;
    }

    public Integer popolnit(Integer b) {

                try {
                    if (b > 25000||b < 0) {
                        throw new ArithmeticException();
                    } else {
                        System.out.println("---------------------------------------------");
                        System.out.println("успешно пополнили на суму :" + b);
                        System.out.println("---------------------------------------------");
                        return balans += b;

                    }
                } catch (ArithmeticException e) {
                    System.out.println("---------------------------------------------");
                    System.out.println("лимить 25000 вы задали другое  число :" + b);
                    System.out.println("---------------------------------------------");
                }
//                try {
//                    if () {
//                        throw new ArithmeticException();
//                    } else {
//                        System.out.println("---------------------------------------------");
//                        System.out.println("успешно пополнили на суму :" + b);
//                        System.out.println("---------------------------------------------");
//                        return balans += b;
//                    }
//                } catch (ArithmeticException e) {
//                    System.out.println("---------------------------------------------");
//                    System.out.println("вы задали число менше 0 ваша число" + b);
//                    System.out.println("---------------------------------------------");
//                }

        return null;
    }
        public void proverkaBalans () {
            System.out.println("-------------------------------");
            System.out.println("ваш баланс : "+ balans);
            System.out.println("-------------------------------");
        }

}

