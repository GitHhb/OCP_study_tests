package _4_huiswerk_Klaas;

import java.util.Iterator;


/**
 * Created by klaas on 2/3/2016.
 */
public class ClassList<T extends Sortable> implements Iterable<T>,Iterator, Cloneable {
    int position = 0;
    int iterCount = 0;
    Object[] t = new Object[10];

    public void Push(T value)
    {

        if(position < t.length)
        {
            t[position] = value;
            position++;
        }
    }
    public T Pop()
    {
        if (position > 0)
        {
            position--;
        }
        return (T)t[position];
    }

    public void sort(){
        boolean isNotSorted = false;
        do{
            isNotSorted = false;
            for(int q = 0; q<position-1; q++){
                if(((T)t[q]).compareTo(((T)t[q+1])) > 0){
                    Object temp = t[q];
                    t[q] = t[q+1];
                    t[q+1] = temp;
                    isNotSorted = true;
                }
            }

        }while(isNotSorted);

    }

    // iterator spul
    // Iterable<T>
    @Override
    public Iterator<T> iterator() {
        return (ClassList<T>) this.clone();
    }
    @Override
    public boolean hasNext() {
        if(iterCount < t.length &&
                t[iterCount] != null)
        {
            return true;
        }
        return false;
    }
    @Override
    public Object next() {
        return (T)t[iterCount++];
    }

    @Override
    public ClassList<T> clone() {
        try {
            return (ClassList<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
        return null;
    }
}
