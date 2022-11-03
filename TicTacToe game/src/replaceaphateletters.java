import java.util.Scanner;

public class replaceaphateletters {
static void encode(String name, int num) {

// changed string
String newS = "";

// iterate for every characters
for (int i = 0; i < name.length(); ++i) {
// ASCII value
int val = name.charAt(i);
// store the duplicate
int dup = num;

// if k-th ahead character exceed 'z'
if (val + num > 126) {
num -= (126 - val);
num = num % 26;

newS += (char)(96 + num);
} else {
newS += (char)(val + num);
}

num = dup;
}

// print the new string
System.out.println(newS);
}


static Scanner sc =new Scanner(System.in);
public static void main(String[] args) {
// String str = "A";
// String alphate=sc.nextInt();
// String num = sc.nextInt();
// int k = 4;
int num = sc.nextInt();
String name = sc.nextLine();


// function call
encode(name, num);
}
}