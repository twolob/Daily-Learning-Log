package DSA.LinearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String myName = "Thomas";
        char letter = 'm';
        searchingString(myName, letter);
        System.out.println("Index: " + searchIndex(myName, letter));
    }

    static void searchingString(String myName, char letter){
        if(myName.length() == 0){
            System.out.println("Not found!");
            return;
        }
        for (int i : myName.toCharArray()){
            if (i == letter){
                System.out.println("Found!");
                return;
            }
        }
        System.out.println("Not found!");
    }

    static int searchIndex(String myName, char letter){
        if (myName.length() == 0){
            return -1;
        }
        for (int index = 0; index < myName.length(); index++){
            if (myName.charAt(index) == letter){
                return index;
            }
        }
        return -1;
    }
}
