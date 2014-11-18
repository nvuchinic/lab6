package lab6;

public class ProvjeraValidnostiJMBG {
public static void main(String[] args) {
	String jmbg = "0209981170071";
//	if(jmbg.charAt(0)==0)
	long suma;
	long R = 0;
     long jmbgLng= Long.parseLong(jmbg);
	long jmbgLng2=jmbgLng;
     long zadnji=jmbgLng%10;
     if(zadnji==0)
    	 jmbgLng=jmbgLng/10;
     else
    	 jmbgLng=jmbgLng-zadnji;
     
    long l=jmbgLng%10;
    jmbgLng=jmbgLng/10;
    long k=jmbgLng%10;
    jmbgLng=jmbgLng/10;
    long j=jmbgLng%10;
    jmbgLng=jmbgLng/10;
    long i=jmbgLng%10;
    jmbgLng=jmbgLng/10;
    long h=jmbgLng%10;
    jmbgLng=jmbgLng/10;
    long g=jmbgLng%10;
    jmbgLng=jmbgLng/10;
    long f=jmbgLng%10;
    jmbgLng=jmbgLng/10;
    long e =jmbgLng%10;
    jmbgLng=jmbgLng/10;
    long d=jmbgLng%10;
    jmbgLng=jmbgLng/10;
    long c=jmbgLng%10;
    jmbgLng=jmbgLng/10;
    long b =jmbgLng%10;
    jmbgLng=jmbgLng/10;
    
    if(jmbg.charAt(0)=='0') {
    	  suma = 0+6*b+5*c+4*d+3*e+2*f+7*g+6*h+5*i+4*j+3*k+2*l;
    R=suma%11; }
    else {
    	Character prvi = new Character(jmbg.charAt(0));
    	  String prviS = prvi.toString();
    	  int prviI = Integer.parseInt(prviS);
    	  int a=prviI;
    	  suma = 7*a+6*b+5*c+4*d+3*e+2*f+7*g+6*h+5*i+4*j+3*k+2*l;
    	    R=suma%11;
    	  }
    System.out.print(R);
}
}
