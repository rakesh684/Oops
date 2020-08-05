package Oops;

public class dynamicArray {
	//creating array internally and kept it private .if someone wants to do somethings with this array then then can
	//do via class and object only

	private int data[];//this is only the reference not array.this is non-primitive and its default value is null.
    private int nextElementIndex;//intilize nextIndex 
	
	//so we need constructor
	public dynamicArray() {
		
		data = new int[5];//this will create new array internally
		nextElementIndex = 0;//giving its default value
	}
	//creatin getting size function
	public int size() {
		return nextElementIndex;
		
	}
	
	//creating isEmpty function
	public boolean isEmpty() {
		return nextElementIndex == 0;
	}
	
	//creating get function
	public int get(int i) {
		if(i>=nextElementIndex) {
			//throw error
			return -1;
		}
		return data[i];
	}
	public void set(int i,int ele) {
		if(i>=nextElementIndex) {
			//throw error
			return ;
		}
		data[i]=ele;
	}
	
	public void add(int ele) {
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		data[nextElementIndex]=ele;
		nextElementIndex++;
		
	}
	
	private void doubleCapacity() {
		int temp[]=data;
		data =new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
	
	public int removeLast() {
		if(nextElementIndex == 0) {
			return -1;
		}
		
		int temp =data[nextElementIndex-1];
		data[nextElementIndex-1]=0;
		nextElementIndex--;
		return temp;
	}
	
}
