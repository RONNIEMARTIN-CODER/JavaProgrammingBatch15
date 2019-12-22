package day32;

public class StringActions {

    public static void main(String[] args) {

        // reversePrintMyOwnName() ;
        printStringWithDashInBetween("Ronnie" ) ;
        printStringWithDashInBetween("Tiffany");
        printStringWithDashInBetween("Constance");
        printStringWithDashInBetween("Cassidy");


    }
//                Create below static void methods :
//                and call them in main method to test.
//                reversePrintMyOwnName
//
//        * create a method that has 1 String parameter called name
//                and print that name in reversed order
//                        printLastCharacterOfName
//        * create a method that has 1 String parameter called name
//                and print last character of that name
//                        printFullNameInformation
//        * create a method that has 2 String parameter called firstName,lastName
//                and print "Your first name is firstName , Your last Name is lastName
//                print " your full name lenth is lengthOfTheFullName"
//                compareNameCharacterCount
//                        * create a method that has 2 String parameter called name1,name2
//                if name 1 has more characters
//                print " name 1 is longer "
//                if name 2 has more characters
//                print " name 2 is longer "
//                if name 2 has same character count
//                print " name 1 and name 2 same character count "
//                printAtoZ
//                        * create a method that has no parameter
//                and print A-Z in one line
//                        printZtoA
//        * create a method that has no parameter
//                and print Z-A in one line
//                        printAlphabetInRange
//        * create a method that have 2 char as parameters: beginning, ending
//                if beginning character is before ending character
//                for example beginning A , ending D  -->> ABCD
//                if beginning character is after ending character
//                for example beginning D , ending A  -->> DCBA


    //   * create a method that has no parameter
//                and print your name in reversed order
//                        reversePrintAnyName
    public static void reversePrintAnyName() {
        String name = "Ronnie";
        String reverseName = "";
        for (int x = name.length() - 1; x >= 0; x--) {
            reverseName = reverseName + name.charAt(x);
        }
        System.out.println(reverseName);
    }

    public static void printStringWithDashInBetween(String name) {

        String name1 = "Ronnie";
        for (int x = 0; x < name.length(); x++) {
            System.out.print(name.charAt(x));
            // if I am not at last index the I print
            if (x != name.length() - 1) {
                System.out.print("-");
            }

        }
        System.out.println();


    }


}
