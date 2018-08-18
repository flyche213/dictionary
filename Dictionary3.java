package Dictionary3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

//import Dictionary3.node;

import java.util.*;

public class Dictionary3 {

public static void main(String args[])throws Exception{
    
  
   
    //declaration of Hashtable
    Hashtable< String, String > hash = new Hashtable<  >();
    //declaration of BufferedReader
	//Dictionary3 dict1 = new Dictionary3();
    BufferedReader rd = new BufferedReader( new FileReader ("dictionary.txt"));
    String definition;
    String value;
    String key;
    //this loop will read all the lines from the text file and put it into the Hashtable.
    while ((definition = rd.readLine()) != null){
        String[] parts = definition.split("\\|");
		key = parts[0];
		//System.out.println("key: "+key);
		value = parts[2]; 
		//System.out.println("value: "+value);
		 System.out.println("Enter word");
		    Scanner scan = new Scanner (System.in);
		    String word1 = scan.nextLine();
		System.out.println(hash.put(key, value));
    }}
	
   
   // scan.close();

//    catch(FileNotFoundException e){
//        //This block will catch error when the file is not available in the location.
//}
//    catch (IOException e) {
//        //This block will catch error when there is any kind of input and ouput error.
//    }
    
    
    
//LinearProbing hash = new LinearProbing();
//hashTable h = new hashTable();

//Scanner rd = new Scanner(new File ("dictionary.txt"));


//Hashtable<Integer, String> hash = new Hashtable<Integer, String>();

//BufferedReader rd = new BufferedReader (new FileReader ("Filename.txt") );
//String line = "";

//String i ="";
//while (rd.hasNextLine())
//while( rd.hasNextLine())
//{
//i = rd.nextLine();
//System.out.println(i);
//String [] parts = i.split("\\|");

//node nd = new node (parts[0],parts[2]);
//System.out.println(parts[0]+ " "+ parts[1] + " "+ parts[2]);
//h.add(nd);
//rd.insert(i,line);

//S}ystem.out.println("Enter word");
//Scanner inputword = new Scanner("system.input");
//if(inputword = node.word){
//h.get(node.nd);




// for (String j; j < hash.size(); j++ ){
// System.out.print(hash.get(j));

//}}
//public String defi(String word)throws Exception{
//	hashTable dict = new hashTable();
//	
//   // rd.close();
//   // return(dict.get(word));
}
class LList{
node head;

LList (node hd){
head = hd;
}

void add(node nd){
if(head == null){
head = nd;
return;
}
node prev = head;
for(node hd = head; hd!=null; hd=hd.next)
prev = hd;
nd.next= null;
prev.next = nd;
}
}

class node{
String key;
String value;

node next;//created new node



node (){}
public node(String word, String definition){

this.key = word;
this.value = definition;

}

}



class hashTable{

LList arr[];// = new LList [10];


hashTable(){
arr = new LList [10];
for(int i=0;i<10;i++){
arr[i] = new LList (new node());
}
}
int maxSize = 10;
String position;

public int hash(String word){
int hash = 11;

for(int i = 0; i<word.length(); i++){
hash = hash * 37 + word.charAt(i);
}
return Math.abs(hash);



}

public void add(String word, String definition){

int position = hash(word) % arr.length;


while(arr[position] != null){
position = (position + 1) % arr.length;
}
node n = new node(word, definition);
arr[position]= new LList(n);
}
//public String get(String key){
//int position = hash(key);
//node head = arr[position].head;
//
//for(node hd=head;hd!=null;hd=hd.next)
//if(hd.key.equals(key))
//return hd.value;

}


