public class ChaineCryptee {
    ChaineCryptee(String s, int cle){
        String S=s;
        int CLE=cle;

        if (s==""){
            System.out.println("la chaine est NULL");
        }
        if (cle==0){
            System.out.println("cle egale a zero ");
        }
    }
    public static void main(String[] args) {
        String s = "ABCDEFGH";
        int cle = 2 ;
        ChaineCryptee chaine = new ChaineCryptee(s,cle);
        System.out.println("String : "+s);
        String cipher = chaine.crypte(s,cle);
        System.out.println("Crypted cle "+cle+" : "+cipher);
        System.out.println("DeCrypted cle "+cle+" : "+chaine.decrypte(cipher,cle));

    }
    static String decrypte(String s, int cle){
        cle = -cle;
        String newstring = "";
        for (int i=0 ; i<s.length();i++){
            newstring = newstring + decaleCaractere(s.charAt(i),cle);
        }
        return newstring;
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
