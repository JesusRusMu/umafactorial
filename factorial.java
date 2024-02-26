import java.util.Scanner;
public class factorial {
public static long fact(long num) {
long fac = 1;
for (long i=1; i<=num; ++i) {
fac = fac * i;
if (num<=1) {
return 1;
} else {
return num*fact(num-1);
}
return fac;
}
public static void main(String []args) {
Scanner scanInput = new Scanner(System.in);