import java.util.Scanner;
public class Calculator{
static int power(int x,int n){
if(n == 0){
return 1;
}
if(x == 0){
return 0;
}
return x *= power(x, n-1);
}
public static void main(String[] args){
// Create new calculator
System.out.println("Calculator Program ");
// no. of operations
System.out.println("Number of operations to perform :\n1.Arithmatic Operation \n2.Trigonometry Operation \n3.AngularOperation \n4 Logrithmic Operation \n5.Maximum \n6.Minimum\n7.Squre root \n8.Cube root \n9.Absolute \n10.Round off\n11.Random \n12. Factorial \n13.Power of X^n \n14.Grade operator");
System.out.print("Enter number of operators : ");
Scanner scan = new Scanner(System.in);
int operation = scan.nextInt();
switch(operation/1){
case 1:
// Arithmatic operations
System.out.println("Number of operator to perform :\n1.Addition \n2.Subtraction\n3.Multiplication\n4.Dividion\n5.Modulus \n6.Percentage");
System.out.print("Enter number of operator : ");
int Arithmatic_operator = scan.nextInt();
if(Arithmatic_operator==1){
// Addition
System.out.println("Addition ");
System.out.print("How many number you want to enter : ");
int row = scan.nextInt();
double add[] = new double[row];
for(int i=0;i<row;i++){
System.out.print("Enter number "+(i+1)+" :");
add[i] = scan.nextDouble();
}
double sum = 0;
for(int j =0;j<row;j++){
sum += add[j];
}
System.out.println("Sum of numbers : "+sum );
}
else if(Arithmatic_operator == 2){
//Subtraction
System.out.println("Subtraction");
System.out.print("How many number you want to enter : ");
int row1 = scan.nextInt();
double sub[] = new double[row1];
for(int i= 0;i<row1;i++){
System.out.print("Enter number "+(i+1)+" :");
sub[i] = scan.nextDouble();
}
double subtraction =0;
for(int j=0;j<row1;j++){
subtraction -= sub[j];
}
System.out.println("Subtraction of numbers :"+subtraction);
}
else if(Arithmatic_operator==3){
// Multiplication
System.out.println("Multiplication");
System.out.print("How many numbers you want to enter : ");
int row2 = scan.nextInt();
double mult[] = new double[row2];
for(int i = 0;i<row2;i++){
System.out.print("Enter number "+(i+1)+" :");
mult[i] = scan.nextDouble();
}
double multiplication = 1;
for(int j=0;j<row2;j++){
multiplication *= mult[j];
}
System.out.println("Multiplication of numbers :"+multiplication);
}
else if(Arithmatic_operator ==4){
// Dividion
System.out.println("Dividion");
System.out.print("How many numbers you want to enter : ");
int row3 = scan.nextInt();
double div[] = new double[row3];
for(int i= 0;i<row3;i++){
System.out.print("Enter number "+(i+1)+" :");
div[i] = scan.nextDouble();
}
double divion =1;
for(int j=row3-1;j>=0;j--){
// double num = div[j];
divion /=div[j];
}
System.out.println("Dividion : "+divion);
}
else if (Arithmatic_operator == 5){
// Modules
System.out.println("Modules operator ");
System.out.print("Enter number 1 : ");
int num1 = scan.nextInt();
System.out.print("Enter number 2 : ");
int num2 = scan.nextInt();
int mod = num1%num2;
System.out.println("Modulos of "+num1+" % "+num2
+" : "+mod);
}
else if( Arithmatic_operator == 6){
// Percentage
System.out.println("Percentage operator ");
System.out.print("Enter number : ");
double num3 = scan.nextDouble();
System.out.print("Enter total number : ");
double num4 = scan.nextDouble();
double perct = (num3*100)/num4;
System.out.println("Percentage of "+perct+"%");
}
else{
System.out.println("Wrong Input ");
}
break;
case 2:
// Trigonometry operation
System.out.println("Trigonometry Operation to perform\n1.sin\n2.cos\n3.tan\n4.cosce\n5.sec\n6.cot");
System.out.print("Enter the number of operator : ");
int trigonometric_Operator = scan.nextInt();
if(trigonometric_Operator == 1){
System.out.println("Sin operator ");
System.out.print("Enter number : ");
double num5 = scan.nextDouble();
double radian = Math.toRadians(num5);
System.out.println("Sin of number :"+(Math.sin(radian)));
}
else if(trigonometric_Operator == 2){
System.out.println("Cos operator ");
System.out.print("Enter number : ");
double num6 = scan.nextDouble();
double radian = Math.toRadians(num6);
System.out.println("Cos of number :"+(Math.cos(radian)));
}
else if(trigonometric_Operator == 3){

System.out.println("Tan operator ");
System.out.print("Enter number : ");
double num7 = scan.nextDouble();
double radian = Math.toRadians(num7);
System.out.println("Tan of number :"+(Math.tan(radian)));
}
else if( trigonometric_Operator == 4){
System.out.println("Cosec operator ");
System.out.print("Enter number : ");
double num8 = scan.nextDouble();
double radian = Math.toRadians(num8);
System.out.println("Cosec of number :"+(1/(Math.sin(radian))));
}
else if( trigonometric_Operator == 5){
System.out.println("Sec operator ");
System.out.print("Enter number : ");
double num9 = scan.nextDouble();
double radian = Math.toRadians(num9);
System.out.println("Sec of number :"+(1/(Math.cos(radian))));
}
else if( trigonometric_Operator == 6){
System.out.println("Cot operator ");
System.out.print("Enter number : ");
double num10 = scan.nextDouble();
double radian = Math.toRadians(num10);
System.out.println("Cot of number :"+(1/(Math.tan(radian))));
}
else{
System.out.println("Wrong Input ");
}
break;
case 3:
// Angular Operator
System.out.println("Operation to perfrom : \n1.Number todegree \n2.Number to Radian ");
System.out.print("Enter number of operator : ");
int angular_Operator = scan.nextInt();
if( angular_Operator == 1){
System.out.println("Number to degree ");
System.out.print("Enter number : ");
double num11 = scan.nextDouble();
System.out.println("Degree from :"+(Math.toDegrees(num11)));
}
else if( angular_Operator == 2){
System.out.println("Number to Radian ");
System.out.print("Enter number : ");
double num12 = scan.nextDouble();

System.out.println("Radians of number "+num12+":"+(Math.toRadians(num12)));
}
else{
System.out.println("Wrong Input");
}
break;
case 4 :
// Logrithmic Operation
System.out.println("Enter number of operation to perform :\n1.log\n2.log10");
System.out.print("Enter number of operator : ");
int logrithmic_Operator = scan.nextInt();
if( logrithmic_Operator == 1){
System.out.println("Log operator ");
System.out.print("Enter number : ");
double num13 = scan.nextDouble();
System.out.println("Log of number "+num13+" :"+(Math.log(num13)));
}
else if( logrithmic_Operator == 2){
System.out.println("Log10 operator ");
System.out.print("Enter number : ");
double num14= scan.nextDouble();
System.out.println("Log10 of number "+num14+" :"+(Math.log10(num14)));
}
else{
System.out.println("wrong input");
}
break;
case 5:
// Maximum
System.out.println("Miximum operator ");
System.out.print("how many number you want to enter : ");
int row2 = scan.nextInt();
double max[] = new double[row2];
for(int i =0;i<row2;i++){
System.out.print("Enter number "+(i+1)+" : ");
max[i] = scan.nextDouble();
}
// max
double Max = max[0];
for(int j=0;j<max.length;j++){
if(max[j]>Max){
Max = max[j];
}
}
System.out.println("Maximum number : "+Max);
break;
case 6:
// Minimum
System.out.println("Minimum operator ");
System.out.print("How many number you want to enter : ");
int row3 = scan.nextInt();
double min[] = new double[row3];
for(int i= 0;i<row3;i++){
System.out.print("Enter number "+(i+1)+" : ");
min[i] = scan.nextDouble();
}
//min
double Min = min[0];
for(int i= 0;i<min.length;i++){
if(min[i]<Min){
Min = min[i];
}
}
System.out.println("Minimum number : "+Min);
break;
case 7:
// square root
System.out.println("Square operator ");
System.out.print("Enter number : ");
double num15 = scan.nextDouble();
System.out.println("Squre root of number "+num15+":"+(Math.sqrt(num15)));
break;
case 8:
// Cube root
System.out.println("Cube operator ");
System.out.print("Enter number : ");
double num16 = scan.nextDouble();
System.out.println("Cube root of number "+num16+" :"+(Math.cbrt(num16)));
break;
case 9:
// Absolute
System.out.println("Absolute operator ");
System.out.print("Enter number : ");
double num17 = scan.nextDouble();
System.out.println("Absolute value of "+(num17)+" :"+(Math.abs(num17)));
break;
case 10 :
// round off
System.out.println("Round Off operrator ");
System.out.print("Enter value : ");
double num18 = scan.nextDouble();
System.out.println("Round off of number"+(num18)+" :"+(Math.round(num18)));
break;
case 11:
// Random
System.out.println("Random operator ");
System.out.print("Random value "+Math.random());
break;
case 12 :
// Factorial
System.out.println("Factorial operator ");
System.out.print("Enter value : ");
int num19 = scan.nextInt();
int fact = 1;
for(int i=1;i<=num19;i++){
fact *= i;
}
System.out.println("Factorial of number "+num19+" : "+fact);
break;
case 13 :
// power of x^n
System.out.println("Power of X^n ");
System.out.print("Enter number (X) : ");
int x = scan.nextInt();
System.out.print("Enter power of number (n) ");
int n = scan.nextInt();
int power_x =power(x,n);
System.out.println("Power of number "+x+"^"+n+" :"+power_x);
break;
case 14 :
// percentage
System.out.println(" Percentage operator ");
System.out.print("Enter number : ");
int mark = scan.nextInt();
System.out.print("Enter total number : ");
int t_mark = scan.nextInt();
int per = (mark*100)/t_mark;
System.out.println("Percentage : "+per+"%");
switch(per/10){
case 10:
case 9:
case 8:
System.out.println("A+ Grade ");
break;
case 7:
System.out.println("A Grade ");
break;
case 6:
System.out.println("B Grade ");
break;
case 5:
System.out.println("C Grade");
break;
case 4:
System.out.println("D Grade ");
break;
case 3:
System.out.println(" E Grade ");
break;
case 2:
case 1:
System.out.println(" F Grade ");
break;
default :
System.out.println("Wrong Input ");
break;
}
break;
default :
System.out.println("Wrong Input !!");
break;
}
}
}