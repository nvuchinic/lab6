package lab6;

public class JMBG {
public static void main(String[] args) {
	String jmbg="0209981234567";
	String substringDat=jmbg.substring(0, 7);
//	System.out.print(substringDat);
	String subsDan=jmbg.substring(0,2);
	String subsMjesec=jmbg.substring(2,4);
	String subsGod=jmbg.substring(4,7);
	String subsReg=jmbg.substring(7,9);
	System.out.print("Datum rodjenja: "+subsDan+"."+subsMjesec+"."+1+subsGod+"\nRegija: "+subsReg);

}
}
