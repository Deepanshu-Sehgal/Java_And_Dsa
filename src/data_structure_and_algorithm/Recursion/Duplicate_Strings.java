package data_structure_and_algorithm.Recursion;

//companies =  google and microsoft
public class Duplicate_Strings {
    public static void main(String[] args) {
        String str = "deepanshu";
        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
    }

    public static void removeDuplicate(String str, int index, StringBuilder newStr, boolean map[]) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            //dubpicates
            removeDuplicate(str, index + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, index + 1, newStr.append(currChar), map);

        }
    }
}
