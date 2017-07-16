package player;
import java.util.Scanner;
public class set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the String");
Scanner s=new Scanner(System.in);
int l;
String a,b[];
a=s.next();
b=a.split("");
l=a.length();
for(int i=0;i<l;i++){
	for(int j=i+1;j<l;j++){
		if(b[i]!=(b[j])){
			System.out.println(b[j]);
		}
	}
}
	}

}
