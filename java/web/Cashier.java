package web;


import java.util.ArrayList;
import java.util.LinkedList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Cashier{
    @RequestMapping("/report")
    int m3(String list){
        char[] a = list.toCharArray();
        int[] count = new int[26];
        for(int i=0;i<a.length;i++){
            int position = a[i] - 'A';
            count[position]++;
        }
        int total = 0;
        for(int i=1;i<count.length;i++){
            if(count[i-1] > 0){
                total = total + count[i];
            }
        }
        return total;
    }
//    @RequestMapping("/get-total")
//    String m1(String price){
//        try{
//            double p = Double.valueOf(price);
//            if (p >=100) return "" +p * 0.85;
//            return "" +p;
//        } catch(Exception e){
//            return "Invalid Price";
//        }
//    }
    @RequestMapping("/reverse")
    String m2(String data){
        char[] a = data.toCharArray();
        int left = 0,right = a.length-1;
        while (left<=right) {
            boolean x = isVowel(a[left]);
            boolean y = isVowel(a[right]);
            if(x == true && y==true){
                char t = a[left];
                a[left] = a[right];
                a[right] = t;
                left++; right--;
            }
            if(x == true && y == true){ }
            if(x == true && y==false){right--;}
            if(x == false && y==true){left++;}
            if(x == false && y==false){left++;right--; }
            if(left>right) break;
        }
        return new String(a);
    }
    boolean isVowel(char x){
        if(x=='A') return true;
        if(x=='E') return true;
        if(x=='I') return true;
        if(x=='O') return true;
        if(x=='U') return true;
        return false;
    }
}



//127.0.0.1:21000/get-total?price=150