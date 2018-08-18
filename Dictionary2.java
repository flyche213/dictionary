package Dictionary2;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

import java.util.*;

public class Dictionary2 {
	
	public static void main(String args[])throws Exception{
		//LinearProbing hash = new LinearProbing();
		hashTable h = new hashTable();
		
		Scanner rd = new Scanner(new File ("dictionary.txt"));
		
			
			//Hashtable<Integer, String> hash = new Hashtable<Integer, String>();
		 
			//BufferedReader rd = new BufferedReader (new FileReader ("Filename.txt") );
			String line = "";
		
		String i ="";
		//while (rd.hasNextLine())
		while( rd.hasNextLine())
		{
			i = rd.nextLine();
			//System.out.println(i);
			String [] parts = i.split("\\|");
			
			node nd = new node (parts[0],parts[2]);
			//System.out.println(parts[0]+ " "+ parts[1] + " "+ parts[2]);
			h.add(nd);	
			//rd.insert(i,line);
		}
		System.out.println("Enter word");
		Scanner inputword = new Scanner("system.input");
		if(inputword = node.word){
			h.get(node.nd);
		}
		
		
		
		
//		for (String j; j < hash.size(); j++ ){
//			System.out.print(hash.get(j));
		
		}}







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

	class  node{
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
		
		public void  add(String word, String definition){
		
			int position = hash(word) % arr.length;
			
		
			while(arr[position] != null){
				position = (position + 1) % arr.length;
			}
			arr[position]= new node(word, definition);
		}
		public String get(String key){
			int position = hash(key);
			node head = arr[position].head;
			
			for(node hd=head;hd!=null;hd=hd.next)
				if(hd.key.equals(key))
					return hd.value;
			return null;
		}
		
	}
	
	

//	
//	class map{
//		private int maxSize;
//		private int currentSize;
//		
//		private String[] word;
//		private String[] definition;
//		
//		//constructor
//		public void HashTable(int capacity) {
//			currentSize = 0;
//			maxSize = capacity;
//			word = new String [maxSize];
//			definition = new String [maxSize];
//			
//		}
//		
//		private int hash(String word1){
//		
//			return word1.hashCode() % maxSize;
//		}
//		public int size(){
//			return currentSize;
//		}
//		
//		public void add(String word1, String definition1){
//			int tmp = hash(word1);
//			int i = tmp;
//			do{
//				if (word[i] == null){
//					word[i]= word1;
//					definition[i] = definition1;
//					currentSize ++;
//					return;
//					
//				}
//				if (word[i].equals(word)){
//					definition[i] = definition1;
//					return;
//				}
//				i = (i+1) % maxSize;
//				
//			}while (i!= tmp); 
//			
//		} // end insert
//		
//		public void remove(String word1){
//			if (!contains(word1))
//				return;
//			
//			int i = hash(word1);
//			while (!word1.equals(word[i]) ) 
//				i = i+1 % maxSize;
//			word[i] = definition[i] = null;
//			
//			for(i = (i+1) % maxSize; word[i] != null; i = i+1 % maxSize){
//				
//			String tmp1 = word[i];
//			String tmp2 = definition[i];
//			currentSize --;
//			insert(tmp1, tmp2); 
//			}
//			currentSize--;
//			
//		}//end remove
//		
//		public boolean contains(String word1){
//			return get(word1) != null;
//		}
//		
//		public String get(String word1){
//			int i = hash(word1);
//			while(word[i] != null){
//				if(word[i].equals(word))
//					return definition[i];
//				i = (i + 1) % maxSize;
//			}
//			
//			return null;
//		} // end get
//		
//	}
//	
//
//
