public class ChaineCryptee {
    ChaineCryptee(String s, int cle){
        if (s==""){
            System.out.println("String est NULL");
        }
    }
    public static void main(String[] args) {
        String s = "ABCDEFGH";
        int cle = 2 ;
        ChaineCryptee chaine = new ChaineCryptee(s,cle);
        System.out.println("String : "+s);
        System.out.println("Crypted cle "+cle+" : "+chaine.crypte(s,cle));

    }
    static String decrypte(String s, int cle){
        return null;
    }
    static String crypte(String s, int cle){
        String newstring = "";
        for (int i=0 ; i<s.length();i++){
            newstring = newstring + decaleCaractere(s.charAt(i),cle);
        }
        return newstring;
    }
    private static char decaleCaractere(char c, int decalage) {
        return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    }

}
