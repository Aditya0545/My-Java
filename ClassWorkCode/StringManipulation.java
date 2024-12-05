/**
 * StringManipulation
 */
public class StringManipulation {

    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("Object Language");
        System.out.println("Original String = "+str);
        int n = str.length();
        System.out.println("Length of String: "+n);
        for(int i = 0; i < n; i++) {
            int p = i+1;
            System.out.println("Character at position: "+p+" is "+str.charAt(i));
        }

        String astring = new String(str.toString());
        int pos = astring.indexOf("Language");
        str.insert(pos, "Oriented");
        System.out.println("Modified String: "+str);

        str.setCharAt(6, '_');
        System.out.println("String New: "+str);

        str.append(" Improves Security");
        System.out.println("Appended String: "+str);
    }
}