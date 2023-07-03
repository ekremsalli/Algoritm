/*----------------------------------------------------------------
	FILE		: CSDArrayList.java
	AUTHOR		: Java-Aug-2022 Group
	LAST UPDATE	: 02.07.2023

	CSDArrayList class

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package tr.com.example.arraylist;

public class CSDArrayList<E> {
	
    private static final int DEFAULT_CAPACITY = 10;
    private E [] elements;
    private int numberOfElements;

    public CSDArrayList()
    {
        this(DEFAULT_CAPACITY);
    }

	public CSDArrayList(int initialCapacity)
    {
		if(initialCapacity<0)
			throw new IllegalArgumentException("Illegal Capacity:"+initialCapacity);
		else
			elements = (E[])(new Object[initialCapacity]);
    }

    public boolean add(E e)
    {
    	if(numberOfElements==elements.length) {
    		int newLength = elements.length*2;
    		E [] temp = elements;
    		elements = (E[])(new Object[newLength]);
    		
    	    int len = Math.min(temp.length, newLength);
    	    
            for (int i = 0; i < len; ++i)
                elements[i] = temp[i];
            
            elements[numberOfElements++] = e;
    		return true;
    	}else {
    		elements[numberOfElements++] = e;
            return true;
    	}
    }

    public void add(int index, E e)
    {
    	if(index<0 || index>numberOfElements)
    		throw new IndexOutOfBoundsException("Index is not found");
    	else {
    		
    	  	if(numberOfElements==elements.length) {
        		int newLength = elements.length*2;
        		E [] temp = elements;
        		elements = (E[])(new Object[newLength]);
        		
        	    int len = Math.min(temp.length, newLength);
        	    
                for (int i = 0; i < len; ++i)
                    elements[i] = temp[i];
                
          		for(int i=numberOfElements++;i>=index;i--)
        		{
        			elements[i+1] = elements[i];
        		}
        		
        		elements[index] = e;
        		
        	}else {
        		for(int i=numberOfElements++;i>=index;i--)
        		{
        			elements[i+1] = elements[i];
        		}
        		
        		elements[index] = e;
        		
        	}	
    	}
    }

    public int capacity()
    {
    	return elements.length;
    	
    }

    public void clear()
    {
    	this.numberOfElements = 0;
    	
    	elements = (E[])(new Object[capacity()]);
    }

    public void ensureCapacity(int newCapacity)
    {
		E [] temp = elements;
		elements = (E[])(new Object[newCapacity]);
		
	    int len = Math.min(temp.length, newCapacity);
	    
        for (int i = 0; i < len; ++i)
            elements[i] = temp[i];
    }

    public E get(int index)
    {
    	if(index<0 || index>numberOfElements)
    		throw new ArrayIndexOutOfBoundsException("Index is not found");
    	else
    		return elements[index];
    }

    public E remove(int index)
    {
    	if(index<0 || index>numberOfElements)
    		throw new IndexOutOfBoundsException("Index is not found");
    	else {
    		E temp = elements[index];
    		elements[index] = null;
    		
    		for(int i=index;i<numberOfElements;i++)
    			elements[i] = elements[i+1];
    		
    		numberOfElements--;
    		return temp;
    	}
    	
    	
        	
    }

    public E set(int index, E e)
    {
    	if(index<0 || index>numberOfElements)
    		throw new IndexOutOfBoundsException("Index is not found");
    	else {
    		E temp = elements[index];
    		elements[index] = e;
    		return temp;
    	}
    	
    	
    }

    public int size()
    {
        return numberOfElements;
    }

    public void trimToSize()
    {
		E [] temp = elements;
		elements = (E[])(new Object[size()]);
		
        for (int i = 0; i < size(); ++i)
            elements[i] = temp[i];
    }

    public String toString()
    {
    	if(size()==0)
    		return String.format("[%s]", "");
    	
    	String str = "";
    	for(int i=0;i<size();i++) {
    		if(elements[i]!=null) {
    			str += elements[i] + ",";
    		}
    	}
    	
    	return String.format("[%s]", str.substring(0, str.length()-1));
    }
    
}
