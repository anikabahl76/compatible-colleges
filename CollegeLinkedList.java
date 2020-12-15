/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1022990
 */
public class CollegeLinkedList {
    private CollegeNode first = null;
    private int size = 0;
    
    CollegeLinkedList(){}

    public CollegeNode getFirst() {
        return first;
    }

    public void setFirst(CollegeNode first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }
    
    
    public void add(int index, College data)
    {
        CollegeNode newCollegeNode = new CollegeNode(data);
        if (index ==0)
        {
            newCollegeNode.next = first;
            first = newCollegeNode;
            size++;
        }
        else if (index>0&&index<=size)
        {
            int i=0;
            for(CollegeNode curr=first; curr !=null;curr=curr.next)
            {
               if (i==index-1)
               {
                  newCollegeNode.next = curr.next;
                  curr.next = newCollegeNode;
                  size++;
                  break;
               }
               i++;
            }
        }
        else
        {
            System.out.println("Out of Bounds");
        }
    }
    public void clear()
    {
        first = null;
        size = 0;
    }
    public void append(College data)
    {
        add(size, data);
    }
    
    public College remove(int index)
    {
        if (index <0 || index >= size)
        {
            System.out.println("Out of bounds");
        }
        if (index ==0)
        {
            College data = first.data;
            first = first.next;
            size--;
            return data;
        }
        else
        {
            int i = 0;
            for(CollegeNode curr = first;curr!=null;curr=curr.next)
            {
                if (i == index-1)
                {
                   College data = curr.next.data;
                   curr.next = curr.next.next;
                   size--;
                   return data;
                }
                i++;
            } 
        } 
        return null;
    }
    public CollegeNode get(int index)
    {
        int i = 0;
        //iterate a temp Node reference through the linked list
        for(CollegeNode curr=first;curr!=null;curr=curr.next)
        {
            if (i==index)
            {
                return curr;
            }
            i++;
        }
        return null;
    }
    
    public CollegeNode findNode(College key)
    {
        for(CollegeNode curr = first;curr!=null;curr=curr.next)
        {
            if (curr.data==key)
            {
                return curr;
            }
        }
        return null;
    }
    
    public int findIndex(College key)
    {
        int i = 0;
        for(CollegeNode curr = first;curr!=null;curr=curr.next)
        {
            if (curr.data==key)
            {
                return i;
            }
            i++;
        }
        return Integer.MIN_VALUE;
        
    }
    
    public void set(int index, College newData)
    {
        if (index <0 || index>= size)
        {
            System.out.println("Out of bounds");
        }
        else
        {
            int i =0;
            for (CollegeNode curr = first;curr!= null;curr=curr.next)
            {
                if (i == index)
                {
                    curr.data = newData;
                }
                i++;
            }
                    
        }
    }
}
