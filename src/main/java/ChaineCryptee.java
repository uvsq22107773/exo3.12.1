import java.util.Scanner;

public class ChaineCryptee {
    private String SS;
    private int CLE;

    ChaineCryptee(String s, int cle){
        this.SS=s;
        this.CLE=cle;

        if (this.SS==""){
            System.out.println("la chaine est NULL");
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
        System.out.println("DeCrypted cle "+chaine.CLE+" : "+chaine.decrypte(cipher));

    }
    String decrypte(String s){
        int cle = -this.CLE;
        String newstring = "";
        for (int i=0 ; i<s.length();i++){
            newstring = newstring + decaleCaractere(s.charAt(i),cle);
        }
        return newstring;
    }
    String crypte(){
        String newstring = "";
        for (int i=0 ; i<this.SS.length();i++){
            newstring = newstring + decaleCaractere(this.SS.charAt(i),this.CLE);
        }
        return newstring;
    }
    private static char decaleCaractere(char c, int decalage) {
        return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    }

}
