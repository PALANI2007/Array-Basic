// // import java.util.*;

// // public class main {
// //     public static void main(String[] args) {

// //         int arr[] = {-1,0,1,2,-1,-4};

// //         Arrays.sort(arr);

// //         for(int i=0;i<arr.length-2;i++){

// //             int left = i+1;
// //             int right = arr.length-1;

// //             while(left < right){

// //                 int sum = arr[i] + arr[left] + arr[right];

// //                 if(sum == 0){
// //                     System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
// //                     left++;
// //                     right--;
// //                 }
// //                 else if(sum < 0){
// //                     left++;
// //                 }
// //                 else{
// //                     right--;
// //                 }
// //             }
// //         }
// //     }
// // }



// // import java.util.*;
// // public class main
// // {
// //     public static void main(String args[])
// //     {
// //         Scanner sc=new Scanner(System.in);
// //         String a=sc.nextLine();
// //         char arr[]=a.toCharArray();
// //         int l=0;
// //         int r=arr.length-1;
// //         while(l<r){
// //             if(isvowel(arr[l]))
// //             {
// //                 l++;
// //             }
// //             else if(isvowel(arr[r]))
// //             {
// //                 r--;
// //             }
// //             else{
// //                 char temp=arr[l];
// //                 arr[l]=arr[r];
// //                 arr[r]=temp;
// //                 l++;
// //                 r--;
// //             }
// //         }
// //          for(char x:arr){
// //                 System.out.print(x);
// //             }
// //     }
// //             static boolean isvowel(char c)
// //             {
// //                 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
// //                 c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
// //                 {
// //                     return true;
// //                 }
// //                 return false;
// //             }
           
// //         }


// import java.util.*;

// public class main {

//     static void findSum(int arr[], int target, int index, ArrayList<Integer> list) {

//         if(target == 0) {
//             for(int x : list) {
//                 System.out.print(x + " ");
//             }
//             System.out.println();
//             return;
//         }

//         for(int i = index; i < arr.length; i++) {

//             if(arr[i] <= target) {

