public class Main {
    public static void main(String[] args) {
        String name = "seth";
        String surname = "rogen";

        System.out.println("Name length: " + name.length());
        System.out.println("Surname length: " + surname.length());

        if (name.length() > surname.length()) {
            System.out.println(name.length());
        } else if (surname.length() > name.length()) {
            System.out.println("pavarde ilgese");
        } else {
            System.out.println("ilgis toks pat");
        }

        System.out.println("2 uzduotis");

        String name1 = "Leonardo";
        String surname1 = "davinci";
        System.out.println(name1.toUpperCase());
        System.out.println(surname1.toLowerCase());

        System.out.println("3 uzduotis");
        String name2 = "Leonardo";
        String surname2 = "davinci";
        char pirmaVardoR = name2.charAt(0);
        char pirmapavarR = surname2.charAt(0);

        System.out.println(pirmaVardoR);
        System.out.println(pirmapavarR);

        System.out.println("4 uzduotis");
        String trysR = name2.substring(name2.length()-3) + surname2.substring(surname2.length()-3);
        System.out.println(trysR);

        System.out.println("5 uzduotis");
        String pvz = "An American in Paris";
        String rplc = pvz.replaceAll("[A-Z]", "*");
        System.out.println(rplc);

        System.out.println("6 uzduotis");
        String del = pvz.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "").replace("y", "").replace("A", "").replace("E", "").replace("I", "").replace("O", "").replace("U", "").replace("Y", "");
        System.out.println(del);
        String pvz2 = "Breakfast at Tiffany's";
        String del2 = pvz2.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "").replace("y", "").replace("A", "").replace("E", "").replace("I", "").replace("O", "").replace("U", "").replace("Y", "");
        System.out.println(del2);
        String pvz3 = "2001: A Space Odyssey” ir “It's a Wonderful Life";
        String del3 = pvz3.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "").replace("y", "").replace("A", "").replace("E", "").replace("I", "").replace("O", "").replace("U", "").replace("Y", "");
        System.out.println(del3);

















    }
}