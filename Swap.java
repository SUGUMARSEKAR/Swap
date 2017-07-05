import java.io.*;
public class Swap
{
public static void main(String args[])throws IOException
{
int i;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();
String  x = " ";
if(str.length()%2==0)
{
for(i=0;i<str.length();i=i+2)
{
x = x + str.charAt(i+1);
x = x + str.charAt(i);
}
}
else
{
for(i=0;i<str.length()-2;i=i+2)
{
x = x + str.charAt(i+1);
x = x + str.charAt(i);
}
x = x + str.charAt(i);
}
System.out.print(x);

}
}