//                 list.add(arr[i]);                 // include
//                 findSum(arr, target-arr[i], i+1, list); 
//                 list.remove(list.size()-1);       // backtrack
//             }
//         }
//     }

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for(int i=0;i<n;i++) {
//             arr[i] = sc.nextInt();
//         }

//         int target = sc.nextInt();

//         ArrayList<Integer> list = new ArrayList<>();

//         findSum(arr, target, 0, list);
//     }
// }

// import java.util.*;

// public class main {
//     public static void main(String[] args) 
//     {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         obj.next();
//         String[] a = new String[n];
//         for(int i = 0;i<n;i++)
//         {
//             a[i] = obj.nextLine();
//         }
//         String T = obj.nextLine();

//         ArrayList<String> s = new ArrayList<>();
//         for(int i = 0;i<n;i++)
//         {
//             s.add(a[i]);
//         }
//         int c = 0;
//         for(int i = 0;i<s.size()-1;i++)
//         {
//             if((s.get(i).contains(T)))
//             {
//                 System.out.println(s.get(i));
//                 c++;
//                 break;
//             }
//         }
//         if(c==0)
//         {
//             System.out.println("Not found.");
//         }
       
//     }
// }

// import java.util.*;

// public class main {
//     public static void main(String[] args)
//     {
//         Scanner obj = new Scanner(System.in);

//         int n = obj.nextInt();
//         obj.nextLine();   // buffer clear

//         String[] a = new String[n];

//         for(int i = 0; i < n; i++)
//         {
//             a[i] = obj.nextLine();
//         }

//         String T = obj.nextLine();

//         int c = 0;

//         for(int i = 0; i < n; i++)
//         {
//             if(a[i].contains(T))
//             {
//                 System.out.println(a[i]);
//                 c++;
//                 break;
//             }
//         }

//         if(c == 0)
//         {
//             System.out.println("Not found.");
//         }
//     }
// }

// import java.util.*;

// public class main {
//     public static void main(String[] args)
//     {
//         Scanner obj = new Scanner(System.in);

//         int n = obj.nextInt();
//         obj.nextLine();   // buffer clear

//         String[] a = new String[n];

//         for(int i = 0; i < n; i++)
//         {
//             a[i] = obj.nextLine();
//         }

//         String T = obj.nextLine();

//         int c = 0;

//         for(int i = 0; i < n; i++)
//         {
//             if(a[i].contains(T))
//             {
//                 System.out.println(a[i]);
//                 c++;
//                 break;
//             }
//         }

//         if(c == 0)
//         {
//             System.out.println("Not found.");
//         }
//     }
// }

// import java.util.*;
// public class main 
// {
//     public static void main(String[] args)
//     {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         int a[] = new int[n];
//         for(int i = 0;i<n;i++)
//         {
//             a[i] = obj.nextInt();
//         }
//         int p;
//         //int res[] = new int[n];
//         for(int i = 0;i<n;i++)
//         {
//             p=1;
//             for(int j = 0;j<n;j++)
//             {
//                 if(i != j)
//                 {
//                     p *= a[j];
//                 }
//             }
//             System.out.print(p+" ");
//             // res[i] = p;
//             // p = 1;
//         }
//         // for(int i:res)
//         // {
//         //     System.out.print(i+" ");
//         // }
//     }
    
// }


// import java.util.*;

// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String[] arr = new String[n];
//         for(int i = 0 ; i < n ; i++){
//             arr[i] = sc.next();
//         }
//         String target = sc.next();

//         ArrayList<String> list = new ArrayList<>();

//         for(String x : arr){
//             list.add(x);
//         }
//         int found = 0;
//         for(String x : list){
//             if(x.contains(target)){
//                 System.out.print(x);
//                 found = 1;
//                 break;
//             }
//         }
//         if(found == 0){
//             System.out.print("Not found");
//         }
//     }
// }



// import java.util.*;

// public class main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine().toLowerCase();

//         boolean[] arr = new boolean[26];

//         for(int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);

//             if(c >= 'a' && c <= 'z') {
//                 arr[c - 'a'] = true;
//             }
//         }

//         boolean pangram = true;

//         for(int i = 0; i < 26; i++) {
//             if(arr[i] == false) {
//                 pangram = false;
//                 break;
//             }
//         }

//         if(pangram)
//             System.out.println("Pangram");
//         else
//             System.out.println("Not Pangram");
//     }
// }



// import java.util.*;

// public class main {
//     public static void main(String[] args) {

//         String s = "abcabcbb";

//         Set<Character> set = new HashSet<>();
//         List<String> res = new ArrayList<>();

//         int left = 0;
//         int max = 0;

//         for(int right = 0; right < s.length(); right++)
//         {
//             while(set.contains(s.charAt(right)))
//             {
//                 set.remove(s.charAt(left));
//                 left++;
//             }
//             set.add(s.charAt(right));

//             int len = right - left + 1;

//             if(len > max)
//             {
//                 max = len;
//                 res.clear();
//                 res.add(s.substring(left, right+1));
//             }
//             else if(len == max)
//             {
//                 res.add(s.substring(left, right+1));
//             }
//         }

//         System.out.println("Max Length: " + max);

//         for(String str : res)
//         {
//             System.out.println(str);
//         }
//     }
// }


// import java.util.*;
// public class main {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     String a=sc.nextLine();
//     int c=1;
//     for(int i=1;i<a.length();i++)
//     {
//         if(a.charAt(i)==a.charAt(i-1))
//         {
//             c++;
//         }
//         else{
//             System.out.print(a.charAt(i-1)+""+c);
//             c=1;
//         }
//     }
//     System.out.print(a.charAt(a.length()-1)+""+c);

// }
// }


// import java.util.*;
// public class main
// {
//     public static void main(String[] args)
//     {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         int[] h = new int[n];
//         for(int i = 0;i<n;i++)
//         {
//             h[i] = obj.nextInt();
//         }
//         int l = 0;
//         int r = n-1;
//         int lm = 0;
//         int rm = 0;
//         int w = 0;
//         while(l<r)
//         {
//             if(h[l]<=h[r])
//             {
//                 if(h[l]>=lm)
//                 {
//                     lm = h[l];
//                 }
//                 else
//                 {
//                     w += lm - h[l];
//                 }
//                 l++;
//             }
//             else
//             {
//                 if(h[r]>=rm)
//                 {
//                     rm = h[r];
//                 }
//                 else
//                 {
//                     w += rm - h[r];
//                 }
//                 r--;
//             }
//         }
//         System.out.println(w);
//     }
// }

// import java.util.*;
// public class main
// {
//     public static void main(String[] args)
//     {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         while(n>=10)
//         {
//             int sum = 0;
//             while(n>0)
//             {
//                 sum += n % 10;
//                 n /= 10;
//             }
//             n = sum;
//         }
//         if(n==1)
//         {
//             System.out.println("True");
//         }
//         else
//         {
//             System.out.println("False");
//         }
//     }
// }

// import java.util.*;
// public class main
// {
//     public static void main (String[] args)
//     {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         int a[] = new int[n];
//         for(int i = 0;i<n;i++)
//         {
//             a[i] = obj.nextInt();
//         }
//         for(int i = 0;i<n;i++)
//         {
//             if(ishappy(a[i]))
//             {
//                 System.out.print(a[i]+" ");
//             }
//         }
//     }
//     public static boolean ishappy(int n)
//     {
//         while(n!=1 && n!=4)
//         {
//             int sum = 0;
//             while(n>0)
//             {
//                 int d = n % 10;
//                 sum += d * d;
//                 n = n / 10;
//             }
//             n = sum;
//         }
//         return n==1;
//     }
// }


// import java.util.*;

// public class main{
// public static void main(String[] args){

// Scanner sc=new Scanner(System.in);
// String s=sc.next();

// String rev="";

// for(int i=s.length()-1;i>=0;i--){
// rev+=s.charAt(i);
// }

// if(s.equals(rev))
// System.out.println("YES");
// else
// System.out.println("NO");

// }
// }


// import java.util.*;

// public class main{
// public static void main(String[] args){

// Scanner sc=new Scanner(System.in);
// String s=sc.next();

// int count=0;

// for(int i=0;i<s.length();i++){

// char c=s.charAt(i);

// if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
//    c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
// count++;

// }

// System.out.println(count);
// }
// }


// import java.util.*;

// public class main{
// public static void main(String[] args){

// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int a[]=new int[n];

// for(int i=0;i<n;i++)
// a[i]=sc.nextInt();

// for(int i=0;i<n;i++){

// for(int j=i+1;j<n;j++){

// if(a[i]==a[j]){
// System.out.print(a[i]+" ");
// break;
// }

// }

// }

// }
// }

// import java.util.*;

// public class main{
// public static void main(String[] args){

// Scanner sc=new Scanner(System.in);

// int n=sc.nextInt();

// int sum=n*(n+1)/2;
// int arrsum=0;

// for(int i=0;i<n-1;i++){
// arrsum+=sc.nextInt();
// }

// System.out.println(sum-arrsum);
// }
// }

// import java.util.*;

// public class main{
// public static void main(String[] args){

// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int a[]=new int[n];

// for(int i=0;i<n;i++)
// a[i]=sc.nextInt();

// for(int i=0;i<n;i++){

// int count=1;

// if(a[i]==-1)
// continue;

// for(int j=i+1;j<n;j++){

// if(a[i]==a[j]){
// count++;
// a[j]=-1;
// }

// }

// System.out.println(a[i]+" "+count);

// }

// }
// }


import java.util.*;

public class main{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int a[]=new int[n];

for(int i=0;i<n;i++)
a[i]=sc.nextInt();

int index=0;

for(int i=0;i<n;i++){

if(a[i]!=0){
a[index]=a[i];
index++;
}

}

while(index<n){
a[index]=0;
index++;
}

for(int i=0;i<n;i++)
System.out.print(a[i]+" ");

}
}