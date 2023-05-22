package Course;

public class New_Java_Class {
    public static void main(String[] args) {
        System.out.println(Math.min(88, 15));/**afiseaza numarul minimal. Accepta doar 2 numere**/
        System.out.println(Math.max(88, 15));/**afiseaza numarul maximal. Accepta doar 2 numere**/
        System.out.println(Math.sqrt(25)); /**sqrt socoate radicalul din numarul indicat**/
        System.out.println(Math.abs(88)); /**modulul absolut al numarului indicat in paranteze**/
        System.out.println(Math.pow(4, 2)); /**inmulteste primul numar indicat (4) la puterea numarului indicat al doilea (2) >> adica 4 la puterea a 2**/
        System.out.println(Math.random());/**genereaza un numar intimplator in diapazonul de la 0 la 1**/
        System.out.println(Math.random() * 100);

        /**-------------------------------------------------------------------**/

        int age = 19;
        if (age >= 18) {
            System.out.println("Esti adult");
        } else {
            System.out.println("Asteapta 18");
        }
        /**-------------------------------------------------------------------**/

        String position = "QA Automation";
        if (position.equals("QA Automation")) {
            System.out.println("Avem nevoie de tine");
        } else if (position.equals("Java developer")) {
            System.out.println("QA Automation is best");
        } else if (position.equals("HR")) {
            System.out.println("Cautam QA Autmation");
        } else {
            System.out.println("Noi nu avem asa pozitie");
        }

        /**-------------------------------------------------------------------**/
        String company = "MAIB";
        switch (company) {
            case "MAIB":
                System.out.println("Best bank");
                break;
            case "Alied Testind":
                System.out.println("Main focus of QA");
                break;
            case "EST Computer":
                System.out.println("Main focus of Frontend");
                break;
            default:
                System.out.println("This company not existed");
        }

        /**-------------------------------------------------------------------**/
        String day = "Sambata";
        switch (day) {
            case "Luni":
                System.out.println("Zi de lucru Nr.1");
                break;
            case "Marti":
                System.out.println("Zi de lucru Nr.2");
                break;
            case "Miercuri":
                System.out.println("Zi de lucru Nr.3");
                break;
            case "Joi":
                System.out.println("Cursuri MAIB QA Automation + Zi de lucru Nr.4");
                break;
            case "Vineri":
                System.out.println("Zi de lucru remote Nr.5");
                break;
            case "Sambata":
                System.out.println("Cursuri MAIB QA Automation + Zi de odihna");
                break;
            case "Duminica":
                System.out.println("Zi de odihna");
                break;
            default:
                System.out.println("This day not existed");
        }
        /**-------------------------------------------------------------------**/

        String day2 = "Vineri";
        switch (day2) {
            case "Luni":
            case "Marti":
            case "Miercuri":
            case "Vineri":
                System.out.println("Zi de lucru");
                break;
            case "Joi":
            case "Sambata":
                System.out.println("Cursuri MAIB QA Automation");
                break;
        }

        /**-------------------------------------------------------------------**/
        int i = 10;
        while (i < 15) {
            System.out.println(i);
            i++;
        }

        /**-------------------------------------------------------------------**/

        int j = 10;
        do {
            i++;
            System.out.println(j);
        }
        while (j > 13);
    }
}

