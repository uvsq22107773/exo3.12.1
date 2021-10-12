import java.util.Scanner;

public class ChaineCryptee {
    private String SS,C;
    private int CLE;

    ChaineCryptee(String s, int cle){
        this.SS=s;
        this.CLE=cle;

        if (this.SS==null){
            System.out.println("la chaine est NULL");
            this.SS="";
        }

        if (this.CLE==0){
            System.out.println("cle egale a zero ");
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Chaine : ");

        ChaineCryptee chaine = new ChaineCryptee(myObj.nextLine(),2);

        System.out.println("String : "+chaine.SS);
        String cipher = chaine.crypte();
        System.out.println("Crypted cle "+chaine.CLE+" : "+cipher);
        System.out.println("DeCrypted cle "+chaine.CLE+" : "+chaine.decrypte());

        System.out.println("\n==================\n");
        chaine = deCryptee("ABC",2);
        System.out.println("String : "+chaine.SS);

        String c = chaine.crypte();
        chaine = deEnClair(c,2);
        System.out.println("Crypted : "+c);


    }
    String decrypte(){
        int cle = -this.CLE;
        String newstring = "";
        for (int i=0 ; i<this.C.length();i++){
            newstring = newstring + decaleCaractere(this.C.charAt(i),cle);
        }
        return newstring;
    }
    String crypte(){
        String newstring = "";
        for (int i=0 ; i<this.SS.length();i++){
            newstring = newstring + decaleCaractere(this.SS.charAt(i),this.CLE);
        }
        this.C = newstring;
        return newstring;
    }
    private static char decaleCaractere(char c, int decalage) {
        return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    }

    public static ChaineCryptee deCryptee(String crypted, int K){
        return new ChaineCryptee(crypted,K);
    }
    public static ChaineCryptee deEnClair(String decrypted, int K){
        return new ChaineCryptee(decrypted,K);
    }

}
