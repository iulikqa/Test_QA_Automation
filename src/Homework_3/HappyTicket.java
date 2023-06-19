package Homework_3;

// 1) Счастливый билет". Где сумма первых трех цифр равна сумме трех последних в 6-ти значном числе.(использовать масив и методы)
public class HappyTicket {
    public static void main(String[] args) {
        int ticketNumber = 123006;

        if (isHappyTicket(ticketNumber)) {
            System.out.println("У тебя счастливый билет! :)");
        } else {
            System.out.println("У тебя несчастливый билет :(");
        }
    }

    public static boolean isHappyTicket(int ticketNumber) {
        int[] digits = new int[6];

        for (int i = 5; i >= 0; i--) {
            digits[i] = ticketNumber % 10;
            ticketNumber /= 10;
        }

        int sumFirstThree = digits[0] + digits[1] + digits[2];
        int sumLastThree = digits[3] + digits[4] + digits[5];

        return sumFirstThree == sumLastThree;
    }
}
